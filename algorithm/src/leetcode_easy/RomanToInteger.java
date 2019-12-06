package leetcode_easy;

import java.util.ArrayList;
import java.util.HashMap;

/*
로마자를 숫자로 변환하기

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, two is written as II in Roman numeral, just two one's added together. 
Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. 
However, the numeral for four is not IIII. Instead, the number four is written as IV. 
Because the one is before the five we subtract it making four. 
The same principle applies to the number nine, which is written as IX. 
There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.

* 작은 수가 큰 수 뒤에 있으면 더해지는 값, 반대의 경우 빼진 값이 해당 숫자

Example 1:
Input: 'III'
Output: 3

Example 2:
Input: 'IV'
Output: 4

Example 3:
Input: 'IX'
Output: 9

Example 4:
Input: 'LVIII'
Output: 58
Explanation: L = 50, V= 5, III = 3.

Example 5:
Input: 'MCMXCIV'
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
*/

public class RomanToInteger {
	
	public static int romanToInt(String s) {
	       
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		
//		for(int i=0; i<s.length(); i++) {
//			list.add(map.get(s.charAt(i)));
//		}
//		
//		int sum = 0;
//		for(int j=0; j<list.size(); j++) {
//			
//			sum += list.get(j);
//			
//			if(j > 0 && list.get(j-1) < list.get(j)) {
//				sum -= list.get(j-1)*2;
//			}
//		}
		
		int sum = 0;
		for(int i=0; i<s.length(); i++) {
			
			sum += map.get(s.charAt(i));
			
			if(i>0 && map.get(s.charAt(i-1)) < map.get(s.charAt(i))) {
				sum -= map.get(s.charAt(i-1))*2;
			}
			
		}
		
		return sum;
	 }
	
	
	public static void main(String[] args) {
		
		System.out.println(romanToInt("III"));
	}

}
