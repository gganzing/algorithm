package programmers;

import java.util.Arrays;

//	���ڿ� �������� �����ϱ�
//	���ڿ� s�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
//	s�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.
//	
//	���� ����
//	str�� ���� 1 �̻��� ���ڿ��Դϴ�.
//	����� ��
//	s		return
//	Zbcdefg	gfedcbZ

public class StringDescendingOrder {

	public static String solution(String s) {
		
		char arr[] = s.toCharArray();
		Arrays.sort(arr);
		String answer = "";
		for(char c : arr) {
			answer = c + answer;
		}
		
//		�迭 ���� ����
//		Arrays.sort(arry,  Collections.reverseOrder());
		
//		StringBuffer, StringBuilder Ŭ�������� ���� ������[.reverse()] ����
//		new StringBuilder(new String(sol)).reverse().toString()
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		String s ="Zbcdefg";
		System.out.println(solution(s));
		
	}
	
}
