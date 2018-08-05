package com.jarWorker.testDemo;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import com.jarWorker.demo.ListUtil;
import com.jarWorker.pojo.Student;



/**
 * 
 * @author jarWorker
 *
 */
public class TestListUtil {
	@SuppressWarnings("unchecked")
	@Test
	public void testList() throws Exception {
		String xiaoqiang = "小强";
		String xiaoLi = "小丽";
		String xiaoMing = "小明";
		String xiaoHong = "小红";
		List<String> list = new ArrayList<>();
		list.add(xiaoMing);
		list.add(xiaoHong);
		list.add(xiaoLi);
		list.add(xiaoqiang);
		list.add(xiaoMing);
		System.out.println("未去重集合="+list);
		List<String> newList = (List<String>) ListUtil.collectionWithoutRepetition(list);
		System.out.println("去重复结果="+newList);
		List<String> sortList = (List<String>) ListUtil.collectionWithoutRepetitionAndSort(newList);
		System.out.println("去重复并按treeSet排序结果="+sortList);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testObjectList() throws Exception {
		Student xiaoqiang=new Student("小强","男",11);
		Student xiaoLi=new Student("小丽","女",11);
		Student xiaoMing=new Student("小明","男",11);
		Student xiaoHong=new Student("小红","女",11);
		List<Student> list = new ArrayList<>();
		list.add(xiaoMing);
		list.add(xiaoHong);
		list.add(xiaoLi);
		list.add(xiaoqiang);
		list.add(xiaoMing);
		System.out.println("未去重集合="+list);
		List<Student> newList = (List<Student>) ListUtil.collectionWithoutRepetition(list);
		System.out.println("去重复结果="+newList);
		//不能对对象进行TreeSet排序
		/*List sortList = ListUtil.collectionWithoutRepetitionAndSort(newList);
		System.out.println(sortList);*/
	}
}
