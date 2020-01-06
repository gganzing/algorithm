package programmers;

import java.util.Calendar;
import java.util.GregorianCalendar;

//	2016년 특정 날짜의 요일 반환하기
//	2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 
//	두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 
//	요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다. 
//	예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.
//	
//	제한 조건
//	2016년은 윤년입니다. [2/29]
//	2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
//	입출력 예
//	a	b	result
//	5	24	TUE

public class DayOfWeek {

	public static String solution(int a, int b) {
		
//		Calendar >> 1 : sun ~ 7 : sat
//		String days[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
//		
//		Calendar >> month : 0 ~ 11
//		GregorianCalendar cal = new GregorianCalendar(2016, a-1, b);
//		int day = cal.get(Calendar.DAY_OF_WEEK);
//		
//		String answer = days[day-1];
//		
//		return answer;
		
		String days[] = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
		int last_dates[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//		2016.01.01.fri(days[0])
		
		for(int i=0; i<a-1; i++) {
			b += last_dates[i];
		}
		
		return days[(b - 1) % 7];
	}
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 24;
		System.out.println(solution(a, b));
		
	}
	
}
