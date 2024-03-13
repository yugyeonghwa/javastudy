package com.ict.day10;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		
		Ex09 coff = new Ex09();
		
		// coff. 			// private 은 저장도 안되고, 가져올 수도 없다.
		// coff.name = "";
		
		coff.sName("커피음료");	
		coff.sPrice(1500);
		
		Ex09 ion = new Ex09();	
		ion.sName("이온음료");		//	setter 
		ion.sPrice(2300);		//	값을 넣어서 세팅해 준다.
		
		Ex09 cola = new Ex09();
		cola.sName("탄산음료");
		cola.sPrice(2000);
		
		Ex09 juice = new Ex09();
		juice.sName("과일음료");
		juice.sPrice(1800);
		
		Ex09[] arr = {coff, ion, cola, juice};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 투입하세요 >> ");
		int input = scan.nextInt();
		
		//	

		if (input < 1500) {
			System.out.print("금액이 부족합니다.");
			System.out.println("잔돈 : " + input);
		} else {
			esc : while (true) {
				System.out.println("커피\t이온\t탄산\t과일\t반환");
				for (int i = 0; i < arr.length; i++) {
					if (arr[i].gPrice() <= input) {
						System.out.print(" O\t");
					} else {
						System.out.print(" X\t");
					}
				}
				System.out.println();
				System.out.print("선택하세요 >> ");
				String drink = scan.next();
				int output = 0;

				switch (drink) {
				case "커피":
					output = input - arr[0].gPrice();
					break;
				case "이온":
					output = input - arr[1].gPrice();
					break;
				case "탄산":
					output = input - arr[2].gPrice();
					break;
				case "과일":
					output = input - arr[3].gPrice();
					break;					
				case "반환":
					System.out.println("잔돈 : " + input); ;
					break esc ;	
				}
				System.out.println("잔돈 : " + output);
				if(output < 1500) break esc;
				input = output;		
			}

		}

		
		
		
		
	}
}
