package programmers;

import java.util.Arrays;

//	자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
//	예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

public class ReverseNumToArray {

	public static int[] solution(long n) {
		
//		다른 문풀
//		String s = n+"";
//		int cnt = s.length(); 
		
		int cnt = 0;
		long temp = n;
		while(temp > 0) {
			temp = temp / 10;
			cnt++;
		}
		
		int[] answer = new int[cnt];
		int i = 0;
		while(n > 0) {
			int res = (int) (n % 10);
			answer[i] = res;
			n = n / 10;
			i++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		int n = 12345;
		System.out.println(Arrays.toString(solution(n)));
		
	}
	
}
