package programmers;

//	임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
//	n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
//	n은 1이상, 50000000000000 이하인 양의 정수입니다.
//	input	output
//	121		144
//	3		-1

public class IdentifySquare {

	public static long solution(long n) {
		
//		통과
		long answer = -1;
		
		long r = (long) Math.sqrt(n);
		if(r * r ==  n) {
			
			return (r+1) * (r+1);
		}
		
		return answer;
		
		
//		다른 문풀
//		if(n==1){
//	          return 4;
//	      }
//	      for(long i=2;i<n;i++){
//	          if(n/i == i && n%i ==0){
//	              return (i+1)*(i+1);
//	          }
//	      }
//	      return -1;
		
//		long i = 1;
//		while (i * i <= n) {
//			if (n / i == i && n % i == 0) {
//				return (i + 1) * (i + 1);
//			}
//			i++;
//		}
//		return -1;
		
		
//		다른 문풀
//		long answer = 0;
//		String s = String.valueOf(Math.sqrt(n));
//		int cnt = s.indexOf('.');
//		System.out.println(s.substring(cnt).length());
//		if (s.substring(cnt).length() != 2)
//			answer = -1;
//		else
//			answer = (long) Math.pow((Math.sqrt(n) + 1), 2);
//		return answer;
		
		
//		부족한 부분이 뭔지 모르겠음 ㅠ_ㅠ
//		2,4,11,12 테스트 케이스 불통/ 테스트 케이스를 알고 싶다.. 그래야 뭘 잘 못 했는지 알텐디ㅠㅠ
//		long answer = -1;
//		
//		long start = 1;
//		long end = n;
//		while(start < end) {
//			long mid = (start + end) / 2;
//			
//			if(mid * mid == n) {
//				return (mid+1)*(mid+1);
//				
//			}else if(mid * mid < n) {
//				start = mid + 1;
//				
//			}else if(mid * mid > n){
//				end = mid - 1;
//			}
//		}
//		
//		if(start * start == n) {
//			
//			return (start+1)*(start+1);
//		}
//		
//		return answer;
		
		
//		시간초과
//		long answer = -1;
//		
//		int i = 1;
//		int s = 0;
//		while(s < n) {
//			s += i;
//			i += 2;
//		}
//		
//		if(s == n) {
//			long r = (long) Math.sqrt(s);
//			answer = (r+1) * (r+1);
//		}
//		
//		return answer;
	}
	
	public static void main(String[] args) {
		
//		long n = 121;
		long n = 3;
//		long n = 1;
		System.out.println(solution(n));
		
	}
	
}
