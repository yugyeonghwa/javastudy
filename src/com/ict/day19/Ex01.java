package com.ict.day19;

public class Ex01 {
	private String name;
	private int age;
	private int price;

	public Ex01() {
	}

	public Ex01(String name, int age, int prive) {
		this.name = name;
		this.age = age;
		this.price = prive;
	}

	@Override
	public String toString() {
		return "name:" + name + "age:" + age + "price:" + price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrive(int price) {
		this.price = price;
	}

}
