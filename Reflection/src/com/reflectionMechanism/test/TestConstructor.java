package com.reflectionMechanism.test;

import java.lang.reflect.Constructor;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import com.reflection.utli.ConstructorsUtil;

public class TestConstructor {
	@Test
	public void testDemo() throws Exception {
		System.out.println("-——-——-——java放射机制构造方法-——-——-——");
		
		System.out.println("=============所有公有构造方法==============");
		List<Constructor<?>> publicList = ConstructorsUtil.getPubicConstructors("com.pojo.entiy.Citizen");
		for (Constructor<?> constructor : publicList) {
			System.out.println(constructor);
		}
		
		
		System.out.println("=============所有构造方法==============");
		List<Constructor<?>> Alllist = ConstructorsUtil.getAllConstructors("com.pojo.entiy.Citizen");
		for (Constructor<?> constructor : Alllist) {
			System.out.println(constructor);
		}
		
		
		System.out.println("=============公有无参构造方法AND调用==============");
		Constructor<?> publicConstructor = ConstructorsUtil.getPublicConstructorWithoutParm("com.pojo.entiy.Citizen");
		// 调用无参构造
		Object obj = publicConstructor.newInstance();
		System.out.println("obj="+obj);
		
		
		System.out.println("=============私有单参数Date构造方法AND调用==============");
		Constructor<?> PrivateConstructorDate = ConstructorsUtil.getprivateConstructorDate("com.pojo.entiy.Citizen");
		Object object = PrivateConstructorDate.newInstance(new Date());
		System.out.println("object="+object);
		
		System.out.println("=============私有两个参数构造方法AND调用==============");
		Constructor<?> PrivateConstructorStringAndDate = ConstructorsUtil.getprivateConstructorStringAndDate("com.pojo.entiy.Citizen");
		Object ob = PrivateConstructorStringAndDate.newInstance("胖虎",new Date());
		System.out.println("ob="+ob);
	}
}
