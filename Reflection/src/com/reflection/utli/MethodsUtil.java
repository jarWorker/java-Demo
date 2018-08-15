package com.reflection.utli;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class MethodsUtil {

	/**
	 * 根据类名找到公有的成员方法
	 * 
	 * @param str
	 * @return
	 */
	public static List<Method> getPublicMethods(String str) {
		Class<?> clazz = LoadClassUtil.getClassThird(str);
		List<Method> list = new ArrayList<>();
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			list.add(method);
		}
		return list;

	}

	/**
	 * 根据类名找到的成员方法
	 * 
	 * @param str
	 * @return
	 */
	public static List<Method> getAllMethods(String str) {
		Class<?> clazz = LoadClassUtil.getClassThird(str);
		List<Method> list = new ArrayList<>();
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			list.add(method);
		}
		return list;
	}

	/**
	 * 带参调用公有方法
	 * 
	 * @param str
	 * @param parm
	 * @return
	 * @throws Exception
	 */
	public static Object getPublicMethod(String str, String parm) throws Exception {
		Class<?> clazz = LoadClassUtil.getClassThird(str);
		Method method = clazz.getMethod(parm, String.class);
		Object obj = clazz.getConstructor().newInstance();
		return method.invoke(obj, "hello World");// 返回值

	}

	/**
	 * 无参调用公有方法
	 * 
	 * @param str
	 * @param parm
	 * @return
	 * @throws Exception
	 */
	public static Object getPublicMethodNull(String str, String parm) throws Exception {
		Class<?> clazz = LoadClassUtil.getClassThird(str);
		Method method = clazz.getMethod(parm);
		Object obj = clazz.getConstructor().newInstance();
		return method.invoke(obj);// 返回值
	}

	/**
	 * 带参调用私有方法
	 * 
	 * @param str
	 * @param parm
	 * @return
	 * @throws Exception
	 */
	public static Object getPrivateMethod(String str, String parm) throws Exception {
		Class<?> clazz = LoadClassUtil.getClassThird(str);
		Method method = clazz.getDeclaredMethod(parm, String.class);
		Object obj = clazz.getConstructor().newInstance();
		method.setAccessible(true);// 暴力访问
		return method.invoke(obj, "hello World");// 返回值

	}

}
