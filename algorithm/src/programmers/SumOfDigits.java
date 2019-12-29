package programmers;

//	��� �ڸ������� ��
//	N = 123�̸� 1 + 2 + 3 = 6�� return

public class SumOfDigits {

	public static int solution(int n) {
		
        int answer = 0;
        while(n > 0) {
        	int res = n % 10;
        	answer += res;
        	n = n / 10;
        }

        return answer;
    }
	
	public static void main(String[] args) {
		
		int n = 123;
		System.out.println(solution(n));
		
	}
	
}
