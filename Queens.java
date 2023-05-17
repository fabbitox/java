package datastructure.chapter4_stackandqueue;

import java.util.Scanner;

public class Queens {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Queens >> ");
		int n = sc.nextInt();
		GenericStack<Point> board = new GenericStack<>(n);
		int i = 0;
		int j = 0;
		while (i < n) {
			for (; j < n; j++) {
				int i2 = 0;
				for (; i2 < i; i2++) {// 앞에 놓인 것이랑 충돌 확인
					Point p = board.get(i2);
					int x = p.getX();
					int y = p.getY();
					if (y == j || Math.abs(x - i) == Math.abs(y - j)) {// 충돌하면 다음 위치 찾아봐야지
						break;
					}
				}
				if (i2 == i) {// 충돌 안 했다
					Point pnew = new Point(i, j);
					board.push(pnew);
					i++;
					j = -1;
					if (board.isFull()) {
						board.dump();
					}
				}
			}
			if (i > 0) {// 앞으로 돌아감
				Point p = board.pop();
				i--;
				j = p.getY() + 1;
			} else {
				break;
			}
		}
		sc.close();
	}
}
