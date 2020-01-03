package programmers;

//	1부터 입력받은 숫자 n사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
//	소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다. (1은 소수가 아닙니다.)
//	
//	제한 조건
//	n은 2이상 1000000이하의 자연수입니다.
//
//	입출력 예 #1
//	1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4 반환
//	입출력 예 #2
//	1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3 반환

public class FindPrimes {
	
	public static int solution(int n) {
		
		int answer = 0;
		boolean numbers[] = new boolean[n+1];
		
		for(int i=2; i<numbers.length; i++) {
			
			if(numbers[i] == false) {
				answer++;
				
				for(int j=2; n>=i*j; j++) {
					numbers[i*j] = true;
				}
			}
			
		}
		return answer;
		
		
//		다른 문풀
//		int result = 0;
//		for (int i = 2; i <= n; i++) {
//			for (int j = 2; j <= i; j++) {
//				if (j == i) {
//					++result;
//				} else if (i % j == 0) {
//					break;
//				}
//			}
//		}
//
//		return result;
	}
	
	public static void main(String[] args) {
		
		int n = 10;
		System.out.println(solution(n));
		
	}

}
