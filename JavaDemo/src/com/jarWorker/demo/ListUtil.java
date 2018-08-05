package com.jarWorker.demo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListUtil {
	/**
	 * List集合去重复值
	 * @author jarWorker
	 * @param list
	 * @return List<?>
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List<?> collectionWithoutRepetition(List<?> list) throws Exception {
		// 创建set并添加list中的元素,保征无重复元素
		Set set = new HashSet<>(list);
		list.clear();// 清空list
		list.addAll(set);//
		return list;
	}
	
	/**
	 * List集合去重复值并排序
	 * @author jarWorker
	 * @param list
	 * @return List<?>
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List<?> collectionWithoutRepetitionAndSort(List<?> list) throws Exception {
		// 创建set并添加list中的元素,保证征无重复元素并排序
		Set set = new TreeSet<>(list);
		list.clear();// 清空list
		list.addAll(set);//
		return list;
	}
	
}
