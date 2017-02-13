package com.laioffer.anson;

import util.Print;

public class Solution {
	private void swap (int[] arr, int left, int right){
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	public static void main(String[] args){
		Solution s = new Solution();
		int[] array = {1,2,3};
		s.swap(array, 0, 2);
		Print.print1DArray(array);
	}
}

