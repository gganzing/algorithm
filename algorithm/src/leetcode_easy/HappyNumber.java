package leetcode_easy;

import java.util.HashSet;

//	규칙에 따라 연산한 최종 값이 1이면 happy number, true 반환
//	Write an algorithm to determine if a number is "happy".
//	A happy number is a number defined by the following process: Starting with any positive integer, 
//	replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), 
//	or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
//	
//	Input: 19
//	Output: true
//	Explanation: 
//	1^2 + 9^2 = 82
//	8^2 + 2^2 = 68
//	6^2 + 8^2 = 100
//	1^2 + 0^2 + 0^2 = 1
//	*1을 반환하는 happy number가 아닐 경우, 해당 연산이 계속 무한 루프를 돌게됨 
//	=> 이전에 연산되었던 값이 연산 중 또 나왔다면, 무한루프행[false 탈출지점!]

public class HappyNumber {
	
	public static boolean isHappy(int n) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(set.add(n)) {
			
			int sum = 0;
			
			while(n>0) {
				
				sum += Math.pow(n%10, 2);
				n = n/10;
			}
			
			if(sum == 1) {
				
				return true;
			}
			n = sum;
		}
		
		return false;
			
		
//		Time Limit Exceeded/ 정답이 아니면 탈출 불가능한 코드..
//		String num = n+"";
//		try {
//			while(n > 1) {
//				int sum = 0;
//				for(int i=0; i<num.length(); i++) {
//					int row = Integer.parseInt(num.charAt(i)+"");
//					sum += Math.pow(row, 2);
//				}
//				num = sum+"";
//				n = Integer.parseInt(num);
//			}
//			if(n == 1) {
//				happy = true;
//			}
//		}catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
    }
	
	public static void main(String[] args) {
		
		System.out.println(isHappy(19));
		
	}

}
