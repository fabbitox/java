package chapter3;

import java.util.Scanner;

public class Mission1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int kor, eng, math;
			System.out.print("국어 점수: ");
			kor = sc.nextInt();
			if (kor < 0 || kor > 100) {
				sc.close();
				System.out.println("잘못된 점수, 프로그램을 종료합니다.");
				break;
			}
			System.out.print("영어 점수: ");
			eng = sc.nextInt();
			if (eng < 0 || eng > 100) {
				sc.close();
				System.out.println("잘못된 점수, 프로그램을 종료합니다.");
				break;
			}
			System.out.print("수학 점수: ");
			math = sc.nextInt();
			if (math < 0 || math > 100) {
				sc.close();
				System.out.println("잘못된 점수, 프로그램을 종료합니다.");
				break;
			}
			int sum = kor + eng + math;
			System.out.println("총계: " + sum);
			System.out.println("평균: " + Math.round(sum / 3.0 * 100) / 100.0);
			if (kor < 60 || eng < 60 || math < 60) {
				System.out.println("과락");
			} else {
				System.out.println(sum >= 210 ? "통과" : "불통");
			}
			System.out.println();
		}
	}

}
