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
				while (two >= 0 && three <= 9) {
					if (two <= 9)
						System.out.println("(" + (two + 1) + ", " + (three + 1) + ", " + (i + 1) + ")");
					two -= 3;
					three += 2;
				}
				break;
			case 1:
				two = divide2 - 1;
				three = 1;
				while (two >= 0 && three <= 9) {
					if (two <= 9)
						System.out.println("(" + (two + 1) + ", " + (three + 1) + ", " + (i + 1) + ")");
					two -= 3;
					three += 2;
				}
				break;
			}
		}

		sc.close();
	}
}
