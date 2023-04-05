package chapter4;

public class Mission2 {

	public static void main(String[] args) {
		int[][] a = {{0, 1, 2, 3}, {10, 11, 12, 13}, {20, 21, 22, 23}};
		int[][] b = {{0, 1, 2}, {10, 11, 12}, {20, 21, 22}, {30, 31, 32}};
		
		int[][] result = new int[3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 3; k++) {
				int sum = 0;
				for (int j = 0; j < 4; j++) {
					sum += a[i][j] * b[j][k];
				}
				result[i][k] = sum;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(result[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
}
