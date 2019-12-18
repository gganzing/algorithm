package leetcode_easy;

//	입력받은 n의 n!의 값이 포함하고 있는 0의 개수를 반환
//	Given an integer n, return the number of trailing zeroes in n!.
//		Input: 3
//		Output: 0
//		Explanation: 3! = 6, no trailing zero.
//
//		Input: 5
//		Output: 1
//		Explanation: 5! = 120, one trailing zero.
//	Your solution should be in logarithmic time complexity.


public class FactorialTrailingZeroes {

	public static int trailingZeroes(int n) {
		
//		끝자리가 0의 의미 => 10 = 2 * 5 ; 5의 배수의 개수를 구하기!
//		but, 5의 배수의 안에는 25 = 5 * 5인 애들이 존재(5의 제곱수들)
//		-> 이것을 구하기 위해 5의 배수의 개수를 다시 5로 나누어 더 이상 나눠지는 숫자가 없을 때까지 나눈 수를 모두 합한 것이 최종 값임
//		ex) n = 100이면, temp = n/ 5 = 20
//		temp라는 것은 결국 5의 배수의 숫자인데, 이는 아래의 예시처럼 해당 숫자들이 5*1부터 temp까지 이루어진 것임
//		따라서 5의 배수의 숫자를 5로 나눈 숫자는 그 안의 5의 개수를 찾도록 해줌!
//		더이상 5로 나눠떨어지지 않을때까지 계속 나누어 그 개수를 합한 것이 최종 답!
//		 5	5x1
//		10	5x2
//		15	5x3
//		20	5x4
//		25	5x5
//		30	5x6
//		35	5x7
//		40	5x8
//		45	5x9
//		50	5x10 = 5 x 2x5 -> 5가 두 개 존재 하는 것
//		55	5x11
//		60	5x12
//		65	5x13
//		70	5x14
//		75	5x15
//		80	5x16
//		85	5x17
//		90	5x18
//		95	5x19
//		100	5x20
		
		int count = 0;
		
        while (n != 0) {
            int tmp = n / 5;
            count += tmp;
            n = tmp;
        }
        
        return count;
        
        /*
        if(n < 5)
			return 0;
		else
			return (n / 5) + trailingZeroes(n / 5);
        */
        
//		int r = 0;
//		// 담을 수 있는 범위를 초과한 수는 어떻게 처리할 것인가..
//		long mul = 1;
//		
//		for(int i=n; i>0; i--) {
//			mul *= i;
//		}
//		
//		String multi = mul+""; 
//		
//		while(multi.endsWith("0")) {
//			
//			multi = multi.substring(0, multi.length()-1);
//			r++;
//			
//		}
//		
//		return r;
		
    }
	
	public static void main(String[] args) {
		
		System.out.println(trailingZeroes(125));
		
	}
	
}
