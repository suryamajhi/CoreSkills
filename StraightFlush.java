import java.util.*;

public class StraightFlush{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] flush = new String[5];
		for(int i = 0; i < 5; i++) flush[i] = sc.next();		
		String card = "0A23456789TJQK";
		if(isSame(flush)){
			int[] arr = new int[5];
			for(int i = 0; i < flush.length;i++){
				arr[i] = card.indexOf(flush[i].charAt(0));
			}
			Arrays.sort(arr);
			if(isAceHighFlush(arr)){
				System.out.println("YES");
				return;
			}
			for(int i = 0; i < 4; i++){
				if(arr[i] != arr[i+1] - 1){
					System.out.println("NO");
					return;
				}
			}
			System.out.println("YES");
		}else System.out.println("NO");	
	}
	
	private static boolean isSame(String[] flush){
		for(int i = 0; i < flush.length - 1; i++){
			if(flush[i].charAt(1) != flush[i+1].charAt(1)){
				return false;
			}
		}
		return true;
	}
	private static boolean isAceHighFlush(int[] arr){
		if(arr[0] == 1){
			int x = 10;
			for(int i = 1; i < 5; i++){
				if(arr[i] != x++)
					return false;
			}
			return true;
		}
		return false;
	}
}