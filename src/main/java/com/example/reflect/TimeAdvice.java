/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:TimeAdvice.java  
 * Package Name:com.example.reflect 
 * Date:2019年4月25日上午11:55:15  
 * Copyright (c) 2019,  
 *  
*/

package com.example.reflect;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ClassName:TimeAdvice Date: 2019年4月25日 上午11:55:15
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
public class TimeAdvice implements Advice {

	private static final Logger LOGGER = LoggerFactory.getLogger(TimeAdvice.class);

	long startTime;
	long endTime;

	@Override
	public void before() {
		startTime = System.nanoTime();
		LOGGER.info("开始时间为{}", new Date().toString());

	}

	@Override
	public void after() {
		endTime = System.nanoTime();
		LOGGER.info("结束时间为{}", new Date().toString());
	}

}
