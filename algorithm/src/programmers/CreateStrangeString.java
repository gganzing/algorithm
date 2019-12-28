package programmers;

//	문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
//	각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
//	
//	* 제한 사항
//	문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
//	첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
//	input : try hello world  /	output : TrY HeLlO WoRlD


public class CreateStrangeString {

	public static String solution(String s) {
		
		String answer = "";
		int idx = 0;
		
		for(int i=0; i<s.length(); i++) {
			String letter = s.charAt(i)+"";
			
			if(!letter.equals(" ")) {
				if(idx % 2 == 0) {
					letter = letter.toUpperCase();
					
				}else {
					letter = letter.toLowerCase();
				}
				idx++;
				
			}else {
				idx = 0;
			}
			answer += letter;
		}
		
		return answer;
		
		
//		String answer = "";
//		limit 에 '-1'을 안 넣을 경우, 뒤의 공백은 포함시키지 못함
//		String arr[] = s.split(" ", -1);
//
//		for(String str : arr) {
//			for(int i=0; i<str.length(); i++) {
//				String add = str.charAt(i)+"";
//				
//				if(i % 2 == 0) {
//					add = add.toUpperCase();
//					
//				}else {
//					add = add.toLowerCase();
//				}
//				answer += add;
//			}
//			answer += " ";
//		}
//		
//		return answer.substring(0, answer.length()-1);
	}
	
	public static void main(String[] args) {
		
		String s = "try    hello world  ";
		System.out.println(solution(s));
		
	}
	
}
