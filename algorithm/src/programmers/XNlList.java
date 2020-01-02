package programmers;

import java.util.Arrays;

//	�Լ� solution�� ���� x�� �ڿ��� n�� �Է� �޾�, x���� ������ x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�. 
//	���� ���� ������ ����, ������ �����ϴ� �Լ�, solution�� �ϼ����ּ���.
//	x�� -10000000 �̻�, 10000000 ������ �����Դϴ�.
//	n�� 1000 ������ �ڿ����Դϴ�.
//	
//	x	n	answer
//	2	5	[2,4,6,8,10]
//	4	3	[4,8,12]
//	-4	2	[-4, -8]

public class XNlList {

	public static long[] solution(int x, int n) {
		
		long[] answer = new long[n];
		
		long r = 0;
		for(int i=0; i<n; i++) {
			r += x;
			answer[i] = r;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		int x = 2;
		int n = 5;
		System.out.println(Arrays.toString(solution(x, n)));
		
	}
	
}
