/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:VlcPlayer.java  
 * Package Name:com.example.design.adapter 
 * Date:2019年5月5日上午9:26:58  
 * Copyright (c) 2019,  
 *  
*/

package com.example.design.adapter;
/**  
 * ClassName:VlcPlayer   
 * Date:     2019年5月5日 上午9:26:58  
 * @version    
 * @author   yin
 * @since    JDK 1.8  
 * @see       
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VlcPlayer implements AdvancedMediaPlayer {

	private static final Logger LOGGER = LoggerFactory.getLogger(VlcPlayer.class);

	@Override
	public void playVlc(String fileName) {
		LOGGER.info("Play vlc file,NAME : {}", fileName);
	}

	@Override
	public void playMP4(String fileName) {
		// TODO DO NOTHING
	}

}
