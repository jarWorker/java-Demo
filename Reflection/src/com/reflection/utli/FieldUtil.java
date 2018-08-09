package com.reflection.utli;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class FieldUtil {
	/**
	 * 获取公有属性
	 * 
	 * @return
	 */
	public static List<Field> getPublicFiles(String str) {
		Class<?> clazz = LoadClassUtil.getClassThird(str);
		List<Field> list = new ArrayList<>();
		Field[] fields = clazz.getFields();
		for (Field field : fields) {
			list.add(field);
		}
		return list;
	}

	/**
	 * 获取所有属性
	 * 
	 * @return
	 */
	public static List<Field> getAllFiles(String str) {
		Class<?> clazz = LoadClassUtil.getClassThird(str);
		List<Field> list = new ArrayList<>();
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			list.add(field);
		}
		return list;
	}

	/**
	 * 
	 * @param str
	 * @param param
	 * @param value
	 * @return
	 * @throws Exception
	 */
	public static Object getPublicFile(String str, String param, String value) throws Exception {
		Class<?> clazz = LoadClassUtil.getClassThird(str);
		Field field = clazz.getField(param);
		System.out.println("公有变量名：" + field);
		Object obj = clazz.getConstructor().newInstance();
		field.set(obj, value);
		return obj;
	}

	public static Object getPrivateFile(String str, String param, String value) throws Exception {
		Class<?> clazz = LoadClassUtil.getClassThird(str);
		Field field = clazz.getDeclaredField(param);
		field.setAccessible(true);
		System.out.println("私有变量名：" + field);
		Object obj = clazz.getConstructor().newInstance();
		field.set(obj, value);
		return obj;
	}
}
