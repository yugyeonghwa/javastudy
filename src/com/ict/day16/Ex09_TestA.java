package com.ict.day16;

public class Ex09_TestA implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("aaa : " + Thread.currentThread().getName());
		}
	}
}
