package com.reflectionMechanism.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

import com.reflection.utli.LoadClassUtil;

public class TestMain {
	
@Test
public void testMain() {
	//加载ReflectionMainUtil
	Class<?> clazz= LoadClassUtil.getClassThird("com.reflection.utli.ReflectionMainUtil");
	 try {
		Method methodMain = clazz.getMethod("main", String[].class);
		//方式一,String数组任意,空的也行
		methodMain.invoke(null, (Object)new String[]{"hello","world","everybody"});
		//方式二,String数组任意,空的也行
		// methodMain.invoke(null, new Object[]{new String[]{}});
	} catch (NoSuchMethodException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalArgumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvocationTargetException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}



}
}
