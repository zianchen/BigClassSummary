package com.laioffer.anson;

public class MergeSort {
  public int[] mergeSort(int[] array) {
    // if I have two sorted subarray, I can do the merge
    if(array == null || array.length <= 1){
      return array;
    }
    return mergeSortHelper(array, 0, array.length-1);
  }
  
  public int[] mergeSortHelper(int[] arr, int start, int end){
    // base case
    if(start == end){
      return new int[]{arr[start]};
    }
    int mid = start + (end - start) / 2;
    int[] left = mergeSortHelper(arr, start, mid);
    int[] right = mergeSortHelper(arr, mid+1, end);
    return merge(left, right);
  }
  
  public int[] merge(int[] l, int[] r){
    int i = 0, j = 0, k = 0;
    int[] res = new int[l.length + r.length];
    while (i < l.length && j < r.length){
      if(l[i] < r[j]){
        res[k++] = l[i++];
      } else {
        res[k++] = r[j++];
      }
    }
    while(i < l.length){
      res[k++] = l[i++];
    }
    while(j < r.length){
      res[k++] = r[j++];
    }
    return res;
  }
}

// time complexity: O(nlogn)
// space complexity: O(n)
