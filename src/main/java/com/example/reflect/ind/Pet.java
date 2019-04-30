/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:Pet.java  
 * Package Name:com.example.reflect.ind 
 * Date:2019年4月25日下午6:34:50  
 * Copyright (c) 2019,  
 *  
*/

package com.example.reflect.ind;

/**
 * ClassName:Pet Date: 2019年4月25日 下午6:34:50
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
public class Pet extends Individual {

	public Pet() {
		super();
	}

	public Pet(String name) {
		super(name);
	}

}

class Cat extends Pet {

	public Cat() {

		super();
		// TODO Auto-generated constructor stub

	}

	public Cat(String name) {

		super(name);
		// TODO Auto-generated constructor stub

	}

}

class Dog extends Pet {

	public Dog() {

		super();
		// TODO Auto-generated constructor stub

	}

	public Dog(String name) {

		super(name);
		// TODO Auto-generated constructor stub

	}

}