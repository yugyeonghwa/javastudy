package com.ict.day17;

public class Ex06_Main {
	public static void main(String[] args) {
		Ex06_Car c = new Ex06_Car();
		
		Ex06_Producer producer = new Ex06_Producer(c);
		Thread tProducer = new Thread(producer);
		
		Ex06_Customer customer = new Ex06_Customer(c);
		Thread tCustomer = new Thread(customer);
		
		tProducer.start();
		tCustomer.start();
		
	}
}
