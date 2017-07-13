package graphtheory;

import java.util.*;

public class AdjacencyMatrix {

    public static void main(String args[] ) throws Exception {

        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int[][] matrix = new int[N][N];

        for (int i = 0; i < M; i++) {
            int A = s.nextInt() - 1;
            int B = s.nextInt() - 1;
            matrix[A][B] = 1;
            matrix[B][A] = 1;
            
        }
        
        int Q = s.nextInt();
        for (int i = 0; i < Q; i++) {
            int A = s.nextInt() - 1;
            int B = s.nextInt() - 1;
            if (matrix[A][B] == 1) {
            	System.out.println("YES");
            } else {
            	System.out.println("NO");
            }
            
        }
        

    }
}
