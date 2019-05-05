/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:MediaPlayer.java  
 * Package Name:com.example.design.adapter 
 * Date:2019年5月5日上午9:23:08  
 * Copyright (c) 2019,  
 *  
*/

package com.example.design.adapter;

/**
 * ClassName:MediaPlayer Date: 2019年5月5日 上午9:23:08
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
public interface MediaPlayer {
	/**
	 * 
	 * play:(播放功能). <br/>
	 *
	 * @param audioType
	 *            媒体类型
	 * @param fileName
	 *            文件名
	 * @since JDK 1.8
	 */
	public void play(String audioType, String fileName);
}
