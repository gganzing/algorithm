package leetcode_easy;

//	매개변수로 전달 받은 수가 완벽한 제곱수 인지 판단
//	기본 라이브러리 제곱함수 사용 금지
//	Given a positive integer num, write a function which returns True if num is a perfect square else False.
//	Note: Do not use any built-in library function such as sqrt.

public class ValidPerfectSquare {
	
	public static boolean isPerfectSquare(int num) {
		
//		제곱수의 규칙 : 1+3+5+7+9+...
//		1*1 = 1
//		2*2 = 1+3 => 다음 더해지는 수 2씩 증가
//		3*3 = 1+3+5
//		4*4 = 1+3+5+7
//		5*5 = 1+3+5+7+9
//		6*6 = 1+3+5+7+9+11
//		...
		
		
//		int i = 1;
//		while (num > 0) {
//			num -= i;
//			i += 2;
//		}
//		return num == 0;	
		
		
//		다른 문풀
		// 제곱을 이루기 위한 수의 최소 범위, 최대 범위 
		long l = 1, r = num;
        while(l < r){
		  // 답을 내기 위한 최소 범위 값이 최대 범위를 넘게 되면, 범위 안에서 답이 나오지 않았다는 의미이므로 루프탈출
            long mid = (l + r) / 2; 
            // l < mid < r => 범위 사이의 중간 값을 알기 위함
            if(mid * mid == num){
                return true;
		
            }else if(mid * mid > num){
				// 중간 값의 제곱 값이 num보다 크면, 제곱을 이루기 위한 수의 최대 범위를 줄여줌
                r = mid - 1;
		
            }else{
				// 중간 값의 제곱 값이 num보다 작으면, 제곱을 이루기 위한 수의 최소 범위를 키워줌
                l = mid + 1;
            }
        }
        return l * l == num;
		
		
//		Time Limit Exceeded
//		제곱수의 1자리의 숫자는  0, 1, 4, 5, 6, 9
//		switch(num) {
//		case 2: case 3: case 7: case 8: return false;
//		}
//        
//		for(int i=1; i<=num; i++) {
//			
//			if(i * i == num) {
//				
//				return true;
//			}
//		}
//		return false;
    }
	
	public static void main(String[] args) {
		
//		int num = 216;
		int num = 104976;
//		int num = 14;
//		int num = 1;
		
		System.out.println(isPerfectSquare(num));
		
	}

}
