package chapter8;

import java.util.Scanner;

public class Mission9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int weight = sc.nextInt();
		
		while (weight < 10 || weight > 100) {
			System.out.println("10 이상 100 이하의 수를 입력하세요");
			weight = sc.nextInt();
		}
		// 1개 이상씩 사용되어야 하기 때문에 1개씩 씀
		int two = 1;
		int three = 1;
		int five = 1;
		for (; two <= 10; two++) {
			for (three = 1; three <= 10; three++) {
				for (five = 1; five <= 10; five++) {
					int val = two * 2 + three * 3 + five * 5;
					if (val > weight) {
						break;
					}
					if (val == weight) {
						System.out.println("(" + two + ", " + three + ", " + five + ")");
					}
				}
			}
		}
		
		sc.close();
	}
}
