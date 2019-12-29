package programmers;

//	���α׷��ӽ� ������� �������� ��ȣ�� ���� �������� ���� �� ������ ��ȭ��ȣ�� �Ϻθ� �����ϴ�.
//	��ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, ��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ� ���� *���� ���� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
//	
//	���� ����
//	s�� ���� 4 �̻�, 20������ ���ڿ��Դϴ�.
//	01033334444 ->	*******4444

public class HidePhoneNumber {

	public static String solution(String phone_number) {
		
		String answer = "";
		
		for(int i=0; i<phone_number.length(); i++) {
			
			if(i<phone_number.length()-4) {
				answer += "*";
				
			}else {
				answer += phone_number.charAt(i);
			}
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		String phone_number = "01033334444";
		System.out.println(solution(phone_number));
		
	}
	
}
