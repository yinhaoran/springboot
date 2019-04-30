/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:PasswordUtils.java  
 * Package Name:com.example.reflect.bussiness 
 * Date:2019年4月25日下午1:49:50  
 * Copyright (c) 2019,  
 *  
*/

package com.example.reflect.bussiness;

import java.util.List;

/**
 * ClassName:PasswordUtils Date: 2019年4月25日 下午1:49:50
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
public class PasswordUtils {

	@UserCase(id = 1, description = "Password must contain at least one numeric")
	public boolean validatePassword(String password) {
		return password.matches("\\w*\\d\\w*");
	}

	@UserCase(id = 2)
	public String encryptPassword(String password) {
		return new StringBuilder(password).reverse().toString();
	}

	@UserCase(id = 3, description = "New password can't equal previously used ones")
	public boolean checkForNewPassword(List<String> previousPass, String newPassword) {
		return !previousPass.contains(newPassword);
	}

}
