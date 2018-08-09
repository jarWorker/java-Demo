package com.reflectionMechanism.test;

import org.junit.Test;
import com.pojo.entiy.Citizen;
import com.reflection.utli.LoadClassUtil;

public class TestLoadClass {
	@Test
	public void testGetClassName() {
		// 运行期间，一个类，只有一个Class对象产生
		System.out.println("-——-——-——java放射机制类加载<<<<运行期间，一个类，只有一个Class对象产生>>>>-——-——-——");
		Citizen citizen = new Citizen();// 调用无参构造方法！
		Class<?> classNameFir = LoadClassUtil.getClassFirst(citizen);
		System.out.println("第一种方式加载类：" + classNameFir);
		String nameFir = classNameFir.getName();
		System.out.println("nameFir=" + nameFir);
		String simpleNameFir = classNameFir.getSimpleName();
		System.out.println("simpleName=" + simpleNameFir);

		Class<?> classNameSec = LoadClassUtil.getClassSecond();
		System.out.println("第二种方式加载类：" + classNameSec);
		String nameSec = classNameSec.getName();
		System.out.println("nameSec=" + nameSec);
		String simpleNameSec = classNameSec.getSimpleName();
		System.out.println("simpleNameSec=" + simpleNameSec);

		Class<?> classNameThi = LoadClassUtil.getClassThird("com.pojo.entiy.Citizen");
		System.out.println("第三种方式加载类：" + classNameThi);
		String nameThi = classNameThi.getName();
		System.out.println("nameThi=" + nameThi);
		String simpleNameThi = classNameThi.getSimpleName();
		System.out.println("simpleNameThi=" + simpleNameThi);
		// 备注：三种方式常用第三种，
		// 第一种对象都有了不需要反射。
		// 第二种需要导入类的包，依赖太强，不导包就抛编译错误。
		// 一般都第三种，一个字符串可以传入也可写在配置文件中等多种方法。
	}
}
