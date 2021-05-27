import java.util.*;

public class RoundUp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println((int)Math.ceil((double)x/(double)y));
	}
}