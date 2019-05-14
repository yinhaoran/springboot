/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:IMessage.java  
 * Package Name:com.example.design.bridge 
 * Date:2019年5月6日上午9:44:50  
 * Copyright (c) 2019,  
 *  
*/

package com.example.design.bridge;

/**
 * ClassName:IMessage Date: 2019年5月6日 上午9:44:50
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
public interface IMessage {
	/**
	 * 
	 * send:(发送消息). <br/>
	 *
	 * @param message
	 *            消息
	 * @param toUser
	 *            消息接收人
	 * @since JDK 1.8
	 */
	public void send(String message, String toUser);
}
