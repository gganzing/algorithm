package programmers;

import java.util.Arrays;

//	�ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. 
//	������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.

public class ReverseNumToArray {

	public static int[] solution(long n) {
		
//		�ٸ� ��Ǯ
//		String s = n+"";
//		int cnt = s.length(); 
		
		int cnt = 0;
		long temp = n;
		while(temp > 0) {
			temp = temp / 10;
			cnt++;
		}
		
		int[] answer = new int[cnt];
		int i = 0;
		while(n > 0) {
			int res = (int) (n % 10);
			answer[i] = res;
			n = n / 10;
			i++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		int n = 12345;
		System.out.println(Arrays.toString(solution(n)));
		
	}
	
}
