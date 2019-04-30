/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:User.java  
 * Package Name:com.example.pojo 
 * Date:2019年4月25日下午7:09:31  
 * Copyright (c) 2019,  
 *  
*/

package com.example.pojo;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName:User Date: 2019年4月25日 下午7:09:31
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
@ApiModel(value = "user对象", description = "用户对象user")
public class User implements Serializable {

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * 
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "用户名", name = "userName", example = "John")
	private String userName;

	@ApiModelProperty(value = "状态", name = "state", example = "1", required = true)
	private Integer state;

	@ApiModelProperty(value = "昵称", name = "nickName", example = "KittyCat", required = false)
	private String nickName;

	@ApiModelProperty(value = "是否有效", name = "isVaild", example = "true", required = false)
	private boolean isVaild;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public boolean isVaild() {
		return isVaild;
	}

	public void setVaild(boolean isVaild) {
		this.isVaild = isVaild;
	}

	public User(String userName, Integer state, String nickName, boolean isVaild) {
		super();
		this.userName = userName;
		this.state = state;
		this.nickName = nickName;
		this.isVaild = isVaild;
	}

	public User() {

		super();
		// TODO Auto-generated constructor stub

	}

}
