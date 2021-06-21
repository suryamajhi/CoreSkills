import java.util.*;

public class MultiSet {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[100002];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		while(n-->0){
			int l = sc.nextInt();
			int r = sc.nextInt();
			if(r > max){
				max = r;
			}
			if(l < min){
				min = l;
			}
			arr[l]++;
			arr[r+1]--;
		}
		int update = 0;
		for(int i = min; i <= max; i++){
			int val = update + arr[i];
			if(val != 0) 
				System.out.println(i + " " + val);
			update = arr[i] + update;
		}
	}
}