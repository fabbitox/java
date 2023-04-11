package chapter7;

public class Mission4 {
	public static void main(String[] args) {
		int total = 0;
		int odd = 0;
		int even = 0;
		
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}
			total += i;
		}
		
		System.out.println("Odd sum: " + odd);
		System.out.println("Even sum: " + even);
		System.out.println("Total sum: " + total);
	}
}
