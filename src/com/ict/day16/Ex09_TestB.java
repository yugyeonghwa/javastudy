package com.ict.day16;

public class Ex09_TestB implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("가가가 : " + Thread.currentThread().getName());
		}
	}
}
