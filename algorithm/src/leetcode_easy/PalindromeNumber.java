package leetcode_easy;

/*
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
반대방향으로 읽어도 같은 숫자인지 판별하기

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Follow up:
Coud you solve it without converting the integer to a string?
String으로 변환 없이 문제 풀어보기
*/

public class PalindromeNumber {

	public static boolean isPalindrome(int x) {
	        
		boolean re = false;
		
		if( x < 0) {
			return re;
		}
		
		int res = 0;
		int num = x;
		while( num != 0) {
			res = res * 10;
			res = res + (num % 10);
			num = num / 10;
		}
		
		if( res == x ) {
			re = true;
		}
		
		return re;
	}
	
	public static void main(String[] args) {
		
		System.out.println(isPalindrome(2));
		
	}
	
}
