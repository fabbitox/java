package datastructure.chapter2_basic;

import java.util.Random;

public class RandArr {
	static void getData(int[] data) {
		Random rand = new Random();
		for (int i = 0; i < data.length; i++) {
			data[i] = rand.nextInt(100);
		}
	}
	
	static void showData(int[] data) {
		System.out.print("Data: ");
		for (int d: data) {
			System.out.print(d + " ");
		}
		System.out.println();
	}
	
	static int findMax(int[] data) {
		int maxVal = data[0];
		for (int d: data) {
			if (d > maxVal) {
				maxVal = d;
			}
		}
		return maxVal;
	}
	
	static void sortData(int[] data) {
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] > data[j]) {
					swap(data, i, j);
				}
			}
		}
	}
	
	static void swap(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] data = new int[10];
		getData(data);
		showData(data);
		int maxVal = findMax(data);
		System.out.println("max = " + maxVal);
		sortData(data);
		System.out.print("after sort: ");
		showData(data);
	}
}
