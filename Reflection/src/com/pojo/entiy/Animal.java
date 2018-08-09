package com.pojo.entiy;

import java.io.Serializable;

/**
 * 动物类
 * @author jarWorker
 *
 */
public class Animal implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	public String Male;
	Integer age;
	protected String skinColour;

	public Animal() {
		super();
	}

	public Animal(String name, String male, String skinColour) {
		super();
		this.name = name;
		Male = male;
		this.skinColour = skinColour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMale() {
		return Male;
	}

	public void setMale(String male) {
		Male = male;
	}

	public String getSkinColour() {
		return skinColour;
	}

	public void setSkinColour(String skinColour) {
		this.skinColour = skinColour;
	}

}
