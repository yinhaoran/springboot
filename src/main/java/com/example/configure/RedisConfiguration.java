/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:RedisConfiguration.java  
 * Package Name:com.example.configure 
 * Date:2019年4月29日下午6:22:34  
 * Copyright (c) 2019,  
 *  
*/

package com.example.configure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

import redis.clients.jedis.JedisPool;

/**
 * ClassName:RedisConfiguration Date: 2019年4月29日 下午6:22:34
 * 
 * 配置Redis客户端序列化方式
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
@Configuration
public class RedisConfiguration {

	private static final Logger LOGGER = LoggerFactory.getLogger(RedisConfiguration.class);

	@Bean
	public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory connectionFactory) {
		RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String, Object>();
		ObjectMapper objectMapper = new ObjectMapper();
		StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
		/**
		 * 设置连接工厂
		 */
		redisTemplate.setConnectionFactory(connectionFactory);
		Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<Object>(
				Object.class);
		objectMapper.setVisibility(PropertyAccessor.ALL, Visibility.ANY);
		jackson2JsonRedisSerializer.setObjectMapper(objectMapper);
		/**
		 * KEY 采用String序列化形式
		 */
		redisTemplate.setKeySerializer(stringRedisSerializer);
		/**
		 * HASHKEY 采用String序列化形式
		 */
		redisTemplate.setHashKeySerializer(stringRedisSerializer);
		/**
		 * VALUE 采用Jackson序列化形式
		 */
		redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);
		/**
		 * HASHVALUE 采用Jackson序列化形式
		 */
		redisTemplate.setHashValueSerializer(jackson2JsonRedisSerializer);
		redisTemplate.afterPropertiesSet();
		LOGGER.info("Redis 客户端序列化配置完成");
		return redisTemplate;
	}

	@Bean
	public JedisPool jedisPool() {
		return new JedisPool();
	}

}
