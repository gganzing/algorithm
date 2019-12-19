package leetcode_easy;

import java.util.Arrays;

//	�迭 �� ���ڸ� �Ųٷ� ������ ��ȯ
//	���ο� �迭�� ������ �ʰ� �� �迭 ������ ������ �ذ��ϱ�
//	Write a function that reverses a string. The input string is given as an array of characters char[].
//	Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
//	You may assume all the characters consist of printable ascii characters.
//	Input: ['h','e','l','l','o']
//	Output: ['o','l','l','e','h']

public class ReverseString {

	public static void reverseString(char[] s) {
		
		int j= s.length-1;
		char temp = 0;
		for(int i=0; i<j; i++) {
			temp = s[i];
			s[i] = s[j];
			s[j--] = temp;
		}
        
//		ȿ�� ���� ����, �ٽ� �����ϱ�
//		String str = "";
//		for(char c : s) {
//			str += c;
//		}
//		
//		int j = 0;
//		for(int i=s.length-1; i>=0; i--) {
//			s[i] = str.charAt(j++);
//		}
		
		System.out.println(Arrays.toString(s));
		
    }
	
	public static void main(String[] args) {

		char []s = {'h','e','l','l','o'};
		reverseString(s);
		
	}
}
