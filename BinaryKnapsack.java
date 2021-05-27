import java.util.*;

public class BinaryKnapsack{
    long totalVal = 0;
    public long findMaxValue(long[][] arr, long w){
        recurseAndBacktrack(w, 0, arr, 0);
        return totalVal;
    }
    private void recurseAndBacktrack(long w, long val, long[][] arr, int i){
        if(i<arr.length && w - arr[i][0] < 0){
            if(val > totalVal)
                totalVal = val;
            return;
        }
        if(val > totalVal)
            totalVal = val;
        for(int x = i; x < arr.length; x++){
            recurseAndBacktrack(w - arr[i][0], val + arr[i][1], arr, x + 1);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long w = sc.nextLong();
        long[][] arr = new long[n][2];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < 2; j++)
                arr[i][j] = sc.nextLong();

        BinaryKnapsack bk = new BinaryKnapsack();
        System.out.println(bk.findMaxValue(arr, w));

    }
}