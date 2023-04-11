package chapter7;

import java.util.Scanner;

public class Mission4_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		while (n <= 0) {
			n = sc.nextInt();
		}
		
		int total = n * (n + 1) / 2;
		int even = (n / 2) * (n / 2 + 1);
		int odd = total - even;
		
		System.out.println("Odd sum: " + odd);
		System.out.println("Even sum: " + even);
		System.out.println("Total sum: " + total);
		
		sc.close();
	}
}
