/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:SimpleProxy.java  
 * Package Name:com.example.reflect 
 * Date:2019年4月25日上午11:08:12  
 * Copyright (c) 2019,  
 *  
*/

package com.example.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ClassName:SimpleProxy Date: 2019年4月25日 上午11:08:12
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
public class SimpleProxy implements InvocationHandler {
	private Object obj;
	private Advice advice;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public Advice getAdvice() {
		return advice;
	}

	public void setAdvice(Advice advice) {
		this.advice = advice;
	}

	public Object bind(Object obj, Advice advice) {
		this.obj = obj;
		this.advice = advice;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), 
				obj.getClass().getInterfaces(), 
				this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		advice.before();
		Object result = method.invoke(obj, args);
		advice.after();
		return result;
	}

}
