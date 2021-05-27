import java.util.*;

public class CompareSums{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		double sum1 = 0.0;
		double sum2 = 0.0;
		for(int i = 0; i < l; i++){
			sum1 += sc.nextDouble() * 1000;
		}
		for(int i = 0; i < l; i++){
			sum2 +=  sc.nextDouble() * 1000;
		}
		if(sum1 == sum2) System.out.println("SUM(A)=SUM(B)");
		else if(sum1 > sum2) System.out.println("SUM(A)>SUM(B)");
		else System.out.println("SUM(A)<SUM(B)");
	}
}