/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:SalaryImpl.java  
 * Package Name:com.example.reflect.bussiness 
 * Date:2019年4月25日上午11:59:59  
 * Copyright (c) 2019,  
 *  
*/

package com.example.reflect.bussiness;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ClassName:SalaryImpl Date: 2019年4月25日 上午11:59:59
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
public class SalaryImpl implements ISalary {

	private static final Logger LOGGER = LoggerFactory.getLogger(SalaryImpl.class);

	@Override
	public void doSalary() {
		LOGGER.info("调用计算工资接口实现类 {} 方法", Method.class.getName());
	}

}
