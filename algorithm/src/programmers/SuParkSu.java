package programmers;

//	���� �α��ڰ� �־��� ���ڸ�ŭ �ݺ��� �������� ��µǴ� ���α׷� �ۼ�
//	���̰� n�̰�, ���ڼ��ڼ��ڼ�....�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 
//	������� n�� 4�̸� ���ڼ����� �����ϰ� 3�̶�� ���ڼ��� �����ϸ� �˴ϴ�.
//	���� ���� => n�� ���� 10,000������ �ڿ����Դϴ�.
//	����� ��
//	3	���ڼ�
//	4	���ڼ���

public class SuParkSu {
	
	public static String solution(int n) {
		
	      String answer = "";
	      String pattern = "����";
	      
	      for(int i=0; i<n; i++) {
	    	  answer += pattern.charAt(i%2);
	      }
	      
	      return answer;
	  }

	public static void main(String[] args) {
		
//		int n = 3;
		int n = 4;
		System.out.println(solution(n));
		
	}
}
