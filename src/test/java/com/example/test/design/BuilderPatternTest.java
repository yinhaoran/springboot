/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:BuilderPatternTest.java  
 * Package Name:com.example.test.design 
 * Date:2019年4月30日上午11:28:29  
 * Copyright (c) 2019,  
 *  
*/

package com.example.test.design;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.design.builder.Meal;
import com.example.design.builder.MealBuilder;

/**
 * ClassName:BuilderPatternTest Date: 2019年4月30日 上午11:28:29
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BuilderPatternTest {

	@Autowired
	private MealBuilder mealBuilder;

	@Test
	public void testName() throws Exception {
		Meal vegMeal = mealBuilder.prepareVegMeal();
		vegMeal.showItems();
	}
}
