package com.laioffer.anson;

import util.Print; 

public class SelectionSort {
	public int[] solve(int[] array){
		if(array == null || array.length <= 1)
			return array;
		int len = array.length;
		// find smallest element from unsorted part and put it on left side of unsorted part
		// for (int i = 0; i < len; i++){
		// 	for (int j = i+1; j < len; j++){
		// 		if(array[j] < array[i]){
		// 			array[i] ^= array[j];
		// 			array[j] ^= array[i];
		// 			array[i] ^= array[j];
		// 		}
		// 	}
		// }

		// 1. don't need to loop to len for i, just len-1 is ok
		// 2. don't need to swap every time we find array[j] < array[i], just store the index and find the index with the smallest element, then swap once.
		// 3. don't use ^= to do the swap.
		for (int i = 0; i < len-1; i++){
			int min = i;
			for (int j = i+1; j < len; j++){
				if (array[j] < array[min]){
					min = j;
				}
			}
			swap(array, i, min);
		}
		return array;
	}

	public void swap(int[] arr, int left, int right){
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}

	public static void main(String[] args){
		SelectionSort ss = new SelectionSort();
		int[][] testArr = {{1},{1,2,3},{3,2,1},{4,2,-3,6,1}};
		for (int i = 0; i < testArr.length;i++){
			ss.solve(testArr[i]);
			Print.print1DArray(testArr[i]);
		}
	}
}


