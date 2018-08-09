package com.reflection.utli;

import com.pojo.entiy.Citizen;

public class LoadClassUtil {
	/**
	 * 加载类，第一种方式
	 * @param object
	 * @return String
	 */
	public static Class<?> getClassFirst(Object object) {
		return object.getClass();
	}

	/**
	 * 加载类，第二种方式 需要一个具体类，此方法只适合Citizen
	 * 
	 * @return String
	 */
	public static Class<?> getClassSecond() {
		return Citizen.class;
	}

	/**
	 * 加载类，第三种方式，此方式最优
	 * @param str是包加类的全限定名
	 * @return String
	 */
	public static Class<?> getClassThird(String str) {
		try {
			return Class.forName(str);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
