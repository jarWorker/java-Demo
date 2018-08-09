package com.reflection.utli;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConstructorsUtil {
	/**
	 * 获取公有构造方法
	 * @author jarWorker
	 * @return
	 */
	public static List<Constructor<?>> getPubicConstructors(String str) {
		System.out.println("进入获得所有公有构造方法。");
		Class<?> clazz = LoadClassUtil.getClassThird(str);
		List<Constructor<?>> list = new ArrayList<>();
		// 核心方法getConstructors()
		Constructor<?>[] constryctors = clazz.getConstructors();
		for (int i = 0; i < constryctors.length; i++) {
			list.add(constryctors[i]);
		}
		return list;
	}
	

	/**
	 * 获取所有构造方法
	 * 
	 * @author jarWorker
	 * @return
	 */
	public static List<Constructor<?>> getAllConstructors(String str) {
		System.out.println("进入获得所有构造方法。");
		Class<?> clazz = LoadClassUtil.getClassThird(str);
		List<Constructor<?>> list = new ArrayList<>();
        // 核心方法getDeclaredConstructors()
		Constructor<?>[] declaredconstryctors = clazz.getDeclaredConstructors();
		for (int i = 0; i < declaredconstryctors.length; i++) {
			list.add(declaredconstryctors[i]);
		}
		return list;
	}
	

	/**
	 * 获得公有无参构造方法
	 * @author jarWorker
	 * @return
	 */
	public static Constructor<?> getPublicConstructorWithoutParm(String str) {
		Class<?> clazz = LoadClassUtil.getClassThird(str);
		try {
			 // 核心方法getConstructor()
			Constructor<?> constructor = clazz.getConstructor();
			// 获得私有无参构造方法
//			Constructor<?> constructor = clazz.getDeclaredConstructor();
//			constructor.setAccessible(true);
			System.out.println("进入获得公有无参构造方法：" + constructor);
			return constructor;
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

	/**
	 * 获得单参数Date私有构造方法
	 * @author jarWorker
	 * @return
	 */
	public static Constructor<?> getprivateConstructorDate(String str) {
		Class<?> clazz = LoadClassUtil.getClassThird(str);
		try {
			// 核心方法getDeclaredConstructor(paramterType) paramterType:Class.class;
			Constructor<?> constructor = clazz.getDeclaredConstructor(Date.class);
			System.out.println("进入获得私有构造方法:" + constructor);
			// 暴力访问，取消访问修饰符作用
			constructor.setAccessible(true);
			return constructor;
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 获得单参数Date私有构造方法
	 * @author jarWorker
	 * @return
	 */
	public static Constructor<?> getprivateConstructorStringAndDate(String str) {
		Class<?> clazz = LoadClassUtil.getClassThird(str);
		try {
			// 核心方法getDeclaredConstructor(paramterType) paramterType:Class.class;
			Constructor<?> constructor = clazz.getDeclaredConstructor(String.class,Date.class);
			System.out.println("进入获得私有构造方法:" + constructor);
			// 暴力访问，取消访问修饰符作用
			constructor.setAccessible(true);
			return constructor;
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
