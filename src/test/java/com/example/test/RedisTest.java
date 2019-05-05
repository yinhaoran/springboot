/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:RedisTest.java  
 * Package Name:com.example.test 
 * Date:2019年4月30日下午3:55:06  
 * Copyright (c) 2019,  
 *  
*/

package com.example.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.util.RedisManageUtil;

/**
 * 
 * <pre>
 * ClassName:RedisTest 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON(可选).  
 * date: 2019年4月30日 下午3:55:42
 * </pre>
 * 
 * @author yin
 * @version
 * @since JDK 1.6
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(RedisTest.class);

	@Autowired
	private RedisManageUtil redisManageUtil;

	@Test
	public void testRedis() throws Exception {
		// Object obj =redisManageUtil.get("key");
		redisManageUtil.set("name", "yin");
		String name = (String) redisManageUtil.get("name");
		LOGGER.info(name);
	}
}
