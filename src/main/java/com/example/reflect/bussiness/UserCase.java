/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:UserCase.java  
 * Package Name:com.example.reflect.bussiness 
 * Date:2019年4月25日下午1:47:23  
 * Copyright (c) 2019,  
 *  
*/

package com.example.reflect.bussiness;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName:UserCase Date: 2019年4月25日 下午1:47:23
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
@Target(value = ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UserCase {
	public int id();

	public String description() default "no description";
}
