/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:MyCallback.java  
 * Package Name:com.example.ws 
 * Date:2019年5月13日下午4:40:33  
 * Copyright (c) 2019,  
 *  
*/  
  
package com.example.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.ws.XZWebServiceStub.GetSubsidyApplyByUserNameResponse;

/**  
 * ClassName:MyCallback   
 * Date:     2019年5月13日 下午4:40:33  
 * @version    
 * @author   yin
 * @since    JDK 1.8  
 * @see       
 */
public class MyCallback extends XZWebServiceCallbackHandler{
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MyCallback.class);

	/**  
	 * TODO 简单描述该方法的实现功能（可选）.  
	 * @see com.example.ws.XZWebServiceCallbackHandler#receiveResultgetSubsidyApplyByUserName(com.example.ws.XZWebServiceStub.GetSubsidyApplyByUserNameResponse)  
	 */
	@Override
	public void receiveResultgetSubsidyApplyByUserName(GetSubsidyApplyByUserNameResponse result) {
		  
		// TODO Auto-generated method stub  
		super.receiveResultgetSubsidyApplyByUserName(result);
		LOGGER.info("成功调用webservice");
	}

	/**  
	 * TODO 简单描述该方法的实现功能（可选）.  
	 * @see com.example.ws.XZWebServiceCallbackHandler#receiveErrorgetSubsidyApplyByUserName(java.lang.Exception)  
	 */
	@Override
	public void receiveErrorgetSubsidyApplyByUserName(Exception e) {
		  
		// TODO Auto-generated method stub  
		super.receiveErrorgetSubsidyApplyByUserName(e);
	}

	
}
  
