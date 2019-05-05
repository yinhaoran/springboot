/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:MemcacheConfig.java  
 * Package Name:com.example.configure 
 * Date:2019年4月26日上午11:54:29  
 * Copyright (c) 2019,  
 *  
*/

package com.example.configure;

import java.io.IOException;
import java.net.InetSocketAddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.whalin.MemCached.MemCachedClient;
import com.whalin.MemCached.SockIOPool;

import net.spy.memcached.MemcachedClient;

/**
 * 
 * ClassName:MemcacheConfig 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON(可选).  
 * date: 2019年4月30日 上午10:41:06 
 * 
 * @author yin 
 * @version   
 * @since JDK 1.6
 */
@Component
public class MemcacheConfig {
	@Autowired
	SocketPoolConfig sockIOPoolConfig;

	@Bean
	public SockIOPool sockIOPool() {
		SockIOPool pool = SockIOPool.getInstance();
		/**
		 * 服务器列表及其权重
		 */
		String[] servers = sockIOPoolConfig.getServers();
		Integer[] weights = sockIOPoolConfig.getWeights();
		/**
		 * 设置服务器信息
		 */
		pool.setServers(servers);
		pool.setWeights(weights);
		/**
		 * 设置初始连接数、最小连接数、最大连接数、最大处理时间
		 */
		pool.setInitConn(sockIOPoolConfig.getInitConn());
		pool.setMinConn(sockIOPoolConfig.getMinConn());
		pool.setMaxConn(sockIOPoolConfig.getMaxConn());
		/**
		 * 设置连接池守护线程的睡眠时间
		 */
		pool.setMaintSleep(sockIOPoolConfig.getMaintSleep());
		/**
		 * 设置TCP参数，连接超时
		 */
		pool.setNagle(sockIOPoolConfig.isNagle());
		pool.setSocketConnectTO(sockIOPoolConfig.getSocketTO());
		/**
		 * 初始化并启动连接池
		 */
		pool.initialize();
		return pool;
	}

	@Bean
	public MemCachedClient cachedClient() {
		return new MemCachedClient();
	}

	@Bean
	public MemcachedClient memcachedClient() {
		try {
			return new MemcachedClient(new InetSocketAddress("localhost", 11211));
		} catch (IOException e) {
			e.printStackTrace();  
		}
		return null;
	}

}
