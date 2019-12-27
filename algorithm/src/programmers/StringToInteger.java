package programmers;

//	문자열을 정수로 변환

public class StringToInteger {

	public static int solution(String str) {
		
//		return Integer.parseInt(str);
		
//		다른 문풀 : Integer.parseInt 쪼개 보기
		boolean sign = true;
		int result = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '-') {
				//sign은 양수, 음수를 판별하기 위함
				sign = false;
			
			// '-'부호가 result값에 연산되어 포함되지 않게 하기 위함
			}else if (ch != '-') {
				// 아스키코드 '0' = 48 ~ '9' = 57
				// result에 누적하여 반복문을 돌면서 10이 곱해지면, 최종적으로 자신의 자릿수만큼 곱해짐
				result = result * 10 + (ch - '0');
			}
		}
		
		return sign ? result : -1 * result;
	}
	
	public static void main(String[] args) {
		
		String str = "-139892324";
		System.out.println(solution(str));
		
	}
}
