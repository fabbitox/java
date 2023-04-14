package chapter8;

import java.util.Scanner;

public class Mission6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dec = sc.nextInt();
		
		String bin = "";
		while (dec > 0) {
			bin += dec % 2;
			dec /= 2;
		}
		
		System.out.println(new StringBuilder(bin).reverse());
		
		sc.close();
	}
}
