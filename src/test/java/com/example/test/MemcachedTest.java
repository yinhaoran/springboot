/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:MemcachedTest.java  
 * Package Name:com.example.test 
 * Date:2019年4月28日上午9:35:13  
 * Copyright (c) 2019,  
 *  
*/

package com.example.test;

import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import net.spy.memcached.CASResponse;
import net.spy.memcached.CASValue;
import net.spy.memcached.MemcachedClient;

/**
 * ClassName:MemcachedTest Date: 2019年4月28日 上午9:35:13
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MemcachedTest {

	private static final int THREAD_POOL_MAX_NUM = 10;

	private static final Logger LOGGER = LoggerFactory.getLogger(MemcachedTest.class);

	@Autowired
	private MemcachedClient memcachedClient;

	// private static MemcachedClient memcachedClient = null;
	// static {
	// try {
	// memcachedClient = new MemcachedClient(new InetSocketAddress("localhost",
	// 11211));
	// } catch (IOException e) {
	// }
	// }

	@Test
	public void test() throws InterruptedException, ExecutionException {
		memcachedClient.set("name", 7845, 1);
		ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("MEMCACHED-TEST-THREAD-%d").build();
		BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<Runnable>(5);
		ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(5, THREAD_POOL_MAX_NUM, 30, TimeUnit.SECONDS,
				workQueue, threadFactory);
		for (int i = 0; i < THREAD_POOL_MAX_NUM; i++) {
			Future<String> result = poolExecutor.submit(new MemcacheOperateTask());
			LOGGER.info(result.get());
		}
	}

	private class MemcacheOperateTask implements Callable<String> {

		private static final int LOOPTIMES = 10;

		@Override
		public String call() throws Exception {
			int times = 0;
			int successTimes = 0;
			while (times < LOOPTIMES) {
				times++;
				CASValue<Object> uniqueValue = memcachedClient.gets("name");
				CASResponse response = memcachedClient.cas("name", uniqueValue.getCas(),
						UUID.randomUUID().toString());
				LOGGER.info("KEY:name,VALUE:" + memcachedClient.get("name"));
				if (CASResponse.OK.equals(response)) {
					successTimes++;
				}
				String threadName = Thread.currentThread().getName();
				LOGGER.info("线程{} 第{}次更新旧值，result：{}", threadName, times, response);
			}
			if (successTimes < LOOPTIMES) {
				LOGGER.info("更新失败次数:{}", LOOPTIMES - successTimes);
				return "N";
			}
			return "Y";
		}
	}

}
