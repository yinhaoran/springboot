/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:package-info.java  
 * Package Name:package-info.java
 * Date:2019年4月30日上午10:00:06  
 * Copyright (c) 2019  
 *  
 */
/**
 * <pre>
 * 建造者设计模式
 * Builder Pattern
 * 主要解决：在软件系统中，有时面临一个“复杂对象”的创建工作，其各个部分发生剧烈的变化，但是
 * 将它们组合在一起却很稳定。
 * 使用：一些基本部件不会变，但是组合经常变化
 * 解决方法：将变和不变分离开
 * 关键代码：
 * 1.建造者：创建和提供实例
 * 2.导演：管理建造出来的实例的依赖关系
 * 优点：
 * ①建造则独立，易扩展。
 * ②便于控制细节风险。
 * 缺点：
 * 产品必须有共同点，范围有限制。
 * 内部变化复杂，会有更多的建造类。
 * </pre>
 */
package com.example.design.builder;