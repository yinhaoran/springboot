/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:Packing.java  
 * Package Name:com.example.design.builder 
 * Date:2019年4月30日上午10:15:34  
 * Copyright (c) 2019,  
 *  
*/

package com.example.design.builder;

import org.springframework.stereotype.Component;

/**
 * ClassName:Packing Date: 2019年4月30日 上午10:15:34
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
public interface Packing {
	/**
	 * 
	 * pack:(食物打包). <br/>  
	 *
	 * @return  
	 * @since JDK 1.8
	 */
	public String pack();
}

/**
 * 
 * ClassName:Wrapper Function: TODO 纸盒打包
 */
@Component
class Wrapper implements Packing {

	@Override
	public String pack() {

		// TODO Auto-generated method stub
		return "Wrapper";
	}

}

/**
 * 
 * ClassName:Bottle Function: TODO 瓶子打包
 * 
 */
@Component
class Bottle implements Packing {

	@Override
	public String pack() {

		// TODO Auto-generated method stub
		return "Bottle";
	}

}
