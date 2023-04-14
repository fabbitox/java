package chapter7;

import java.util.Scanner;

public class Mission5 {
	private int fifty;
	private int ten;
	private int five;
	private int one;
	
	public Misson5(int money) {
		fifty = money / 50;
		money %= 50;
		ten = money / 10;
		money %= 10;
		five = money / 5;
		money %= 5;
		one = money / 1;
	}
	
	public void printResult() {
		System.out.println(String.format("%4s: %4d장", "오만원", fifty));
		System.out.println(String.format("%4s: %4d장", "만원", ten));
		System.out.println(String.format("%4s: %4d장", "오천원", five));
		System.out.println(String.format("%4s: %4d장", "천원", one));
	}
	
	public int getCount() {
		return fifty + ten + five + one;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		Misson5 m = new Misson5(money / 1000);
		m.printResult();
		System.out.println("-".repeat(15));
		System.out.println(String.format("총 %d장 필요합니다", m.getCount()));
		sc.close();
	}
}
