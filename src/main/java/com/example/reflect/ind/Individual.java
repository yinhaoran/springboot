/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:Individual.java  
 * Package Name:com.example.reflect.ind 
 * Date:2019年4月25日下午6:22:07  
 * Copyright (c) 2019,  
 *  
*/

package com.example.reflect.ind;

import org.springframework.util.ObjectUtils;

/**
 * ClassName:Individual Date: 2019年4月25日 下午6:22:07
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
public class Individual implements Comparable<Individual> {

	private static long counter = 0;

	private final long id = counter++;

	private String name;

	public Individual() {
		super();
	}

	public Individual(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + name == null ? "" : name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Individual && id == ((Individual) obj).id) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		int result = 17;
		if (name != null) {
			result = 37 * result + (int) id;
		}
		return result;
	}

	@Override
	public int compareTo(Individual individual) {
		String first = getClass().getSimpleName();
		String anoFirst = individual.getClass().getSimpleName();
		int firstCompare = first.compareTo(anoFirst);
		if (firstCompare != 0) {
			return firstCompare;
		}
		if (!ObjectUtils.isEmpty(name) && !ObjectUtils.isEmpty(individual.name)) {
			int secondCompare = name.compareTo(individual.name);
			if (secondCompare != 0) {
				return secondCompare;
			}
		}
		return individual.id < id ? -1 : (individual.id == id ? 0 : 1);
	}

}
