/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:JedisPoolUtil.java  
 * Package Name:com.example.util 
 * Date:2019年5月2日下午2:17:43  
 * Copyright (c) 2019,  
 *  
*/

package com.example.util;
/**  
 * ClassName:JedisPoolUtil   
 * Date:     2019年5月2日 下午2:17:43  
 * @version    
 * @author   yin
 * @since    JDK 1.8  
 * @see       
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Component
public class JedisPoolUtil {
	@Autowired
	private JedisPool jedisPool;

	public Jedis getJedis() {
		return jedisPool.getResource();
	}

	public void release(Jedis jedis) {
		if (jedis != null) {
			jedis.close();
		}
	}

}
