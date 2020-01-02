package programmers;

import java.util.Arrays;
import java.util.HashSet;

//	최대공약수, 최소공배수 구하기
//	input	output
//	3	12	[3, 12]
//	2	5	[1, 10]

public class CommonNumber {

	public static int[] solution(int n, int m) {
		
//		두 수의 곱 = 최대공약수 * 최소공배수
//		최소공배수 = 두 수의 곱 / 최대공약수
		int[] answer = new int[2];
		int aliquot = 1;
				
		for(int i=2; i<=m; i++) {
			if(n % i == 0 && m % i == 0) {
				aliquot = i;
			}
		}
		
		answer[0] = aliquot;
		answer[1] =  n * m / aliquot;
		
		return answer;
		
		
//		* 유클리드 호제법 - 보기
//		public int[] gcdlcm(int a, int b) {
//	        int[] answer = new int[2];
//
//	          answer[0] = gcd(a,b);
//	        answer[1] = (a*b)/answer[0];
//	        return answer;
//	    }
//
//	   public static int gcd(int p, int q)
//	   {
//	    if (q == 0) return p;
//	    return gcd(q, p%q);
//	   }
		
		
//		int[] answer = new int[2];
//		
//		int aliquot  = 1;
//		int multiple = 0;
//		
//		int small = n;
//		int big = m;
//		if(n > m) {
//			small = m;
//			big = n;
//		}
//		
//		for(int i=2; i<=small; i++) {
//			if(n % i == 0 && m % i == 0) {
//				aliquot = i;
//			}
//		}
//		
//		int j = 1;
//		HashSet<Integer> set = new HashSet<Integer>();
//		while(true) {
//			set.add(big * j);
//			
//			if(set.contains(small * j)) {
//				multiple = small * j;
//				break;
//			}
//			
//			j++;
//		}
//
//		answer[0] = aliquot;
//		answer[1] = multiple;
//		
//		return answer;
		
	}
	
	public static void main(String[] args) {
		
		int n = 3;
		int m = 12;
		System.out.println(Arrays.toString(solution(n, m)));
		
	}
}
