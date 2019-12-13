package leetcode_easy;

import java.util.HashSet;

//	��Ģ�� ���� ������ ���� ���� 1�̸� happy number, true ��ȯ
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
//	*1�� ��ȯ�ϴ� happy number�� �ƴ� ���, �ش� ������ ��� ���� ������ ���Ե� 
//	=> ������ ����Ǿ��� ���� ���� �� �� ���Դٸ�, ���ѷ�����[false Ż������!]

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
			
		
//		Time Limit Exceeded/ ������ �ƴϸ� Ż�� �Ұ����� �ڵ�..
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
