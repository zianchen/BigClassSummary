package com.laioffer.anson;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumber {
	// public long fibonacci(int K) {
	// 	int[] fib = new int[K];
	// 	if (K <= 0) return 0;
	// 	if (K == 1) return 1;
	// 	fib[0] = 0; 
	// 	fib[1] = 1;
	// 	return fibHelper(fib, K);
	// }
	
	// public long fibHelper(int[] fib, int K){
	// 	if (K <= 1) return fib[K];
	// 	fib[K] = fib[K-1] + fib[K-2];
	// 	return fib[K];
	// }

	public long fibonacci(int K) {
		if (K <= 0) return 0;
		Map<Integer, Long> fibMap = new HashMap();
		return fib(K, fibMap);
	}
	
	public long fib(int K, Map<Integer, Long> map){
		if (K == 0) return 0;
		if (K == 1) return 1;
		if (!map.containsKey(K-1)) {
			map.put(K-1, fib(K-1, map));
		}
		long k1 = map.get(K-1);
		if (!map.containsKey(K-2)) {
			map.put(K-2, fib(K-2, map));
		}
		long k2 = map.get(K-2);
		return k1 + k2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciNumber fn = new FibonacciNumber();
		int[] testArr = new int[]{0,1,2,3,6};
		for (int i = 0; i < testArr.length; i++) {
			long res = fn.fibonacci(testArr[i]);
			System.out.println(res);
		}
	}

}
