package programmers;

//	� ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�. 
//	���� ��� AB�� 1��ŭ �и� BC�� �ǰ�, 3��ŭ �и� DE�� �˴ϴ�. z�� 1��ŭ �и� a�� �˴ϴ�. 
//	���ڿ� s�� �Ÿ� n�� �Է¹޾� s�� n��ŭ �� ��ȣ���� ����� �Լ�, solution�� �ϼ��� ������.
//	
//	���� ����
//	������ �ƹ��� �о �����Դϴ�.
//	s�� ���ĺ� �ҹ���, �빮��, �������θ� �̷���� �ֽ��ϴ�.
//	s�� ���̴� 8000�����Դϴ�.
//	n�� 1 �̻�, 25������ �ڿ����Դϴ�.

public class CaesarCode {

	public static String solution(String s, int n) {
		
		String answer = "";
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			char code = (char) (s.charAt(i) + n);
			
			if(c >= 'a' && c <= 'z' && code > 'z') {
				code -= 26;
				
			}else if(c >= 'A' && c <= 'Z' && code > 'Z'){
				code -= 26;
				
			}else if(c == ' ') {
				code = c;
			}
			
			answer += code;
		}
		return answer;
		
		
//		�ٸ���Ǯ
//		String result = "";
//		n = n % 26;
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			if (Character.isLowerCase(ch)) {
//				ch = (char) ((ch - 'a' + n) % 26 + 'a');
//			} else if (Character.isUpperCase(ch)) {
//				ch = (char) ((ch - 'A' + n) % 26 + 'A');
//			}
//			result += ch;
//		}
//		return result;
		
	}
	
	public static void main(String[] args) {
		
//		String s ="AB";
		String s ="a b";
//		String s ="z";
		int n = 1;
		System.out.println(solution(s, n));
		
	}
	
}
