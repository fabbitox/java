package chapter8;

import java.util.Scanner;

public class Mission9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int weight = sc.nextInt();

		int coreW = weight - 10;
		int remW;
		int two;
		int three;

		for (int i = 0; i < 10; i++) {
			remW = coreW - i * 5;
			int divide2 = remW / 2;
			switch (remW % 2) {
			case 0:
				two = divide2;
				three = 0;
				if (divide2 > 9) {// skip invalid answers
					int count = (divide2 - 7) / 3;// makes two 7, 8 or 9
					two -= count * 3;
					three += count * 2;
				}
				printAnswer(two, three, i);
				break;
			case 1:
				two = divide2 - 1;
				three = 1;
				if (divide2 > 9) {
					int count = (divide2 - 7) / 3;
					two -= count * 3;
					three += count * 2;
				}
				printAnswer(two, three, i);
				break;
			}
		}

		sc.close();
	}

	private static void printAnswer(int two, int three, int i) {
		while (two >= 0 && three <= 9) {
			System.out.println("(" + (two + 1) + ", " + (three + 1) + ", " + (i + 1) + ")");
			two -= 3;
			three += 2;
		}
	}
}
