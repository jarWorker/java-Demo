package com.reflectionMechanism.test;

import java.lang.reflect.Field;
import java.util.List;

import org.junit.Test;

import com.pojo.entiy.Animal;
import com.reflection.utli.FieldUtil;

public class TestField {

	@Test
	public void testField() throws Exception {
		System.out.println("-——-——-——java放射机制成员变量-——-——-——");

		System.out.println("=============所有变量==============");
		List<Field> allFields = FieldUtil.getAllFiles("com.pojo.entiy.Animal");
		for (Field field : allFields) {
			System.out.println("变量：" + field);
		}

		System.out.println("=============所有公有变量==============");
		List<Field> publicFields = FieldUtil.getPublicFiles("com.pojo.entiy.Animal");
		for (Field field : publicFields) {
			System.out.println("变量：" + field);
		}

		System.out.println("=============公有变量并赋值==============");
		Object ob = FieldUtil.getPublicFile("com.pojo.entiy.Animal", "Male", "雌性");
		Animal publicAnimal = (Animal) ob;
		String male = publicAnimal.getMale();
		System.out.println("此动物是公是母：" + male);

		System.out.println("=============私有变量并赋值==============");
		Object object = FieldUtil.getPrivateFile("com.pojo.entiy.Animal", "name", "企鹅");
		Animal privateAnimal = (Animal) object;
		String name = privateAnimal.getName();
		System.out.println("此动物是：" + name);

	}
}
