/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:SocketPoolConfig.java  
 * Package Name:com.example.configure 
 * Date:2019年4月26日上午11:49:22  
 * Copyright (c) 2019,  
 *  
*/

package com.example.configure;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ClassName:SocketPoolConfig Date: 2019年4月26日 上午11:49:22
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
@Component
@ConfigurationProperties(prefix = "memcache")
public class SocketPoolConfig {
	private String[] servers;

	private Integer[] weights;

	private int initConn;
	
	private int minConn;
	
	private int maxConn;

	private long maintSleep;

	private boolean nagle;

	private int socketTO;

	public String[] getServers() {
		return servers;
	}

	public void setServers(String[] servers) {
		this.servers = servers;
	}

	public Integer[] getWeights() {
		return weights;
	}

	public void setWeights(Integer[] weights) {
		this.weights = weights;
	}

	public int getInitConn() {
		return initConn;
	}

	public void setInitConn(int initConn) {
		this.initConn = initConn;
	}

	public int getMinConn() {
		return minConn;
	}

	public void setMinConn(int minConn) {
		this.minConn = minConn;
	}

	public int getMaxConn() {
		return maxConn;
	}

	public void setMaxConn(int maxConn) {
		this.maxConn = maxConn;
	}

	public long getMaintSleep() {
		return maintSleep;
	}

	public void setMaintSleep(long maintSleep) {
		this.maintSleep = maintSleep;
	}

	public boolean isNagle() {
		return nagle;
	}

	public void setNagle(boolean nagle) {
		this.nagle = nagle;
	}

	public int getSocketTO() {
		return socketTO;
	}

	public void setSocketTO(int socketTO) {
		this.socketTO = socketTO;
	}
	
	
}
