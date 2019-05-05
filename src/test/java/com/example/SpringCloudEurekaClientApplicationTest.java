package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.whalin.MemCached.MemCachedClient;


/**
 * 
 * ClassName:SpringCloudEurekaClientApplicationTest 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON(可选).  
 * date: 2019年4月30日 上午10:41:28 
 * 
 * @author yin 
 * @version   
 * @since JDK 1.6
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCloudEurekaClientApplicationTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringCloudEurekaClientApplicationTest.class);

	@Autowired
	public MemCachedClient memCachedClient;

	@Test
	public void contextLoads() {
		boolean flag = memCachedClient.set("name", "KittyCat", 1000);
		Assert.assertTrue(flag);
		String name = (String) memCachedClient.get("name");
		assertEquals(name, "KittyCat");
		LOGGER.info("是否存入[Memcache]成功? {}", flag);
		LOGGER.info("获取Key为[Name]的缓存 {}", memCachedClient.get("name"));
	}

}
