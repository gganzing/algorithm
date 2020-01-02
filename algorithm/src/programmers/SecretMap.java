package programmers;

import java.util.Arrays;

//	비밀지도
//	네오는 평소 프로도가 비상금을 숨겨놓는 장소를 알려줄 비밀지도를 손에 넣었다. 
//	그런데 이 비밀지도는 숫자로 암호화되어 있어 위치를 확인하기 위해서는 암호를 해독해야 한다. 
//	다행히 지도 암호를 해독할 방법을 적어놓은 메모도 함께 발견했다.
//	
//	지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 공백(" ) 또는벽(#") 두 종류로 이루어져 있다.
//	전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다. 각각 지도 1과 지도 2라고 하자. 
//	지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다. 
//	지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
//	지도 1과 지도 2는 각각 정수 배열로 암호화되어 있다.
//	암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.
//	
//	입력으로 지도의 한 변 크기 n 과 2개의 정수 배열 arr1, arr2가 들어온다.
//	
//	1 ≦ n ≦ 16
//	arr1, arr2는 길이 n인 정수 배열로 주어진다.
//	정수 배열의 각 원소 x를 이진수로 변환했을 때의 길이는 n 이하이다. 즉, 0 ≦ x ≦ 2n - 1을 만족한다.
//	출력 형식
//	원래의 비밀지도를 해독하여 '#', 공백으로 구성된 문자열 배열로 출력하라.
//	
//	n = 5
//	arr1 = [9, 20, 28, 18, 11]
//			01001 = 9
//			10100 = 20
//			11100 = 28
//			10010 = 18
//			01011 = 11
//			
//	arr2 = [30, 1, 21, 17, 28]
//			11110 = 30
//			00001 = 1
//			10101 = 21
//			10001 = 17
//			11100 = 28
//			
//	output = ["#####","# # #","### #","#  ##","#####"]
//
//	입출력 예제
//	매개변수	값
//	n		5
//	arr1	[9, 20, 28, 18, 11]
//	arr2	[30, 1, 21, 17, 28]
//	출력		["#####","# # #", "### #", "# ##", "#####"]
//
//	둘 다 0일때만, 0 / 둘 중 하나라도 1이면 1(#) => OR연산! "|"

public class SecretMap {

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		
		String[] answer = new String[n];
//		[####^, ^^^^#, #^#^#, #^^^#, ###^^]
		for(int i=0; i<n; i++) {
			
			int num = arr1[i] | arr2[i];
			
			StringBuffer sb = new StringBuffer();
			
			while(num != 0) {
				sb.insert(0, String.valueOf(num % 2 == 0 ? "^" : "#"));
				num /= 2;
			}
			
			// n의 길이 보다 작을 경우, 앞의 빈 칸을 공백으로(0) 채워줘야 함!
			for(int j = n - sb.toString().length(); j > 0; j--) {
//			이 경우에는 초기값에 해당 길이를 넣어 주는것으로 종료식과 조건이 고정되게 되니깐 오답 안나옴!
			
//			for(int j = 0; j < n - sb.toString().length() ; j++){
//			같은 논리 같은데 왜 이렇게 하면 왜 오답?!
//			=> StringBuffer의 특성상 새로 값이 더해지면서 계속 종료식의 값이 변화함!!
//				따라서 의도한 대로 처음의 값으로 고정되어 종료되지 않고 도중에 종료되어버림
			
//			이렇게 변수에 담아두고 하면 잘나옴 => 종료식의 값을 고정시켜준 셈이 되기 때문!!
//			int len = n - sb.toString().length();
//			for(int j = 0; j < len; j++){	
				
				sb.insert(0, "^");
			}

			answer[i] = sb.toString();
		}
		
		return answer;
		
		
//		다른 문풀
//		String[] result = new String[n];
//        for (int i = 0; i < n; i++) {
//        	// Integer.toBinaryString(num) num을 이진수로 변환
//            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
//        }
//
//        for (int i = 0; i < n; i++) {
//			// %[argument_index$][flags][width]conversion		
//        	// %10S => 10칸에 맞춰서 오른쪽 정렬 String 타입 [수량보다 부족한 부분은 공백처리]
//        	// conversions => (문자열), d(정수), x(16진수), o(8진수), f(실수)
//            result[i] = String.format("%" + n + "s", result[i]);
//            result[i] = result[i].replaceAll("1", "#");
//            result[i] = result[i].replaceAll("0", " ");
//        }
//
//        return result;
	}
	
	public static void main(String[] args) {
		
		int n = 5;
//		int[] arr1 = {0, 0};
//		int[] arr2 = {0, 1};
		int[] arr1 = {0, 0, 0, 0, 0};
		int[] arr2 = {0, 1, 10, 17, 28};
//		[####^, ^^^^#, #^#^#, #^^^#, ###^^]
		
//		int n = 6;
//		int[] arr1 = {46, 33, 33, 22, 31, 50};
//		int[] arr2 = {27, 56, 19, 14, 14, 10};
//		["######", "###  #", "##  ##", " #### ", " #####", "### # "]
		
//		int n = 5;
//		int[] arr1 = {9, 20, 28, 18, 11};
//		int[] arr2 = {30, 1, 21, 17, 28};
		System.out.println(Arrays.toString(solution(n, arr1, arr2)));
		
	}
	
}
