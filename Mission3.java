package chapter5;

public class Mission3 {

	public static void main(String[] args) {
		int[] leaps = new int[40];
		int count = 0;
		int year = 2024;
		
		while (count < 40) {
			if (year % 100 != 0) {
				leaps[count++] = year;
			} else if (year % 400 == 0) {
				leaps[count++] = year;
			}
			year += 4;
		}
		
		for (int i = 0; i < 40; i++) {
			System.out.print(leaps[i] + "\t");
			if (i % 5 == 4) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
}
