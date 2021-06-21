import java.util.*;

public class MaximalSumSubArray {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+2];
		long sum = 0;
		for(int i = 1; i <= n; i++){
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		long[] prefixSum = new long[n+2];
		prefixSum[1] = arr[1];
		for(int i = 2; i <= n; i++){
			prefixSum[i] = prefixSum[i-1] + arr[i];
		}
		long[] suffixSum = new long[n+2];
		suffixSum[n] = arr[n];
		for(int i = n - 1; i >= 0; i--){
			suffixSum[i] = suffixSum[i+1] + arr[i];
		}
		long[] minPrefixSum = new long[n+2];
		minPrefixSum[0] = prefixSum[0];
		for(int i = 1; i <= n + 1; i++){
			minPrefixSum[i] = Math.min(minPrefixSum[i-1],prefixSum[i]);
		}
		long[] minSuffixSum = new long[n+2];
		minSuffixSum[n+1] = suffixSum[n+1];
		for(int i = n; i>= 0; i--){
			minSuffixSum[i] = Math.min(minSuffixSum[i+1], suffixSum[i]);
		}
		
		for(int i = 1; i <= n; i++){
			System.out.println(sum - minPrefixSum[i-1] - minSuffixSum[i+1]);
		}
	}
}