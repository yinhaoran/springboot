/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:ReflectTest.java  
 * Package Name:com.example.reflect 
 * Date:2019年4月24日下午10:24:45  
 * Copyright (c) 2019,  
 *  
*/

package com.example.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.reflect.bussiness.ISalary;
import com.example.reflect.bussiness.PasswordUtils;
import com.example.reflect.bussiness.SalaryImpl;
import com.example.reflect.bussiness.UserCase;

/**
 * ClassName:ReflectTest Date: 2019年4月24日 下午10:24:45
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
@SuppressWarnings("unused")
public class ReflectTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(ReflectTest.class);

	@SuppressWarnings("unchecked")
	@Test
	public void testName() throws Exception {
		/**
		 * 获取类的相关信息
		 */
		Class<Main> clazz = (Class<Main>) Class.forName("com.example.reflect.Main");
		String name = clazz.getName();
		LOGGER.info(name);
		/**
		 * 动态调用类的方法
		 */
		Method method = clazz.getMethod("test", Integer.class);
		String methodName = method.getName();
		LOGGER.info(methodName);
		/**
		 * 实例化
		 */
		Main obj = clazz.getConstructor().newInstance();
		method.invoke(obj, 5);
	}

	@Test
	public void getAllMethodName() throws Exception {
		@SuppressWarnings("unchecked")
		Class<Main> clazz = (Class<Main>) Class.forName("com.example.reflect.Main");
		Method[] methods = clazz.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			String methodName = method.getName();
			LOGGER.debug("方法名为：{}", methodName);
			Class<?> returnType = method.getReturnType();
			LOGGER.debug("返回类型为：{}", returnType.getName());
			Class<?>[] paramers = method.getParameterTypes();
			for (Class<?> param : paramers) {
				LOGGER.debug("参数类型为：{}", param.getName());
			}
		}
		Field[] fields = clazz.getFields();
		for (Field field : fields) {
			Integer num = field.getModifiers();
			Class<?> fieldType = field.getType();
			String typeName = fieldType.getName();
			String fieldName = field.getName();
			LOGGER.debug("声明变量名称为：{}，类型为：{}", fieldName, typeName);
		}
	}

	@Test
	public void testProxy() throws Exception {
		SimpleProxy proxy = new SimpleProxy();
		ISalary iSalary = (ISalary) proxy.bind(new SalaryImpl(), new TimeAdvice());
		iSalary.doSalary();
	}

	public void trackUseCases(List<Integer> useCases, Class<?> clazz) {
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			UserCase useCase = method.getAnnotation(UserCase.class);
			if (useCase != null) {
				LOGGER.debug("Found Use Case: " + useCase);
				useCases.remove(new Integer(useCase.id()));
			}
		}
		for (int method : useCases) {
			LOGGER.debug("Warning:Missing user case-" + method);
		}
	}

	@Test
	public void userCaseTest() throws Exception {
		List<Integer> useCases = new ArrayList<Integer>();
		Collections.addAll(useCases, 1, 2, 3);
		trackUseCases(useCases, PasswordUtils.class);
	}

}

class Main {

	public String firstName;
	public String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Main() {

	}

	public static void main(String[] args) {
		System.out.println("执行main方法");
	}

	public void test(Integer num) {
		System.out.println("执行test方法");
	}
}