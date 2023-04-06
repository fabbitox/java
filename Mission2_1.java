package chapter4;

import java.util.Scanner;

public class Mission2_1 {
	private int[][] a;
	private int[][] b;
	int row;
	int col;
	
	void createMat() {
		Scanner sc = new Scanner(System.in);
		System.out.print("# of Rows: ");
		row = sc.nextInt();
		System.out.print("# of Columns: ");
		col = sc.nextInt();
		System.out.println();
		a = new int[row][col];
		b = new int[col][row];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("Matrix A[" + i + "][" + j + "]: ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print("Matrix B[" + i + "][" + j + "]: ");
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		sc.close();
	}
	
	void matMul() {
		for (int i = 0; i < row; i++) {
			for (int k = 0; k < row; k++) {
				int sum = 0;
				for (int j = 0; j < col; j++) {
					sum += a[i][j] * b[j][k];
				}
				System.out.print(sum + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Mission2_1 m = new Mission2_1();
		m.createMat();
		m.matMul();
	}
}
