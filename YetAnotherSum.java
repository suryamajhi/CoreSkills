import java.util.*;

public class YetAnotherSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		double sum = 0.0;
		
		for(int i = 0; i < n; i++){
			sum += arr[i];
		}
		for(int i = 0; i < n; i++){
			sum += 1.0/arr[i];
		}
		System.out.println(sum);
	}
}