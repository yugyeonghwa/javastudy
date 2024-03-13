package com.ict.day16;

// 스레들 만들어서 처리하려면 
public class Ex08_TestA extends Thread {

//	@Override
//	public synchronized void start() {
//		for (int i = 0; i < 100; i++) {
//			System.out.println("aaa : " + i + Thread.currentThread().getName());
//		}
//	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("aaa : " + i + Thread.currentThread().getName());
		}
	}

}
