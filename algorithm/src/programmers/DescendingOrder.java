package programmers;

import java.util.Arrays;

//	함수 solution은 정수 n을 매개변수로 입력받습니다. 
//	n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
//	예를들어 n이 118372면 873211을 리턴하면 됩니다.
//	
//	* 제한 조건
//	n은 1이상 8000000000 이하인 자연수입니다.

public class DescendingOrder {

	public static long solution(long n) {
		
		long answer = 0;
		
		String l = Long.toString(n);
		int[] arr = new int[l.length()];
		
		for(int i=0; i<l.length(); i++) {
			arr[i] = Integer.parseInt(l.charAt(i)+"");
		}
		
		Arrays.sort(arr);
		
		for(int j=arr.length-1; j>=0; j--) {
			answer = answer * 10 + arr[j];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		long n = 118372;
		System.out.println(solution(n));
		
	}
	
}
