package programmers;

import java.util.Calendar;
import java.util.GregorianCalendar;

//	2016�� Ư�� ��¥�� ���� ��ȯ�ϱ�
//	2016�� 1�� 1���� �ݿ����Դϴ�. 2016�� a�� b���� ���� �����ϱ��? 
//	�� �� a ,b�� �Է¹޾� 2016�� a�� b���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 
//	������ �̸��� �Ͽ��Ϻ��� ����ϱ��� ���� SUN,MON,TUE,WED,THU,FRI,SAT�Դϴ�. 
//	���� ��� a=5, b=24��� 5�� 24���� ȭ�����̹Ƿ� ���ڿ� TUE�� ��ȯ�ϼ���.
//	
//	���� ����
//	2016���� �����Դϴ�. [2/29]
//	2016�� a�� b���� ������ �ִ� ���Դϴ�. (13�� 26���̳� 2�� 45�ϰ��� ��¥�� �־����� �ʽ��ϴ�)
//	����� ��
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
