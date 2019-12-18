package leetcode_easy;

import java.util.ArrayList;

//	매개변수 숫자 미만의 범위의 소수의 개수를 출력
//	Count the number of prime numbers less than a non-negative number, n.
//	Input: 10
//	Output: 4
//	Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

public class CountPrimes {
	
	public static int countPrimes(int n) {
		
		int count=0;
		boolean arr[] = new boolean[n];
		
		for(int i=2; i<n; i++) {
			
			if(arr[i] == false) {
				count++;
				
				for(int j=2; i*j<n; j++) {
					arr[i*j] = true;
//				2의 배수부터 차례대로 배수는 제거[배수라는건 해당수로 나눠지는 수라는 의미 -> 소수가 아님]
//				모든 수의 배수를 다 반복문 돌려서 제거할 필요 없음, false인 애들만 앞에서 제거되지 않은 소수, 이들의 배수만 제거
				}
			}
		}
        
        return count;
        
		
//		Time Limit Exceeded
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		
//		if(n>2) {
//			list.add(2);
//		}
//		
//		for(int i=3; i<n; i+=2) {
//			boolean check = true;
//			for(int j=1; j<list.size(); j++) {
//				if(i % list.get(j) == 0) {
//					check = false;
//					break;
//				}
//				
//			}
//			if(check) {
//				list.add(i);				
//			}
//		}
//		
//		return list.size();
		
		
//		Time Limit Exceeded
//		int count = 0;
//		for(int i=2; i<n; i++) {
//			for(int j=2; j<=i; j++) {
//				
//				if(i%j == 0 && i != j) {
//					
//					break;
//				}
//				
//				if(i%j == 0 && i == j) {
//					
//					count++;
//				}
//			}
//		}
//		return count;
    }
	
	public static void main(String[] args) {
		
		System.out.println(countPrimes(10));
		System.out.println(Math.sqrt(10));
	}
	
}
