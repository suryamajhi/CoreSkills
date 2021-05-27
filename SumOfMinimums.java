import java.util.*;

public class SumOfMinimums{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		long sum = 0;
		for(int i = 0; i < n; i++){
			int[] temp = new int[n-i];
			temp[0] = arr[i];
			sum += temp[0];
			for(int j = 1; j < temp.length; j++){
				temp[j] = Math.min(temp[j-1], arr[i + j]); 
				sum += temp[j];
			}
		}
		System.out.println(sum);
	}
}