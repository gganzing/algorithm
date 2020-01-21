package leetcode_medium;

//	문자를 숫자로 변환하기
//	숫자 + 문자의 경우 숫자까지만 숫자로 변환
//	문자 + 숫자의 경우, 숫자로 변환 불가한 경우 => 0 반환
//	변환한 숫자가 [int]오버플로우면 INT_MAX 반환, 언더플로우면 INT_MIN 반환
//
//	Implement atoi which converts a string to an integer.
//	
//	The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. 
//	Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, 
//	and interprets them as a numerical value.
//	
//	The string can contain additional characters after those that form the integral number, 
//	which are ignored and have no effect on the behavior of this function.
//	
//	If the first sequence of non-whitespace characters in str is not a valid integral number, 
//	or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
//	
//	If no valid conversion could be performed, a zero value is returned.
//	
//	Only the space character ' ' is considered as whitespace character.
//	Assume we are dealing with an environment which could only store integers 
//	within the 32-bit signed integer range: [−231,  231 − 1]. 
//	If the numerical value is out of the range of representable values, 
//	INT_MAX (231 − 1) or INT_MIN (−231) is returned.
//
//	Example 1:
//	Input: "42"
//	Output: 42
//	
//	Example 2:
//	Input: "   -42"
//	Output: -42
//	Explanation: The first non-whitespace character is '-', which is the minus sign.
//	             Then take as many numerical digits as possible, which gets 42.
//	
//	Example 3:
//	Input: "4193 with words"
//	Output: 4193
//	Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.
//	
//	Example 4:
//	Input: "words and 987"
//	Output: 0
//	Explanation: The first non-whitespace character is 'w', which is not a numerical 
//	             digit or a +/- sign. Therefore no valid conversion could be performed.
//	
//	Example 5:
//	Input: "-91283472332"
//	Output: -2147483648
//	Explanation: The number "-91283472332" is out of the range of a 32-bit signed integer.
//	             Thefore INT_MIN (−231) is returned.


public class StringToInteger_Atoi {

	public static int myAtoi(String str) {

//		str = str.trim();
//		if(str.length() == 0) return 0;
//		
//		int start = 0, end = str.length(), sign = 1;
//		
//		if(str.charAt(0) == '-') {
//			sign = -1; 
//			start++;
//		}
//
//		if(str.charAt(0) == '+') {
//			start++;
//		}
//		
//		int i = start;
//		for(; i<end; i++) {
//			if(str.charAt(i) != '0') break;
//			start++;
//		}
//		
//		for(i=start; i<str.length(); i++) {
//			if(!Character.isDigit(str.charAt(i))) {
//				end = i;
//				break;
//			}
//		}
//		
//		str = str.substring(start, end);
//		
//		if(str.isEmpty()) {
//			return 0;
//		}
//		
//		try {
//		// int의 범위 -2147483648 ~ 2147483647 [부호제외] 10자리
//			if(str.length() > 10) {
//				if(sign == 1) {
//					return Integer.MAX_VALUE;
//				}
//				else {
//					return Integer.MIN_VALUE;
//				}
//				
//			}else if(str.length() == 10) {
//				if(Long.valueOf(str)*sign >= Integer.MAX_VALUE) {
//					return Integer.MAX_VALUE;
//					
//				}else if(Long.valueOf(str)*sign <= Integer.MIN_VALUE) {
//					return Integer.MIN_VALUE;
//				}
//			}
//			
//			return Integer.valueOf(str) * sign;
//			
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		return 0;
		
		
//		다른 문풀
		int index = 0;
        int total = 0;
        int sign = 1;
        
        //빈 문자열인지 검사
        if(str.length() == 0)
            return 0;
        
        // 공백 제거
        while(index < str.length() && str.charAt(index) == ' ')
            index++;
        
        if (index == str.length()) return 0;
        
        // 공백 제거 후 첫번째 글자에 부호가 있는지 체크
        if(str.charAt(index) == '+' || str.charAt(index) == '-') {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }
        
        while(index < str.length()) {
      
            int digit = str.charAt(index) - '0';
            // 부호 뒤의 인덱스부터 해당 글자가 숫자인지 판단
            if(digit < 0 || digit > 9) break; 
            // 숫자가 아닌 글자가 나오면 그때까지 구해진 total값 가지고 탈출
            
            // overflow 확인
            // 최종 int값 범위 안, 한 자리수 전의 숫자까지의 합[나누기 10한 값을 비교]이  max값 범위를 벗어나는지 확인
            // 현재 인덱스의 값을 더하기 전에, 'Integer.MAX_VALUE / 10'을 toal과 비교 => 주어진 숫자가 int범위 값의 길이 이상이라는 상황이니깐
            // 같을 경우에만 => 더해지기 전의 마지막 자리숫자가 int범위 값의 마지막 자릿수보다 작은 값인지 확인
            if(Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            
            // 숫자 뒤집기 알고리즘 때처럼 값 더해나가기
            total = total*10 + digit;
            index++;
        }
        return total*sign;
	}
	
	public static void main(String[] args) {
		
//		String str = "   -42";
//		String str = "4193 with words";
//		String str = "words and 987";
//		String str = "-91283472332";
//		String str = "2147483648";
		String str = "-2147483649";
//		String str = "+1";
//		String str = "+";
//		String str = "";
//		String str = "    0000000000000   ";
//		String str = "1";
//		String str = "  -0012a42";
//		String str = "20000000000000000000";
//		String str = "9223372036854775808";
//		String str = "  000000000001234567";
//		String str = "42";
		System.out.println(myAtoi(str));
		
	}

}
