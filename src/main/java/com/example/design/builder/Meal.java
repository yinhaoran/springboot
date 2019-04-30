/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:Meal.java  
 * Package Name:com.example.design.builder 
 * Date:2019年4月30日上午10:54:31  
 * Copyright (c) 2019,  
 *  
*/

package com.example.design.builder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ClassName:Meal Date: 2019年4月30日 上午10:54:31
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
public class Meal {

	private static final Logger LOGGER = LoggerFactory.getLogger(Meal.class);

	private List<Item> items = new ArrayList<Item>();

	/**
	 * 
	 * addItems:(添加食物). <br/>  
	 *
	 * @param item  
	 * @since JDK 1.8
	 */
	public void addItems(Item item) {
		items.add(item);
	}

	/**
	 * 
	 * getCost:(获取食物成本). <br/>  
	 *
	 * @return  
	 * @since JDK 1.8
	 */
	public float getCost() {
		float cost = 0f;
		Iterator<Item> iterator = items.iterator();
		while (iterator.hasNext()) {
			float singleCost = iterator.next().price();
			cost += singleCost;
		}
		return cost;
	}

	/**
	 * 
	 * showItems:(打印食物条目). <br/>  
	 *  
	 * @since JDK 1.8
	 */
	public void showItems() {
		Iterator<Item> iterator = items.iterator();
		while (iterator.hasNext()) {
			String info = iterator.next().toString();
			LOGGER.info(info);
		}
	}

}
