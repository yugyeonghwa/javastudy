package com.ict.day06;

public class Ex03 {
	public static void main(String[] args) {
		// 다중 for 문에서 break 와 continue
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (i==2) break;
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		System.out.println();
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (j==3) break;
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		System.out.println();
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (i==2) continue;
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		System.out.println();
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (j==3) continue;
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		
		
	}
}
