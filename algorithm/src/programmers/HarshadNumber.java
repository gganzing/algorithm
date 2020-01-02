package programmers;

//	���� ���� x�� �ϻ��� ���̷��� x�� �ڸ����� ������ x�� ���������� �մϴ�. 
//	���� ��� 18�� �ڸ��� ���� 1+8=9�̰�, 18�� 9�� ������ �������Ƿ� 18�� �ϻ��� ���Դϴ�. 
//	�ڿ��� x�� �Է¹޾� x�� �ϻ��� ������ �ƴ��� �˻��ϴ� �Լ�, solution�� �ϼ����ּ���.

public class HarshadNumber {

	public static boolean solution(int x) {
		
		boolean answer = true;
		
		int sum = 0;
		int n = x;
		while(n != 0) {
			sum += n % 10;
			n /= 10;
		}
		
		if(x % sum != 0) {
			answer = false;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
//		int x = 18;
		int x = 13;
		System.out.println(solution(x));
		
	}
	
}
