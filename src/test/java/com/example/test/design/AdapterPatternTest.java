/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:AdapterPatternTest.java  
 * Package Name:com.example.test.design 
 * Date:2019年5月5日上午10:08:18  
 * Copyright (c) 2019,  
 *  
*/

package com.example.test.design;
/**  
 * ClassName:AdapterPatternTest   
 * Date:     2019年5月5日 上午10:08:18  
 * @version    
 * @author   yin
 * @since    JDK 1.8  
 * @see       
 */

import org.junit.Test;

import com.example.design.adapter.AudioPlayer;

public class AdapterPatternTest {
	@Test
	public void testName() throws Exception {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");
	}
}
