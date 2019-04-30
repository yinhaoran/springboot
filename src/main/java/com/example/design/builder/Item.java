/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:Item.java  
 * Package Name:com.example.design.builder 
 * Date:2019年4月30日上午10:14:38  
 * Copyright (c) 2019,  
 *  
*/

package com.example.design.builder;

/**
 * ClassName:Item Date: 2019年4月30日 上午10:14:38
 * 
 * 食物条目和食物包装的接口
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
public interface Item {
	/**
	 * 
	 * name:(食物名称). <br/>
	 *
	 * @return
	 * @since JDK 1.8
	 */
	public String name();

	/**
	 * 
	 * packing:(打包食物). <br/>
	 *
	 * @return
	 * @since JDK 1.8
	 */
	public Packing packing();

	/**
	 * 
	 * price:(食物价格). <br/>
	 *
	 * @return
	 * @since JDK 1.8
	 */
	public float price();
}


