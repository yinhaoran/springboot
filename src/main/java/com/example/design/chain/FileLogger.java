/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:FileLogger.java  
 * Package Name:com.example.design.chain 
 * Date:2019年5月8日上午11:22:51  
 * Copyright (c) 2019,  
 *  
*/

package com.example.design.chain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * ClassName:FileLogger Date: 2019年5月8日 上午11:22:51
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
@Component
public class FileLogger extends AbstractLogger {

	private static final Logger LOGGER = LoggerFactory.getLogger(FileLogger.class);

	@Override
	public void write(String message) {
		LOGGER.info("Standard File Logger: {}", message);
	}

}
