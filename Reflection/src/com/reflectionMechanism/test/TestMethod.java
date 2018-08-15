package com.reflectionMechanism.test;

import java.lang.reflect.Method;
import java.util.List;

import org.junit.Test;

import com.reflection.utli.MethodsUtil;

public class TestMethod {
	@Test
	public void testMethod() throws Exception {
		System.out.println("======获取所有的公有成员方法======");
		List<Method> publicList = MethodsUtil.getPublicMethods("com.pojo.entiy.Information");
		for (Method method : publicList) {
			System.out.println(method);
		}
		System.out.println("======获取所有的成员方法======");
		List<Method> allList = MethodsUtil.getAllMethods("com.pojo.entiy.Information");
		for (Method method : allList) {
			System.out.println(method);
		}
		System.out.println("=====调用带参公有成员方法======");
		Object publicObj = MethodsUtil.getPublicMethod("com.pojo.entiy.Information", "showPublic");
		System.out.println("返回值：" + publicObj);
		System.out.println("======调用带参私有成员方法======");
		Object PrivateObj = MethodsUtil.getPrivateMethod("com.pojo.entiy.Information", "showPrivate");
		System.out.println("返回值：" + PrivateObj);
		System.out.println("======调用无参公有成员方法======");
		Object publicObjNull = MethodsUtil.getPublicMethodNull("com.pojo.entiy.Information", "showPublicNull");
		System.out.println("返回值：" + publicObjNull);
	}
}
