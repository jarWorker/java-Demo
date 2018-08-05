package com.jarWorker.testDemo;

import org.junit.Test;

import com.jarWorker.demo.PropertiesUtil;


public class TestProject {
	@Test
	public void testProperties() throws Exception {
		String user = PropertiesUtil.getValue("user", true);
		String passsword = PropertiesUtil.getValue("password", false);
		System.out.println("key为user，value=" + user);
		System.out.println("key为password，value=" + passsword);
		System.out.println("==============================");
		// 读取文件中所有key-value
		PropertiesUtil.readProperties();
		// 更新旧键-值
		PropertiesUtil.writeProperties("password", "510410020");
		// 添加新键值
		PropertiesUtil.writeProperties("url", "www.baidu.com");

	}
}
