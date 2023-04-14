package chapter8;

import java.util.Scanner;

public class Mission7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 더 큰 수가 na
		int na;
		int nb;
		if (a > b) {
			na = a;
			nb = b;
		} else if (a == b) {
			System.out.println("최대공약수: " + a);
			System.out.println("최소공배수: " + b);
			sc.close();
			return;
		} else {
			na = b;
			nb = a;
		}
		
		int rem = na % nb;
		while (rem != 0) {
			na = nb;
			nb = rem;
			rem = na % nb;
		}
		
		System.out.println("최대공약수: " + nb);
		System.out.println("최소공배수: " + a * b / nb);
		
		sc.close();
	}
}
