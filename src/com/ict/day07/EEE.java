package com.ict.day07;

public class EEE {
	public static void main(String[] args) {
		int[] su = {3,4,9,8,2,1,7,10,5,6};
		
		int tmp = 0;
		for (int i = 0; i < su.length -1; i++) {
			for (int j = i+1; j < su.length; j++) {
				if(su[i] > su[j]) {
					tmp = su[i];
					su[i] = su[j];
					su[j] = tmp;
				}
				
			}
		}
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
