package chapter8;

import java.util.Scanner;

public class Mission8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print(n + "! = ");
		
		int fact = 1;
		for (int i = n; i > 1; i--) {
			fact *= i;
			System.out.print(i + " * ");
		}
		System.out.println("1 = " + fact);
		
		sc.close();
	}
}
