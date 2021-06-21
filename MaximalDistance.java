import java.util.*;

public class MaximalDistance {
	
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minAmt = 0, maxAmt = 0, min = 1, max = 1;
        for(int i = 1; i <= n; i++){
            int x = sc.nextInt();
            if(i == 1){
                minAmt = x;
                maxAmt = x;
            }
            if(x < minAmt){
                min = i;
                minAmt = x;
            }
            if(x > maxAmt){
                max = i;
                maxAmt = x;
            }
            System.out.println(min + " " + max);
        }
    }
}