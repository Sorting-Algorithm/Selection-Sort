package com.sorting.algorithm;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = { 12, 29, 27, 4, 8, 11, 32, 1 };
		selectionSortAlgorithm(arr);
		for (int value : arr) {
			System.out.print(value + " ");
		}
	}

	private static void selectionSortAlgorithm(int arr[]) {
		int min, temp = 0;
		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
}
