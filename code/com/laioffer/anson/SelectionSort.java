package com.laioffer.anson;

public class SelectionSort {
	public int[] solve(int[] array){
		if(array == null || array.length <= 1)
			return array;
		int len = array.length;
		// find smallest element from unsorted part and put it on left side of unsorted part
		for (int i = 0; i < len; i++){
			for (int j = i+1; j < len; j++){
				if(array[j] < array[i]){
					array[i] ^= array[j];
					array[j] ^= array[i];
					array[i] ^= array[j];
				}
			}
		}
		return array;
	}
	public void print(int[] arr){
		for (int k = 0; k < arr.length; k++){
			System.out.print(" ,"+arr[k]);
		}
	}
	public static void main(String[] args){
		SelectionSort ss = new SelectionSort();
		int[][] testArr = {{1},{1,2,3},{3,2,1},{4,2,-3,6,1}};
		for (int i = 0; i < testArr.length;i++){
			ss.print(ss.solve(testArr[i]));
			System.out.println();
		}
	}
}


