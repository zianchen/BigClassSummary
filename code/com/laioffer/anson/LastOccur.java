package com.laioffer.anson;

public class LastOccur {
//	sol1: provide by qingyuan wen
//	public int lastOccur(int[] array, int target) {
//		if (array == null || array.length == 0) {
//			return -1;
//		}
//		int left = 0, right = array.length - 1;
//		while (left < right) {
//			int mid = left + (right - left) / 2;
//			if (array[mid] == target) {
//				if (array[mid + 1] != target) {
//					return mid;
//				} else {
//					left = mid + 1;
//				}
//			} else if (array[mid] < target) {
//				left = mid + 1;
//			} else {
//				right = mid - 1;
//			}
//		}
//		if (left >= array.length || array[left] != target) {
//			return -1;
//		}
//		return left;
//	}

	// sol2 provide by Fangrong peng 偏右取整	
	public int lastOccur(int[] array, int target) {
		if (array == null || array.length == 0) {
			return -1;
		}
		int left = 0, right = array.length - 1;
		while (left < right) {
			int mid = left + (right - left + 1) / 2;
			if (array[mid] == target) {
				left = mid;
			} else if (array[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		if (left >= array.length || array[left] != target) {
			return -1;
		}
		return left;
	}
	
	public static void main (String[] args) {
		LastOccur lo = new LastOccur();
		int[][] array = {{},{1,2},{1,2,3},{1,2,3},{1,2,2,2,3},{1,2,2,2,4,5,8,13,13}};
		int[] target = {0,0,2,4,2,5};
		for(int i = 0; i < array.length; i++){
			int res = lo.lastOccur(array[i], target[i]);
			System.out.println("res:"+ res);
		}
	}
}
