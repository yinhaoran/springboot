/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:AbstractColdDrink.java  
 * Package Name:com.example.design.builder 
 * Date:2019年4月30日上午10:44:52  
 * Copyright (c) 2019,  
 *  
*/

package com.example.design.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ClassName:AbstractColdDrink Date: 2019年4月30日 上午10:44:52
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
abstract class AbstractColdDrink implements Item {

	@Autowired
	private Bottle bottle;
	
	@Override
	public Packing packing() {
		return bottle;
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
class Coke extends AbstractColdDrink {

	@Override
	public String name() {

		// TODO Auto-generated method stub
		return "Coke";
	}

	@Override
	public float price() {

		// TODO Auto-generated method stub
		return 3f;
	}

}

@Component
class Sprite extends AbstractColdDrink {

	@Override
	public String name() {
		return "Sprite";
	}

	@Override
	public float price() {
		return 2f;
	}

}
