package com.laioffer.anson;

import util.Print;  

public class QuickSort {
	public int[] quickSort(int[] array) {
		// choose pivot, Two baffle three interval
		if(array == null || array.length <= 1) {
			return array;
		}
		quickSortHelper(array, 0, array.length - 1);
		return array;
	}
	public void quickSortHelper(int[] arr, int low, int high){
		//base case
		if (low > high){
			return;
		}
		int pivotIndex = high;
		int pivot = arr[high];
		int i = low, j = high-1;
		while(i <= j){
			if(arr[i] < pivot){
				i++;
			} else{
				arr = swap(arr, i, j);
				j--;
			}
		}
		swap(arr, i, pivotIndex);
//		quickSortHelper(arr, low, j);  this is also correct but i-1 will be easier to understand.
		quickSortHelper(arr, low, i-1);
		quickSortHelper(arr, i+1, high);
	}
	private int[] swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		int[][] testArr = {{1},{1,2,3},{3,2,1},{1,3,5,7,9,8,6,4,2,0}};
		for(int i = 0; i < testArr.length; i++){
			qs.quickSort(testArr[i]);
			Print.print1DArray(testArr[i]);
		}
	}

}

