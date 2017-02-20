package com.laioffer.anson;

import util.Print;

public class KClosest {
	public int[] kClosest(int[] array, int target, int k) {
		if (array.length == 0) {
			return array;
		}
		if (k == 0) {
			return new int[]{};
		}
		// idx is guaranteed to be valid according to assumption
		int idx = closest(array, target);
		int[] res = new int[k];
		res[0] = array[idx];
		int left = idx - 1;
		int right = idx + 1;
		for (int i = 1; i < k; i++) {
			if (left >= 0 && right < array.length) {
				if (Math.abs(array[left] - target) - Math.abs(array[right] - target) <= 0) {
					res[i] = array[left];
					left--;
				} else {
					res[i] = array[right];
					right++;
				}
			} else {
				if (left >= 0) {
					res[i] = array[left];
					left--;
				}
				if (right < array.length) {
					res[i] = array[right];
					right++;
				}
			}
		}
		return res;
	}
	
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
		KClosest kc = new KClosest();
		int[][] array = {{},{1,2},{1,2,3},{1,4,6,8},{1,5},{1,5}};
		int[] target = {0,0,2,3,0,2};
		int[] kArr = {0,1,3,3,0,2};
		for(int i = 0; i < array.length; i++){
			int[] res = kc.kClosest(array[i], target[i], kArr[i]);
			Print.print1DArray(res);
		}
	}
}
