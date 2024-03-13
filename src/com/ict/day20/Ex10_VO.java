package com.ict.day20;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// 객체의 정보를 담을 수 있는 멤버 변수로 구성
// 2. Externalizable 인터페이스 구현 (추상메서드
public class Ex10_VO implements Externalizable{
	// 제외시키고자 하는 멤버는 추가하지 않으면 됨
	// writeExternal(), readExternal() 모두 제외시켜야 함
	// writeExternal(), readExternal() 배치 순서도 같아야 함
	private String name;
	private int age;
	private double weigth;
	private boolean gender;
	
	public Ex10_VO() {
	}

	
	public Ex10_VO(String name, int age, double weigth, boolean gender) {
		this.name = name;
		this.age = age;
		this.weigth = weigth;
		this.gender = gender;
	}
	

	// 직렬화 대상 넣기
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeObject(age);
		out.writeObject(weigth);
		out.writeObject(gender);
	}

	// 역직렬화 대상 넣기
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// 순서 같게
		name = (String) in.readObject();
		age = (int) in.readObject();
		weigth = (double) in.readObject();
		gender = (boolean) in.readObject();
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


	public double getWeigth() {
		return weigth;
	}


	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}


	public boolean isGender() {
		return gender;
	}


	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
	
	

}
