package com.ict.homewoke;

public class Ex01 {
	public static void main(String[] args) {
		// 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오
		int sum = 0;
		int cnt = 0;
		for (int i = 1; sum <= 99; i++) {
			if(i%2==0) {
				sum = sum - i;
			}else {
				sum = sum + i;
			}
			cnt = i;
		}
		System.out.println(cnt);
	}
}
