import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class TheMostFrequentSymbol {

    public static void main(String[] args){
        FastReader sc = new FastReader();
        String s = sc.next();
        int n = s.length();
        int[][] matrix = new int[26][n + 1];
        for(int i = 1; i <= s.length(); i++){
            char ch = s.charAt(i-1);
            ++matrix[ch-'a'][i];
            for(int j = 0; j < 26; j++){
                matrix[j][i] += matrix[j][i-1];
            }
        }
        int q = sc.nextInt();
        while(q--> 0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            --l;
            int max = 0;
            int mP = 0;
            for(int i = 0; i < 26; i++){
                if(max < matrix[i][r] - matrix[i][l]){
                    max = matrix[i][r] - matrix[i][l];
                    mP = i;
                }
            }
            System.out.println((char)('a' + mP));
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}