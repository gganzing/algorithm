package programmers;

//	문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
//	예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.
//	
//	제한 사항
//	s는 길이 1 이상, 길이 8 이하인 문자열입니다.

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
		
//		다른 문풀 - 정규표현식
//		if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
//        return false;
		
//		다른 문풀 - 예외처리 이용 문풀, 하지만 이 경우 +123 이나 -123처럼 부호가 정수인 경우 true를 반환
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
