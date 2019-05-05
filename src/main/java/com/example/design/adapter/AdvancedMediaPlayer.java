/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:AdvancedMediaPlayer.java  
 * Package Name:com.example.design.adapter 
 * Date:2019年5月5日上午9:25:45  
 * Copyright (c) 2019,  
 *  
*/  
  
package com.example.design.adapter;  
/**  
 * ClassName:AdvancedMediaPlayer   
 * Date:     2019年5月5日 上午9:25:45  
 * @version    
 * @author   yin
 * @since    JDK 1.8  
 * @see       
 */
public interface AdvancedMediaPlayer {
	/**
	 * 
	 * playVlc:(播放VLC类型的文件). <br/>  
	 *
	 * @param fileName  
	 * @since JDK 1.8
	 */
	public void playVlc(String fileName);
	
	/**
	 * 
	 * playMP4:(播放MP4类型的文件). <br/>  
	 *
	 * @param fileName  
	 * @since JDK 1.8
	 */
	public void playMP4(String fileName);
}
  
