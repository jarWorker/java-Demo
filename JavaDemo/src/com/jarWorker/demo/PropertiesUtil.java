package com.jarWorker.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Properties;


public class PropertiesUtil {
	
	/**
	 * 使用properties两种方式获取value。 
	 * FileReader文件在根目录。 
	 * InputStream文件在新建source folder下。
	 * @param key
	 * @param flag
	 * @return String
	 * @author jarWoker
	 */
	public static String getValue(String key, boolean flag) {
		Properties properties = new Properties();// 获取配置文件的对象
		String configFileIn = "info.txt";
		String configFileIs = "info.properties";
		if (flag == true) {
			FileReader in;
			try {
				in = new FileReader(configFileIn);
				properties.load(in);
				in.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("in无法找到指定文件！");
				e.printStackTrace();
			} catch (IOException e) {
				System.err.println("in流读取失败");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (flag == false) {
			InputStream is = PropertiesUtil.class.getClassLoader().getResourceAsStream(configFileIs);
			try {
				properties.load(is);
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println("is流读取失败");
				e.printStackTrace();
			}
		}
		return properties.getProperty(key);// 返回根据key获取的value值
	}
	
	/**
	 * 
	 * 读取文件中的所有信息key-value形式
	 * 
	 * @author jarWoker
	 * 
	 */
	public static void readProperties() {

		Properties properties = new Properties();
		String configFileIn = "info.txt";
		FileReader in;
		try {
			in = new FileReader(configFileIn);
			properties.load(in);
			in.close();
			//Enumeration很古老的东西，大部分被Iterator取代，这里只能用Enumeration
			Enumeration<?> enumeration = properties.propertyNames();
			while (enumeration.hasMoreElements()) {
				String key = (String) enumeration.nextElement();
				String value = properties.getProperty(key);
				System.out.println("readProperties打印信息:" + key + "=" + value);
  
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("无法找到指定文件！");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("加载失败");
			e.printStackTrace();
		}

	}
	/**
	 * 通过键值方式写入到文件中。
	 * 如果paramKey为原来的键名，则更新。
	 * 如果paramKey为新的键名，则添加。
	 * 并且文件中添加注释内容更新内容和更新最后更新时间
	 * @param paramKey
	 * @param paramValue
	 */
	 public static void writeProperties(String paramKey,String paramValue) {
	     Properties properties = new Properties();
	     try {
	            InputStream is = new FileInputStream("info.txt");
	            properties.load(is);
	            properties.setProperty(paramKey, paramValue);
	            OutputStream os = new FileOutputStream("info.txt");
	            //必须调用store(OutputStream out,String comments),否则文件内容会被清空
	            //comments在加入文件中注释，这里提示最后一次更新的信息，并且也会加上最后更新时间
	            properties.store(os, "update key:'" + paramKey + "'value:'"+paramValue+"'");
	            System.out.println("写入文件成功");
	        } catch (IOException e) {
	        	// TODO Auto-generated catch block
	        	System.err.println("写入文件失败");
	        }
	    }
}
