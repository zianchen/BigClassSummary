package com.laioffer.anson;

public class MoveZero {
	public int[] moveZero(int[] array) {
		if(array == null || array.length <= 1){
			return array;
		}
		int i = 0, j = array.length-1;
		while(i <= j){
			if(array[i] != 0){
				i++;
			}else{
				array = swap(array, i, j);
				j--;
			}
		}
		return array;
	}  
	private int[] swap(int[] array, int i, int j) {
		// TODO Auto-generated method stub
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		return array;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*
	algorithm: quick sort
	*/
}
