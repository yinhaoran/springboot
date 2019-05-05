/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:SecKillService.java  
 * Package Name:com.example.service 
 * Date:2019年5月2日下午7:46:22  
 * Copyright (c) 2019,  
 *  
*/

package com.example.service;
/**  
 * ClassName:SecKillService   
 * TODO 模拟秒杀服务
 * Date:     2019年5月2日 下午7:46:22  
 * @version    
 * @author   yin
 * @since    JDK 1.8  
 * @see       
 */

import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.lock.DistrubutedLock;

@Component
public class SecKillService {
	
	private AtomicInteger atomicInteger = new AtomicInteger(500);
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SecKillService.class);

	@Autowired
	private DistrubutedLock distrubutedLock;

	/**
	 * 
	 * secKill:(秒杀). <br/>
	 * 
	 * @since JDK 1.8
	 */
	public void secKill() {
		String indentifer = distrubutedLock.lockWithTimeOut("resource", 5000, 1000);
		LOGGER.info(Thread.currentThread().getName() + "GET THE LOCK");
		LOGGER.info(String.valueOf(atomicInteger.decrementAndGet()));
		distrubutedLock.releaseLock("resource", indentifer);
	}
}
