package leetcode_easy;

import java.util.ArrayList;

//	Given a positive integer, return its corresponding column title as appear in an Excel sheet.
//	1 	=> "A"
//	28 	=> "AB"
//	701	=> "ZY"

public class ExcelSheetColumnTitle {

	public static String convertToTitle(int n) {
		
		String answer = "";
		
	    while(n != 0) {
	    	// A => 0 ~ Z => 25
	        char ch = (char)((n - 1) % 26 + 'A');
	        n = (n - 1) / 26;
	        answer = ch + answer;
	    }
	    
	    return answer;

	}
	
	public static void main(String[] args) {
		
//		int n = 1;
//		int n = 26;
//		int n = 27;
//		int n = 28;
//		int n = 25;
		int n = 701;
		System.out.println(convertToTitle(n));
		
	}
	
}
