import java.util.*;

public class ErasingMaximum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		if(n == 2){
			if(arr[0] < arr[1])
				System.out.println(arr[0]);
			else System.out.println(arr[1]);
		} else {
			int[] temp = new int[n];
			for(int i = 0; i < n; i++) temp[i] = arr[i];
			Arrays.sort(temp);
			int max = temp[n-1];
			if(temp[n-1] == temp[n-3]){
				int x = 0;
				aa:
				for(int i = 0; i < n; i++){
					if(arr[i] == max) {
						if(x != 2){
							System.out.print(arr[i] + " ");
						}
						x = x + 1;
						continue aa;
					}
					System.out.print(arr[i]+" ");
				}
			}else {
				for(int i =0; i < n; i++){
					if(arr[i] != max){
						System.out.print(arr[i] + " ");
					}
				}
			}
			
			
			
			
		}
	}
}