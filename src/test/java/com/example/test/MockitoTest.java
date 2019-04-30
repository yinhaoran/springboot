/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:MockitoTest.java  
 * Package Name:com.example.test 
 * Date:2019年4月26日下午3:00:46  
 * Copyright (c) 2019,  
 *  
*/

package com.example.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.LinkedList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.pojo.User;

/**
 * ClassName:MockitoTest Date: 2019年4月26日 下午3:00:46
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
public class MockitoTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(MockitoTest.class);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		@SuppressWarnings("unchecked")
		List<String> mockedList = mock(List.class);
		boolean flag = mockedList.add("one");
		mockedList.clear();
		verify(mockedList).add("one");
		verify(mockedList).clear();
		// fail("Not yet implemented");
	}

	@Test
	public void mockTest() {
		@SuppressWarnings("rawtypes")
		LinkedList mockedList = mock(LinkedList.class);
		when(mockedList.get(0)).thenReturn("first");
		Assert.assertEquals(mockedList.get(0), "first");
		System.out.println(mockedList.get(999));
	}

	@Test
	public void mockUser() {
		User user = mock(User.class);
		user.setNickName("KittyCat");
		verify(user).setNickName("KittyCat");
	}

	@Test(expected = RuntimeException.class)
	public void consecutiveCalls() {
		@SuppressWarnings("rawtypes")
		List mockList = mock(List.class);
		// 模拟连续调用返回期望值，如果分开，则只有最后一个有效
		when(mockList.get(0)).thenReturn(0);
		when(mockList.get(0)).thenReturn(1);
		when(mockList.get(0)).thenReturn(2);
		when(mockList.get(1)).thenReturn(0).thenReturn(1).thenThrow(new RuntimeException());
		assertEquals(2, mockList.get(0));
		assertEquals(2, mockList.get(0));
		assertEquals(0, mockList.get(1));
		assertEquals(1, mockList.get(1));
		// 第三次或更多调用都会抛出异常
		mockList.get(1);
	}

}
