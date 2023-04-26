package datastructure.chapter2_basic;

import java.util.Random;

public class Matrix {
	public static void showData(int[][] mat, int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void add(int[][] m1, int[][] m2, int row, int col, int[][] result) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				result[i][j] = m1[i][j] + m2[i][j];
			}
		}
	}
	
	public static void mul(int[][] m1, int[][] m2, int row, int rc, int col, int[][] result) {
		for (int i = 0; i < row; i++) {
			for (int k = 0; k < col; k++) {
				int sum = 0;
				for (int j = 0; j < rc; j++) {
					sum += m1[i][j] * m2[j][k];
				}
				result[i][k] = sum;
			}
		}
	}
	
	private static void trans(int[][] origin, int row, int col, int[][] result) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				result[j][i] = origin[i][j];
			}
		}
	}

	public static void main(String[] args) {
		int[][] a = new int[2][3];
		int[][] b = new int[3][4];
		int[][] c = new int[2][4];// c = a * b
		int[][] a1 = new int[2][3];
		int[][] a2 = new int[2][3];// a2 = a + a1
		int[][] d = new int[3][2];// d = a^T
		
		Random rand = new Random();
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = rand.nextInt(10);
				a1[i][j] = rand.nextInt(10);
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				b[i][j] = rand.nextInt(10);
			}
		}
		
		System.out.println("matrix A");
		showData(a, 2, 3);
		System.out.println();
		System.out.println("matrix B");
		showData(b, 3, 4);
		System.out.println();
		System.out.println("matrix C = A * B");
		mul(a, b, 2, 3, 4, c);
		showData(c, 2, 4);
		System.out.println();
		System.out.println("matrix A1");
		showData(a1, 2, 3);
		System.out.println();
		System.out.println("matrix A2 = A + A1");
		add(a, a1, 2, 3, a2);
		showData(a2, 2, 3);
		System.out.println();
		System.out.println("matrix D = transpose A");
		trans(a, 2, 3, d);
		showData(d, 3, 2);
	}
}
