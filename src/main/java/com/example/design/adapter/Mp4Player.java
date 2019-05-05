/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:Mp4Player.java  
 * Package Name:com.example.design.adapter 
 * Date:2019年5月5日上午9:27:57  
 * Copyright (c) 2019,  
 *  
*/

package com.example.design.adapter;
/**  
 * ClassName:Mp4Player   
 * Date:     2019年5月5日 上午9:27:57  
 * @version    
 * @author   yin
 * @since    JDK 1.8  
 * @see       
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mp4Player implements AdvancedMediaPlayer {

	private static final Logger LOGGER = LoggerFactory.getLogger(Mp4Player.class);

	@Override
	public void playVlc(String fileName) {

		// DO NOTHING

	}

	@Override
	public void playMP4(String fileName) {
		LOGGER.info("Play mp4 file,NAME : {}", fileName);
	}

}
