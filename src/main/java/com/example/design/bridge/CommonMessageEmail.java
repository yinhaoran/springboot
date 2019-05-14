/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:CommonMessageEmail.java  
 * Package Name:com.example.design.bridge 
 * Date:2019年5月6日上午9:48:40  
 * Copyright (c) 2019,  
 *  
*/

package com.example.design.bridge;
/**  
 * ClassName:CommonMessageEmail   
 * Date:     2019年5月6日 上午9:48:40  
 * @version    
 * @author   yin
 * @since    JDK 1.8  
 * @see       
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonMessageEmail implements IMessage {

	private static final Logger LOGGER = LoggerFactory.getLogger(CommonMessageEmail.class);

	@Override
	public void send(String message, String toUser) {
		LOGGER.info("Send a Email message to {} ,message content is {}", toUser, message);
	}

}
