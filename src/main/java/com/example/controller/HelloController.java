/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:HelloController.java  
 * Package Name:com.example.controller 
 * Date:2019年4月24日上午11:56:31  
 * Copyright (c) 2019,  
 *  
*/

package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.pojo.User;
import com.example.ws.MyCallback;
import com.example.ws.XZWebServiceStub;
import com.example.ws.XZWebServiceStub.GetSubsidyApplyByUserName;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * ClassName:HelloController Date: 2019年4月24日 上午11:56:31
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
@Api(value = "测试控制器", tags = "用户操作接口")
@RestController
@RequestMapping(value = "/user")
public class HelloController {
	
	@Autowired
	private XZWebServiceStub serviceStub;

	@ApiOperation(value = "测试NGINX请求转发")
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String say() {
		return "这是8099端口";
	}

	@ApiOperation(value = "获取用户信息", tags = { "获取用户信息" }, notes = "注意")
	@RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
	@ResponseBody
	public String getUserInfo() {
		Map<String, String> map = new HashMap<String, String>(16);
		map.put("Name", "John");
		map.put("Position", "Engineer");
		String psnInfo = JSON.toJSONString(map);
		return psnInfo;
	}

	@ApiOperation(value = "删除用户信息", tags = { "删除用户信息" }, notes = "")
	@DeleteMapping(value = "/deleteUserInfo")
	@ResponseBody
	public Map<String, String> deleteUser(@ApiParam(name = "id", value = "用户主键", required = true) String id) {
		Map<String, String> map = new HashMap<String, String>(16);
		map.put("Name", "John");
		map.put("Position", "Engineer");
		return map;
	}

	@ApiOperation(value = "修改用户信息", tags = { "修改用户信息" })
	@PostMapping(value = "/updateUserInfo")
	@ResponseBody
	public User updateUser(@ApiParam(name = "user", value = "传入JSON格式", required = true) @RequestBody User user) {
		return user;
	}
	
	@ApiOperation(value = "测试Axis2 WebService", tags = { "测试Axis2生成WEBSERVCIE" })
	@PostMapping(value = "/testAxis2")
	@ResponseBody
	public JSONObject testAxis() throws Exception {
		GetSubsidyApplyByUserName applyByUserName = new GetSubsidyApplyByUserName();
		applyByUserName.setUserName("林国伟");
		serviceStub.startgetSubsidyApplyByUserName(applyByUserName, new MyCallback());
		return null;
	}
	
	
}
