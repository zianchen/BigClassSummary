package com.laioffer.anson;

import util.Print;

public class SearchMatrix {
	public int[] search(int[][] matrix, int target) {
		if (matrix.length == 0 || matrix[0].length == 0) {
			return new int[] {-1, -1};
		}
		int N = matrix.length;
		int M = matrix[0].length;
		int left = 0;
		int right = N * M - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			int row = mid / M;
			int col = mid % M;
			if (matrix[row][col] == target) {
				return new int[] {row, col};
			} else if (matrix[row][col] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return new int[]{-1, -1};
	}

	public static void main (String[] args) {
		SearchMatrix sm = new SearchMatrix();
		int[][] test = {{1, 2, 3}, {4, 5, 7}, {8, 9, 10}};
		int[] target = {7, 6};
		for (int i = 0; i < target.length; i++) {
			int[] res = sm.search(test, target[i]);
			Print.print1DArray(res);
		}
	}
}


