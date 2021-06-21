import java.util.*;

public class ManhattanDistance {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=1,b=1, c=1,d=1, maxdiff=Integer.MIN_VALUE,maxsum=Integer.MIN_VALUE, mindiff=Integer.MAX_VALUE,minsum=Integer.MAX_VALUE;
		for(int i = 1; i <= n; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(i == 1){
				maxdiff = x - y;
				maxsum = x + y;
				mindiff = x - y;
				minsum = x + y;
			}
			if(x + y > maxsum){
				maxsum  = x + y;
				a = i;
			}
			if (x+y<minsum){
				minsum=x+y;
				b=i;
			}
			if(x - y > maxdiff){
				maxdiff  = x - y;
				c = i;
			}
			if (x-y<mindiff){
				mindiff=x-y;
				d=i;
			}
			if(maxsum - minsum > maxdiff - mindiff)
				System.out.println(a+" "+b );
			else System.out.println(c+" "+d);
		}
	}
}