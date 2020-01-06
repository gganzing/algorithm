package programmers;

import java.util.Arrays;

//	문자열 내림차순 정렬하기
//	문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
//	s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
//	
//	제한 사항
//	str은 길이 1 이상인 문자열입니다.
//	입출력 예
//	s		return
//	Zbcdefg	gfedcbZ

public class StringDescendingOrder {

	public static String solution(String s) {
		
		char arr[] = s.toCharArray();
		Arrays.sort(arr);
		String answer = "";
		for(char c : arr) {
			answer = c + answer;
		}
		
//		배열 역순 정렬
//		Arrays.sort(arry,  Collections.reverseOrder());
		
//		StringBuffer, StringBuilder 클래스에서 글자 뒤집기[.reverse()] 가능
//		new StringBuilder(new String(sol)).reverse().toString()
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		String s ="Zbcdefg";
		System.out.println(solution(s));
		
	}
	
}
