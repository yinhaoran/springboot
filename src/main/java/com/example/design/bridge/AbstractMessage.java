/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:AbstractMessage.java  
 * Package Name:com.example.design.bridge 
 * Date:2019年5月8日上午10:45:27  
 * Copyright (c) 2019,  
 *  
*/

package com.example.design.bridge;

/**
 * ClassName:AbstractMessage Date: 2019年5月8日 上午10:45:27
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
public abstract class AbstractMessage {
	protected IMessage iMessage;

	public void setIMessage(IMessage iMessage) {
		this.iMessage = iMessage;
	}

	public abstract void operation();
}
