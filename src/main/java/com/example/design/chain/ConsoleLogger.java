/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:ConsoleLogger.java  
 * Package Name:com.example.design.chain 
 * Date:2019年5月8日上午11:18:00  
 * Copyright (c) 2019,  
 *  
*/

package com.example.design.chain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * ClassName:ConsoleLogger Date: 2019年5月8日 上午11:18:00
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
@Component
public class ConsoleLogger extends AbstractLogger {
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ConsoleLogger.class);

	
	@Override
	public void write(String message) {
		LOGGER.info("Standard Console Logger: {}",message);
	}

}
