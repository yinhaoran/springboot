/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:CommonMessageSMS.java  
 * Package Name:com.example.design.bridge 
 * Date:2019年5月6日上午9:46:19  
 * Copyright (c) 2019,  
 *  
*/

package com.example.design.bridge;
/**  
 * ClassName:CommonMessageSMS   
 * Date:     2019年5月6日 上午9:46:19  
 * @version    
 * @author   yin
 * @since    JDK 1.8  
 * @see       
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonMessageSMS implements IMessage {

	private static final Logger LOGGER = LoggerFactory.getLogger(CommonMessageSMS.class);

	@Override
	public void send(String message, String toUser) {
		LOGGER.info("Send a common message to {} ,message content is {}", toUser, message);
	}

}
