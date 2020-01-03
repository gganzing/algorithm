package programmers;

//	1���� �Է¹��� ���� n���̿� �ִ� �Ҽ��� ������ ��ȯ�ϴ� �Լ�, solution�� ����� ������.
//	�Ҽ��� 1�� �ڱ� �ڽ����θ� ���������� ���� �ǹ��մϴ�. (1�� �Ҽ��� �ƴմϴ�.)
//	
//	���� ����
//	n�� 2�̻� 1000000������ �ڿ����Դϴ�.
//
//	����� �� #1
//	1���� 10 ������ �Ҽ��� [2,3,5,7] 4���� �����ϹǷ� 4 ��ȯ
//	����� �� #2
//	1���� 5 ������ �Ҽ��� [2,3,5] 3���� �����ϹǷ� 3 ��ȯ

public class FindPrimes {
	
	public static int solution(int n) {
		
		int answer = 0;
		boolean numbers[] = new boolean[n+1];
		
		for(int i=2; i<numbers.length; i++) {
			
			if(numbers[i] == false) {
				answer++;
				
				for(int j=2; n>=i*j; j++) {
					numbers[i*j] = true;
				}
			}
			
		}
		return answer;
		
		
//		�ٸ� ��Ǯ
//		int result = 0;
//		for (int i = 2; i <= n; i++) {
//			for (int j = 2; j <= i; j++) {
//				if (j == i) {
//					++result;
//				} else if (i % j == 0) {
//					break;
//				}
//			}
//		}
//
//		return result;
	}
	
	public static void main(String[] args) {
		
		int n = 10;
		System.out.println(solution(n));
		
	}

}
