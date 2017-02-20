package com.laioffer.anson;

interface Dictionary {
	public Integer get(int index);
}

public class SearchDictionary {
	// Not very good implementation, take sample solution as reference.
	public int search(Dictionary dict, int target) {
		if (dict == null) {
			return -1;
		}
		int left = 0; 
		int right = findRightBound(dict, target);
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (dict.get(mid) == target) {
				return mid;
			} else if (dict.get(mid) < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}
	private int findRightBound(Dictionary dict, int target) {
//		int curEnd = 0; should start from 1, otherwise curEnd always 0*2 = 0;
		int curEnd = 1;
		while (dict.get(curEnd) != null) {
			int element = dict.get(curEnd);
			if (element >= target) {
				return curEnd;
			}
			curEnd *= 2;
		}
		return curEnd;
	}
	public static void main(String[] args) {

	}

}
