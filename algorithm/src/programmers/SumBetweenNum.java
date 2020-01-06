package programmers;

//	�� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
//	���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.
//	
//	���� ����
//	a�� b�� ���� ���� �� �� �ƹ� ���� �����ϼ���.
//	a�� b�� -10,000,000 �̻� 10,000,000 ������ �����Դϴ�.
//	a�� b�� ��Ұ���� ���������� �ʽ��ϴ�.

public class SumBetweenNum {

	public static long solution(int a, int b) {
		
		long answer = 0;
		int small = a;
		int big = b;
		if(a > b) {
			small = b;
			big = a;
		}
		
		for(int i=small; i<=big; i++) {
			answer += i;
		}
		
		return answer;
	}
	
	
//	�ٸ� ��Ǯ
//	���������� �� ���� �̿�
//	public long solution(int a, int b) {
//        return sumAtoB(Math.min(a, b), Math.max(b, a));
//    }
//
//    private long sumAtoB(long a, long b) {
//        return (b - a + 1) * (a + b) / 2;
//    }
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = 5;
		System.out.println(solution(a, b));
		
	}
}
