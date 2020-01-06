package programmers;

//	���ڿ� s�� ���̰� 4 Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ�����ִ� �Լ�, solution�� �ϼ��ϼ���. 
//	���� ��� s�� a234�̸� False�� �����ϰ� 1234��� True�� �����ϸ� �˴ϴ�.
//	
//	���� ����
//	s�� ���� 1 �̻�, ���� 8 ������ ���ڿ��Դϴ�.

public class BasicString {

	public static boolean solution(String s) {
		
		boolean answer = false;
		
		if(s.length() != 4 && s.length() != 6) {
			
			return false;
		}
		
		int check = 0;
		for(int i=0; i<s.length(); i++) {
			if(!Character.isDigit(s.charAt(i))) {
				break;
				
			}else {
				check++;
			}
		}
		
		if(check == s.length()) {
			answer = true;
		}
		
		return answer;
		
//		�ٸ� ��Ǯ - ����ǥ����
//		if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
//        return false;
		
//		�ٸ� ��Ǯ - ����ó�� �̿� ��Ǯ, ������ �� ��� +123 �̳� -123ó�� ��ȣ�� ������ ��� true�� ��ȯ
//		if(s.length() == 4 || s.length() == 6){
//	          try{
//	              int x = Integer.parseInt(s);
//	              return true;
		
//	          } catch(NumberFormatException e){
//	              return false;
//	          }
//	      }
//	      else return false;
		
	}
	
	public static void main(String[] args) {
		
//		String s = "a234";
		String s = "a23";
//		String s = "1234";
		System.out.println(solution(s));
		
	}
	
}
