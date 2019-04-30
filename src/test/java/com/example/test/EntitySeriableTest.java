/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:EntitySeriableTest.java  
 * Package Name:com.example.test 
 * Date:2019年4月26日上午10:39:56  
 * Copyright (c) 2019,  
 *  
*/

package com.example.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.pojo.User;

/**
 * ClassName:EntitySeriableTest Date: 2019年4月26日 上午10:39:56
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
public class EntitySeriableTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(EntitySeriableTest.class);

	@Test
	public void test() {
		User user = new User("John", 0, "KittyCat", true);
		JSONObject jsonObject = (JSONObject) JSON.toJSON(user);
		String jsonStr = JSON.toJSONString(jsonObject);
		LOGGER.debug(jsonStr);
	}
}
