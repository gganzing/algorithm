package programmers;

//	Ȧ¦ �Ǻ�
//	���� num�� ¦���� ��� Even�� ��ȯ�ϰ� Ȧ���� ��� Odd�� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.

public class OddOrEven {

	public String solution(int num) {
		
		String answer = "Even";
		
		if(num % 2 != 0) {
			
			answer = "Odd";
		}
		
		return answer;
	}
	
	
}
