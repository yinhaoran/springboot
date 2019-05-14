/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:ChainPatternTest.java  
 * Package Name:com.example.test.design 
 * Date:2019年5月8日上午11:25:07  
 * Copyright (c) 2019,  
 *  
*/

package com.example.test.design;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.design.chain.AbstractLogger;
import com.example.design.chain.ConsoleLogger;
import com.example.design.chain.ErrorLogger;
import com.example.design.chain.FileLogger;

/**
 * ClassName:ChainPatternTest Date: 2019年5月8日 上午11:25:07
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ChainPatternTest {
	@Autowired
	private ConsoleLogger consoleLogger;

	@Autowired
	private ErrorLogger errorLogger;

	@Autowired
	private FileLogger fileLogger;

	private AbstractLogger getChainLoggers() {
		consoleLogger.setLevel(AbstractLogger.INFO);
		errorLogger.setLevel(AbstractLogger.ERROR);
		fileLogger.setLevel(AbstractLogger.DEBUG);
		errorLogger.setNextLogger(consoleLogger);
		consoleLogger.setNextLogger(fileLogger);
		return errorLogger;
	}

	@Test
	public void test() {
		AbstractLogger loggerChain = getChainLoggers();
		loggerChain.loadMessage(AbstractLogger.INFO, "Hello World");
		loggerChain.loadMessage(AbstractLogger.ERROR, "Hello World");
	}
}
