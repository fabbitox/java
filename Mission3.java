package chapter5;

public class Mission3 {

	public static void main(String[] args) {
		int[] leaps = new int[10];
		int count = 0;
		int year = 2024;
		
		while (count < 10) {
			if (year % 100 != 0) {
				leaps[count++] = year;
			} else if (year % 400 == 0) {
				leaps[count++] = year;
			}
			year += 4;
		}
		
		for (int y: leaps) {
			System.out.print(y + "\t");
		}
		System.out.println();
	}
	
}
