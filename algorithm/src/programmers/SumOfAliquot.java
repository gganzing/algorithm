package programmers;

//	���� n�� �Է¹޾� n�� ����� ��� ���� ���� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
//	
//	���� ����
//	n�� 0 �̻� 3000������ �����Դϴ�.

public class SumOfAliquot {
	
	public static int solution(int n) {
		
		int answer = 0;
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				answer += i;
			}
		}
		
		return answer;
		
//		�ٸ� ��Ǯ
//		int answer = 0;
//		for (int i = 1; i <= num / 2; i++) {
//			if (num % i == 0)
//				answer += i;
//		}
//		return answer + num;
		
	}

	public static void main(String[] args) {
		
//		int n = 12;
		int n = 5;
		System.out.println(solution(n));
		
	}
	
}
