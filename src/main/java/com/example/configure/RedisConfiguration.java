/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:RedisConfiguration.java  
 * Package Name:com.example.configure 
 * Date:2019年4月29日下午6:22:34  
 * Copyright (c) 2019,  
 *  
*/

package com.example.configure;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * ClassName:RedisConfiguration Date: 2019年4月29日 下午6:22:34
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
//@Configuration
//@EnableCaching
public class RedisConfiguration extends CachingConfigurerSupport {

	private static final Logger LOGGER = LoggerFactory.getLogger(RedisConfiguration.class);

	@Override
	public KeyGenerator keyGenerator() {
		return new KeyGenerator() {
			@Override
			public Object generate(Object target, Method method, Object... params) {
				StringBuilder sb = new StringBuilder();
				sb.append(target.getClass().getName()).append(method.getName());
				for (Object param : params) {
					sb.append(param.toString());
				}
				LOGGER.info("调用Redis 缓存kEY:" + sb.toString());
				return sb.toString();
			}
		};
	}

	//@Bean
	public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory) {
		//// 解决键、值序列化问题
		StringRedisTemplate template = new StringRedisTemplate(factory);
		Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
		ObjectMapper om = new ObjectMapper();
		om.setVisibility(com.fasterxml.jackson.annotation.PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
		om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
		jackson2JsonRedisSerializer.setObjectMapper(om);
		template.setValueSerializer(jackson2JsonRedisSerializer);
		template.afterPropertiesSet();
		return template;
	}

}
