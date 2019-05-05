/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:RedisManageUtil.java  
 * Package Name:com.example.util 
 * Date:2019年4月30日下午2:20:42  
 * Copyright (c) 2019,  
 *  
*/

package com.example.util;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * ClassName:RedisManageUtil Date: 2019年4月30日 下午2:20:42
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
@Component
public class RedisManageUtil {

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;

	public boolean expire(String key, long time) {
		if (time > 0) {
			redisTemplate.expire(key, time, TimeUnit.SECONDS);
		}
		return false;
	}

	public long getExpireTime(String key) {
		return redisTemplate.getExpire(key);
	}

	public boolean set(String key, Object value) throws Exception {
		try {
			redisTemplate.opsForValue().set(key, value);
		} catch (Exception e) {
			throw new Exception(e);
		}
		return true;
	}

	/**
	 * 
	 * 普通缓存获取
	 * 
	 * @param key
	 *            键
	 * 
	 * @return 值
	 * 
	 */
	public Object get(String key) {
		return key == null ? null : redisTemplate.opsForValue().get(key);
	}
}
