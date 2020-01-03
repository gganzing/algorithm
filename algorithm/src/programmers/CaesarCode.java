package programmers;

//	어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 
//	예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다. z는 1만큼 밀면 a가 됩니다. 
//	문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
//	
//	제한 조건
//	공백은 아무리 밀어도 공백입니다.
//	s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
//	s의 길이는 8000이하입니다.
//	n은 1 이상, 25이하인 자연수입니다.

public class CaesarCode {

	public static String solution(String s, int n) {
		
		String answer = "";
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			char code = (char) (s.charAt(i) + n);
			if((c >= 'a' && c <= 'z')) {
				if(code > 'z') {
					code -= 26;
				}
			}else if(c >= 'A' && c <= 'Z'){
				if(code > 'Z') {
					code -= 26;
				}
			}else if(c == ' ') {
				code = c;
			}
			answer += code;
		}
		return answer;
		
		
//		다른문풀
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
