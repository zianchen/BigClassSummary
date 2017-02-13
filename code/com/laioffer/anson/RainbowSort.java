package com.laioffer.anson;

import util.Print;

public class RainbowSort {
	public int[] rainbowSort(int[] array) {
		if(array.length <= 1){
			return array;
		}
		int i = 0, j = 0, k = array.length - 1;
		while(j <= k){
			if(array[j] == -1){
				array = swap(array, i, j);
				i++;
				j++;
			} else if (array[j] == 0){
				j++;
			} else {
				array = swap(array, j, k);
				k--;
			}
		}
		return array;
	}
	private int[] swap(int[] array, int a, int b){
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		return array;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RainbowSort rs = new RainbowSort();
		int[][] testArr = {{0},{1,0},{1,0,1,-1,0}};
		for (int k = 0; k < testArr.length; k++){
			rs.rainbowSort(testArr[k]);
			Print.print1DArray(testArr[k]);
		}
	}
}

/*
 * -1 -1 i 0 0 j . .k 1 1 1
 * [0, i)  -1
 * [i, j)  0
 * [j, k]  unsolved
 * (k, end] 1
 * */
