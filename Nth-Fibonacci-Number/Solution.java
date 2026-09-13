class Solution {
	static int nthFibonacci(int n) {
		// code here
		int arr[] = new int[n + 1];
		return fib(n, arr);
	}
	static int fib(int n, int[] arr) {
		if (n <= 1) {
			return n;
		}
		if (arr[n] != 0) {
			return arr[n];
		}
		arr[n] = fib(n - 1, arr) + fib(n - 2, arr);
		return arr[n];
	}
}
