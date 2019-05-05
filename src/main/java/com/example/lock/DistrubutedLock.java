/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:DistrubutedLock.java  
 * Package Name:com.example.lock 
 * Date:2019年5月2日下午7:10:13  
 * Copyright (c) 2019,  
 *  
*/

package com.example.lock;
/**  
 * ClassName:DistrubutedLock   
 * Date:     2019年5月2日 下午7:10:13  
 * @version    
 * @author   yin
 * @since    JDK 1.8  
 * @see       
 */

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Transaction;

@Component
public class DistrubutedLock {

	@Autowired
	private JedisPool jedisPool;

	/**
	 * 
	 * lockWithTimeOut:(加锁). <br/>
	 *
	 * @param localName
	 *            锁KEY
	 * @param acqiureTimeout
	 *            获取超时时间
	 * @param timeout
	 *            锁的超时时间
	 * @return 锁 标识
	 * @since JDK 1.8
	 */
	public String lockWithTimeOut(String localName, long acqiureTimeout, long timeout) {
		String retIdentifier;
		Jedis jedis = jedisPool.getResource();
		try {
			retIdentifier = null;
			/**
			 * 获取连接
			 */
			// Jedis jedis = jedisPool.getResource();
			/**
			 * 随机生成value
			 */
			String indentifier = UUID.randomUUID().toString();
			/**
			 * 锁名
			 */
			String lockKey = "LOCK-" + localName;
			/**
			 * 超时时间，上锁后超过时间自动释放锁
			 */
			int lockExpire = (int) (timeout / 1000);
			/**
			 * 获取锁的超时时间
			 */
			long end = System.currentTimeMillis() + acqiureTimeout;
			while (System.currentTimeMillis() < end) {
				if (jedis.setnx(lockKey, indentifier) == 1) {
					jedis.expire(lockKey, lockExpire);
					/**
					 * 返回value值，用于释放锁时间确认
					 */
					retIdentifier = indentifier;
					return retIdentifier;
				}
				/**
				 * -1为没有设置超时时间，为key设置一个超时时间
				 */
				if (jedis.ttl(lockKey) == -1) {
					jedis.expire(lockKey, lockExpire);
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		} finally {
			jedis.close();
		}
		return retIdentifier;
	}

	/**
	 * 
	 * releaseLock:(释放锁). <br/>
	 *
	 * @param lockName
	 *            锁名称
	 * @param indentifer
	 *            释放锁的标识
	 * @return
	 * @since JDK 1.8
	 */
	public boolean releaseLock(String lockName, String indentifer) {
		Jedis jedis = jedisPool.getResource();
		String lockKey = "LOCK-" + lockName;
		boolean flag = false;
		try {
			while (true) {
				jedis.watch(lockKey);
				if (indentifer.equals(jedis.get(lockKey))) {
					Transaction transaction = jedis.multi();
					transaction.del(lockKey);
					List<Object> results = transaction.exec();
					if (results == null) {
						continue;
					}
					flag = true;
				}
				jedis.unwatch();
				break;
			}
		} finally {
			jedis.close();
		}
		return flag;
	}

}
