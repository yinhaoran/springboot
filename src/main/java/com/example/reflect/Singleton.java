/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:Singleton.java  
 * Package Name:com.example.reflect 
 * Date:2019年4月25日下午4:24:32  
 * Copyright (c) 2019,  
 *  
*/

package com.example.reflect;

/**
 * ClassName:Singleton Date: 2019年4月25日 下午4:24:32
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
public class Singleton {

	/**
	 * 成员变量私有化
	 */
	private static Singleton singleton;

	/**
	 * Creates a new instance of Singleton.
	 */
	private Singleton() {

	}

	public static Singleton getSingleton() {
		/**
		 * 第一次检查singleton对象是否存在，不存在则创建
		 */
		if (singleton == null) {
			synchronized (Singleton.class) {
				/**
				 * 某个线程取得了锁，实例化对向前检查singleton对象在多线程中（）
				 */
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
