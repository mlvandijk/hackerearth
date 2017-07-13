package practice;

import java.util.*;

public class TerribleChandu {
	 public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        s.nextLine();

        for (int i = 0; i < N; i++) {
            String S = s.nextLine();
            List<Character> letters = new ArrayList<>();
            for (int j = 0; j < S.length(); j++) {
            	letters.add(S.charAt(j));
            }
            Collections.reverse(letters);
            for (int j = 0; j < S.length(); j++) {
            	System.out.print(letters.get(j));
            }
            System.out.println();	            
        }
    }
}

