/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:DistributedLockTest.java  
 * Package Name:com.example.test 
 * Date:2019年5月2日下午7:59:41  
 * Copyright (c) 2019,  
 *  
*/

package com.example.test;
/**  
 * ClassName:DistributedLockTest   
 * Date:     2019年5月2日 下午7:59:41  
 * @version    
 * @author   yin
 * @since    JDK 1.8  
 * @see       
 */

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

import org.apache.tomcat.util.threads.ThreadPoolExecutor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.service.SecKillService;
import com.google.common.util.concurrent.ThreadFactoryBuilder;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DistributedLockTest {

	private final int corePoolSize = 5;

	private final int maximumPoolSize = 10;

	private final long keepAliveTime = 60L;

	private final ThreadFactory threadFactory = new ThreadFactoryBuilder().build();
	
	private final int EXCUTE_TIMES = 500;

	@Autowired
	private SecKillService secKillService;

	@Test
	public void test() {
		ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
				corePoolSize, 
				maximumPoolSize, 
				keepAliveTime,
				TimeUnit.SECONDS, 
				new LinkedBlockingQueue<Runnable>(), 
				threadFactory);
		for (int i = 0; i < EXCUTE_TIMES; i++) {
			poolExecutor.execute(new ThreadA(secKillService));
		}
	}
}

class ThreadA implements Runnable {
	private SecKillService secKillService;

	public ThreadA(SecKillService secKillService) {
		this.secKillService = secKillService;
	}

	@Override
	public void run() {
		secKillService.secKill();
	}

}
