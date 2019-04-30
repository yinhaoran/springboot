/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:Advice.java  
 * Package Name:com.example.reflect 
 * Date:2019年4月25日上午11:24:45  
 * Copyright (c) 2019,  
 *  
*/

package com.example.reflect;

/**
 * ClassName:Advice Date: 2019年4月25日 上午11:24:45
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
public interface Advice {
	/**
	 * 
	 * before:(方法执行前动作). <br/>
	 * 
	 * @since JDK 1.8
	 */
	public void before();

	/**
	 * 
	 * after:(方法执行后动作). <br/>
	 * 
	 * @since JDK 1.8
	 */
	public void after();
}
