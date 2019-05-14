/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:RefinedAbstractMessage.java  
 * Package Name:com.example.design.bridge 
 * Date:2019年5月8日上午10:47:50  
 * Copyright (c) 2019,  
 *  
*/

package com.example.design.bridge;

/**
 * ClassName:RefinedAbstractMessage Date: 2019年5月8日 上午10:47:50
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
public class RefinedAbstractMessage extends AbstractMessage {

	@Override
	public void operation() {

		iMessage.send("Hello World", "Kitty Cat");

	}

}
