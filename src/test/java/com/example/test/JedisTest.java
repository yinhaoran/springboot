/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:JedisTest.java  
 * Package Name:com.example.test 
 * Date:2019年5月2日下午2:22:56  
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

import com.example.util.JedisPoolUtil;

import redis.clients.jedis.Jedis;

/**
 * ClassName:JedisTest Date: 2019年5月2日 下午2:22:56
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JedisTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(JedisTest.class);

	@Autowired
	private JedisPoolUtil jedisPoolUtil;

	@Test
	public void fun() {
		Jedis jedis = jedisPoolUtil.getJedis();
		jedis.set("num", "1");
		LOGGER.info(jedis.get("num"));
	}
}
