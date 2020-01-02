package programmers;

//	������ ���� ���� n�� ����, n�� � ���� ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�.
//	n�� ���� ���� x�� �����̶�� x+1�� ������ �����ϰ�, n�� ���� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���.
//	n�� 1�̻�, 50000000000000 ������ ���� �����Դϴ�.
//	input	output
//	121		144
//	3		-1

public class IdentifySquare {

	public static long solution(long n) {
		
//		���
		long answer = -1;
		
		long r = (long) Math.sqrt(n);
		if(r * r ==  n) {
			
			return (r+1) * (r+1);
		}
		
		return answer;
		
		
//		�ٸ� ��Ǯ
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
		
		
//		�ٸ� ��Ǯ
//		long answer = 0;
//		String s = String.valueOf(Math.sqrt(n));
//		int cnt = s.indexOf('.');
//		System.out.println(s.substring(cnt).length());
//		if (s.substring(cnt).length() != 2)
//			answer = -1;
//		else
//			answer = (long) Math.pow((Math.sqrt(n) + 1), 2);
//		return answer;
		
		
//		������ �κ��� ���� �𸣰��� ��_��
//		2,4,11,12 �׽�Ʈ ���̽� ����/ �׽�Ʈ ���̽��� �˰� �ʹ�.. �׷��� �� �� �� �ߴ��� ���ٵ�Ф�
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
		
		
//		�ð��ʰ�
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
