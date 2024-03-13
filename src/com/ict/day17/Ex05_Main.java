package com.ict.day17;

public class Ex05_Main {
	public static void main(String[] args) {
		Ex05 test = new Ex05();
		
		new Thread(test, "dog").start();
		new Thread(test, "cat").start();
		new Thread(test, "lion").start();
		System.out.println("main : " + Thread.currentThread().getName());
	}
}
