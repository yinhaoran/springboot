/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:MediaAdapter.java  
 * Package Name:com.example.design.adapter 
 * Date:2019年5月5日上午9:29:20  
 * Copyright (c) 2019,  
 *  
*/

package com.example.design.adapter;

/**
 * ClassName:MediaAdapter Date: 2019年5月5日 上午9:29:20
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */

public class MediaAdapter implements MediaPlayer {

	/**
	 * 适配器提供了其它媒体类型的支持[MP4、VLC]
	 */
	private AdvancedMediaPlayer advancedMediaPlayer;

	/**
	 * 
	 * Creates a new instance of MediaAdapter.
	 * 
	 * @param audioType
	 *            媒体类型
	 */
	public MediaAdapter(String audioType) {
		if (FileType.VLC.equalsIgnoreCase(audioType)) {
			advancedMediaPlayer = new VlcPlayer();
		} else if (FileType.MP4.equalsIgnoreCase(audioType)) {
			advancedMediaPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if (FileType.VLC.equalsIgnoreCase(audioType)) {
			advancedMediaPlayer.playVlc(fileName);
		} else if (FileType.MP4.equalsIgnoreCase(audioType)) {
			advancedMediaPlayer.playMP4(fileName);
		}
	}

}
