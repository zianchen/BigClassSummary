package com.laioffer.anson;

public class Closest {
	public int closest(int[] array, int target) {
		if (array == null || array.length == 0) {
			return -1;
		}
		int left = 0, right = array.length - 1;
	    while (left < right - 1) {
	      int mid = left + (right - left) / 2;
	      if (array[mid] == target) {
	        return mid;
	      } else if (array[mid] < target) {
	    	  left = mid;
	      } else {
	    	  right = mid;
	      }
	    }
	    return Math.abs(array[left] - target) - Math.abs(array[right] - target) < 0 ? left : right; 
	}
	public static void main(String[] args) {
		Closest c = new Closest();
		int[][] array = {{},{1,2},{1,2,3},{1,4,6},{1,4,6},{1,3,3,4}};
		int[] target = {0,0,2,3,5,2};
		for(int i = 0; i < array.length; i++){
			int res = c.closest(array[i], target[i]);
			System.out.println("res:"+ res);
		}
	}

}
