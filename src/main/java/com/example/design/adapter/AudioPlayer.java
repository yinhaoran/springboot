/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:AudioPlayer.java  
 * Package Name:com.example.design.adapter 
 * Date:2019年5月5日上午9:49:12  
 * Copyright (c) 2019,  
 *  
*/

package com.example.design.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ClassName:AudioPlayer Date: 2019年5月5日 上午9:49:12 TODO 具体播放器
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
public class AudioPlayer implements MediaPlayer {

	private static final Logger LOGGER = LoggerFactory.getLogger(AudioPlayer.class);

	private MediaPlayer mediaPlayer;

	/**
	 * 
	 * TODO 内部提供了对MP3格式文件的支持，拓展了对MP4文件和VLC文件的支持
	 * 
	 * @see com.example.design.adapter.MediaPlayer#play(java.lang.String,
	 *      java.lang.String)
	 */
	@Override
	public void play(String audioType, String fileName) {
		if (FileType.MP3.equalsIgnoreCase(audioType)) {
			LOGGER.info("PLAYING MP3 FILE.NAME : " + fileName);
		} else if (FileType.VLC.equalsIgnoreCase(audioType) || FileType.MP4.equalsIgnoreCase(audioType)) {
			mediaPlayer = new MediaAdapter(audioType);
			mediaPlayer.play(audioType, fileName);
		} else {
			LOGGER.info("INVALID MEDIA TYPE.{} NOT SUPPORTED", audioType);
		}
	}

}
