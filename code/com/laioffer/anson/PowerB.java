public class PowerB {
  // public long power(int a, int b) {
  //   if (b == 0) return 1;
		// if (a == 0) return 0;
		// long multiple = power(a, b/2) * power(a, b/2);
		// if (b % 2 == 0) {
		// 	return multiple;
		// }
		// return multiple * a;
  // }
  public long power(int a, int b) {
    if (b == 0) {
      return 1;
    }
    if (a == 0) {
      return 0;
    }
    long half = power(a, b / 2);
    return b % 2 == 0 ? half * half : half * half * a;
  }
}