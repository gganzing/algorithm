package programmers;

//	��� ���� ��������
//	�ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.
//	
//	���ѻ���
//	s�� ���̰� 1 �̻�, 100������ ��Ʈ���Դϴ�.
//	����� ��
//	s		return
//	abcde	c
//	qwer	we

public class GetCenterLetter {

	public static String solution(String s) {
		
		String answer = "";
		int center = s.length() / 2;
		
		if(s.length() % 2 == 0) {
//			 					�����[����], �����[������]
			answer = s.substring(center-1, center+1);
			
		}else {
			answer = String.valueOf(s.charAt(center));
		}
		
		return answer;
		
//		�ٸ� ��Ǯ
//		return s.substring((s.length()-1) / 2, s.length()/2 + 1);
		
	}
	
	public static void main(String[] args) {
		
//		String s = "qwer";
//		String s = "q";
		String s = "abcde";
		System.out.println(solution(s));
		
	}
	
}
