/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:AbstractLogger.java  
 * Package Name:com.example.design.chain 
 * Date:2019年5月8日上午11:07:03  
 * Copyright (c) 2019,  
 *  
*/

package com.example.design.chain;

/**
 * ClassName:AbstractLogger Date: 2019年5月8日 上午11:07:03
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
public abstract class AbstractLogger {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	public static int WARN = 4;

	protected int level;

	protected AbstractLogger nextLogger;

	public AbstractLogger getNextLogger() {
		return nextLogger;
	}

	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void loadMessage(int level, String message) {
		if (this.level <= level) {
			write(message);
		}
		if (nextLogger != null) {
			nextLogger.loadMessage(level, message);
		}
	}

	public abstract void write(String message);

}
