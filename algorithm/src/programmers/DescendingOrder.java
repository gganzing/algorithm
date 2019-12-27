package programmers;

import java.util.Arrays;

//	�Լ� solution�� ���� n�� �Ű������� �Է¹޽��ϴ�. 
//	n�� �� �ڸ����� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���. 
//	������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.
//	
//	* ���� ����
//	n�� 1�̻� 8000000000 ������ �ڿ����Դϴ�.

public class DescendingOrder {

	public static long solution(long n) {
		
		long answer = 0;
		
		String l = Long.toString(n);
		int[] arr = new int[l.length()];
		
		for(int i=0; i<l.length(); i++) {
			arr[i] = Integer.parseInt(l.charAt(i)+"");
		}
		
		Arrays.sort(arr);
		
		for(int j=arr.length-1; j>=0; j--) {
			answer = answer * 10 + arr[j];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		long n = 118372;
		System.out.println(solution(n));
		
	}
	
}
