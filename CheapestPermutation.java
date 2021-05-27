import java.util.*;

public class CheapestPermutation{
	
	int[][] arrMatrix;
	int min = Integer.MAX_VALUE;
	int[] result;
	public CheapestPermutation(int[][] arrMatrix){
		this.arrMatrix = arrMatrix;
	}
	
	private void findSum(int[] a, int n){
		int sum = 0;
		for(int i = 0; i < n - 1; i++){
			sum += arrMatrix[a[i]-1][a[i+1]-1];
		}
		if(sum < min){
			min = sum;
			result = Arrays.copyOf(a,a.length);
		}
	}
	
	// Generating permutation using Heap Algorithm
    void heapPermutation(int a[], int size, int n)
    {
        // if size becomes 1 then prints the obtained
        // permutation
        if (size == 1)
            findSum(a, n);
 
        for (int i = 0; i < size; i++) {
            heapPermutation(a, size - 1, n);
 
            // if size is odd, swap 0th i.e (first) and
            // (size-1)th i.e (last) element
            if (size % 2 == 1) {
                int temp = a[0];
                a[0] = a[size - 1];
                a[size - 1] = temp;
            }
 
            // If size is even, swap ith
            // and (size-1)th i.e last element
            else {
                int temp = a[i];
                a[i] = a[size - 1];
                a[size - 1] = temp;
            }
        }
    }
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arrMatrix = new int[n][n];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				arrMatrix[i][j] = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = i + 1;
		CheapestPermutation cp = new CheapestPermutation(arrMatrix);
		cp.heapPermutation(arr,arr.length, arr.length);
		for(int i = 0; i < n;i++){
			System.out.print(cp.result[i] + " ");
		}
	}
	
}