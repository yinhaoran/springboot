/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:AbstractBurger.java  
 * Package Name:com.example.design.builder 
 * Date:2019年4月30日上午10:44:06  
 * Copyright (c) 2019,  
 *  
*/

package com.example.design.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * ClassName:Burger Function: TODO 汉堡抽象类使用一部分食物的方法 Reason: TODO ADD REASON(可选).
 * date: 2019年4月30日 上午10:24:09
 * 
 * @author yin
 * @version
 * @since JDK 1.6
 */
abstract class AbstractBurger implements Item {
	
	@Autowired
	private Wrapper wrapper;

	@Override
	public Packing packing() {
		return wrapper;
	}

	/**
	 * 
	 * price:(食物价格). <br/>
	 *
	 * @return
	 * @since JDK 1.8
	 */
	@Override
	public abstract float price();
	
	@Override
	public String toString() {
		return "Food:" + name() + " [packing()=" + packing().pack() + ", price()=" + price() + "]";
	}

}

@Component
class VegBurger extends AbstractBurger {

	@Override
	public String name() {
		return "VegBurger";
	}

	@Override
	public float price() {
		return 15;
	}

}

@Component
class ChickenBurger extends AbstractBurger {

	@Override
	public String name() {
		return "ChickenBurger";
	}

	@Override
	public float price() {
		return 25;
	}

}