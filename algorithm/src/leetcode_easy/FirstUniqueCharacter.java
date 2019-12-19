package leetcode_easy;

import java.util.HashMap;

//	문자 속의 유일한 알파벳의 인덱스 반환
//	유일한 값이 여러 개일 경우, 가장 첫번째로 위치하고 있는 유일한 알파벳의 인덱스, 문자는 모두 소문자로 가정
//	유일한 값이 없을 경우, -1 반환
//	Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
//		s = "leetcode"
//		return 0.
//		s = "loveleetcode",
//		return 2.
//	You may assume the string contain only lowercase letters.
		

public class FirstUniqueCharacter {
	
	public static int firstUniqChar(String s) {
        
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<s.length(); i++) {
			
			Object check = map.put(s.charAt(i), i);
			if( check != null) {
				map.put(s.charAt(i), -1);
			}
		}
		
		for(int j=0; j<s.length(); j++) {
			if(map.get(s.charAt(j)) != -1) {
				
				return map.get(s.charAt(j));
			}
		}
		return -1;
		
		
//		다른 문풀
//		int alphabet[] = new int[26];
//		for(int i=0; i<s.length(); i++) {
//			alphabet[s.charAt(i)-'a'] += 1;
//		}
//		
//		for(int j=0; j<s.length(); j++) {
//			if(alphabet[s.charAt(j) - 'a'] == 1) {
//				
//				return j;
//			}
//		}
//		return -1;
		
    }
	
	public static void main(String[] args) {
		
		String s = "leetcode";
//		String s = "loveleetcode";
//		String s = "lleett";
		
		System.out.println(firstUniqChar(s));
		
	}

}
