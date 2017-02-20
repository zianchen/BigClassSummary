package com.laioffer.anson;

public class FirstOccur {
	public int firstOccur(int[] array, int target) {
		if (array == null || array.length == 0 ) {
			return -1;
		}
		int left = 0;
		int right = array.length - 1;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (array[mid] == target) {
				right = mid;
			} else if (array[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		if (right == -1 || array[right] != target) {
			return -1;
		}
		return right;
	}
	public static void main(String[] args){
		FirstOccur fo = new FirstOccur();
		int[][] array = {{},{1,2},{1,2,3},{1,2,3},{1,2,2,2,3},{1,2,2,2,4,5,8,13,13}};
		int[] target = {0,0,2,4,2,5};
		for(int i = 0; i < array.length; i++){
			int res = fo.firstOccur(array[i], target[i]);
			System.out.println("res:"+ res);
		}
	}
}
