package practice;

import java.util.*;

public class ToggleString {
	 public static void main(String args[] ) throws Exception {

	        //Scanner
	        Scanner s = new Scanner(System.in);
	        String S = s.nextLine();
	        StringBuilder sb = new StringBuilder();
	        
	        
	        for (int i = 0; i < S.length(); i++) {
	            char c = S.charAt(i);
	            String temp = "" + c;
	            if (temp.toLowerCase().equals(temp)) {
	            	sb.append(temp.toUpperCase());
	            } else {
	            	sb.append(temp.toLowerCase());
	            }
	        }
	        
	        System.out.println(sb.toString());
	 }
}
