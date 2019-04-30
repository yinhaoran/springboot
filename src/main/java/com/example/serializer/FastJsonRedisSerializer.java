/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:FastJsonRedisSerializer.java  
 * Package Name:com.example.serializer 
 * Date:2019年4月29日下午6:09:22  
 * Copyright (c) 2019,  
 *  
*/

package com.example.serializer;

import java.nio.charset.Charset;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * ClassName:FastJsonRedisSerializer Date: 2019年4月29日 下午6:09:22
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
public class FastJsonRedisSerializer<T> implements RedisSerializer<T> {

	private static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

	private Class<T> clazz;

	public FastJsonRedisSerializer(Class<T> clazz) {
		super();
		this.clazz = clazz;
	}

	@Override
	public byte[] serialize(T t) throws SerializationException {
		if (t == null) {
			return new byte[0];
		}
		return JSON.toJSONString(t, SerializerFeature.WriteClassName).getBytes();
	}

	@Override
	public T deserialize(byte[] bytes) throws SerializationException {
		if (ArrayUtils.isEmpty(bytes)) {
			return null;
		}
		String str = new String(bytes, DEFAULT_CHARSET);
		return JSON.parseObject(str, clazz);
	}

}
