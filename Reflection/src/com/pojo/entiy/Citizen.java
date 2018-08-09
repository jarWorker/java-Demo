package com.pojo.entiy;


import java.io.Serializable;
import java.util.Date;

/**
 * 公民类
 * @author jarWorker
 */
public class Citizen implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private String gender;
	private Date dateOfBirth;
	private String address;
	private String idCard;

	public Citizen() {
		super();
		System.out.println("调用无参构造方法！");
	}

	public Citizen(String name) {
		super();
		this.name = name;
		System.out.println("调用公有单参数单构造方法！");
	}

	protected Citizen(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
		System.out.println("调用受保护两个参数单构造方法！");
	}
	
	private Citizen(String name,Date dateOfBirth) {
		this.name=name;
		this.dateOfBirth = dateOfBirth;
		System.out.println("调用私有两个参数构造方法！");
	}

	private Citizen(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		System.out.println("调用私有单参数构造方法！");
	}

	public Citizen(String name, String gender, Date dateOfBirth, String address, String idCard) {
		super();
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.idCard = idCard;
		System.out.println("调用公有多参数单构造方法！");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", address=" + address
				+ ", idCard=" + idCard + "]";
	}
}
