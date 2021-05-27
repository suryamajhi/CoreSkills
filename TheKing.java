import java.util.*;

public class TheKing{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		long total = r * c;
		long king =(long) (Math.ceil(r * 1.0/3.0) *  Math.ceil(c * 1.0/3.0));
		System.out.println(total - king);
	}
}