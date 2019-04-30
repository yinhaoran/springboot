/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:SwaggerConfig.java  
 * Package Name:com.example.configure 
 * Date:2019年4月24日下午5:35:45  
 * Copyright (c) 2019,  
 *  
*/

package com.example.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.ApiOperation;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * ClassName:SwaggerConfig Date: 2019年4月24日 下午5:35:45
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket swaggerPlugin() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("使用swagger2构建RESTful APIS")
				.description("简单说明")
				.contact(new Contact("殷浩然", "https://github.com/yinhaoran", "15626813313@163.com"))
				.version("1.0")
				.build();
	}

}
