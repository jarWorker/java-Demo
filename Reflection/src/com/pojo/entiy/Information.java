package com.pojo.entiy;

public class Information {

	public String showPublic(String parm) {
		String str = "调用了公有方法";
		System.out.println(str + ",参数是：" + parm);
		return "succsee";
	}

	public String showPublicNull() {
		String str = "调用了无参公有方法";
		System.out.println(str);
		return "succsee";
	}

	private String showPrivate(String parm) {
		String str = "调用了私有方法";
		System.out.println(str + ",参数是：" + parm);
		return "succsee";
	}

	protected String showProtected() {
		String str = "调用了受保护方法";
		System.out.println(str);
		return str;
	}

	String show() {
		String str = "调用了默认方法";
		System.out.println(str);
		return str;
	}
}
