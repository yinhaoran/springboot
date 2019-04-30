/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:MealBuilder.java  
 * Package Name:com.example.design.builder 
 * Date:2019年4月30日上午11:03:37  
 * Copyright (c) 2019,  
 *  
*/

package com.example.design.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ClassName:MealBuilder Date: 2019年4月30日 上午11:03:37
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
@Component
public class MealBuilder {

	@Autowired
	private VegBurger vegBurger;

	@Autowired
	private ChickenBurger chickenBurger;

	@Autowired
	private Coke coke;

	@Autowired
	private Sprite sprite;

	/**
	 * 
	 * prepareVegMeal:(建造蔬菜套餐). <br/>
	 *
	 * @return
	 * @since JDK 1.8
	 */
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItems(vegBurger);
		meal.addItems(coke);
		return meal;
	}

	/**
	 * 
	 * prepareChickenMeal:(建造鸡肉套餐). <br/>
	 *
	 * @return
	 * @since JDK 1.8
	 */
	public Meal prepareChickenMeal() {
		Meal meal = new Meal();
		meal.addItems(chickenBurger);
		meal.addItems(sprite);
		return meal;
	}
}
