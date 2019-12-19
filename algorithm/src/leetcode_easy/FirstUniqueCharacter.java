package leetcode_easy;

import java.util.HashMap;

//	���� ���� ������ ���ĺ��� �ε��� ��ȯ
//	������ ���� ���� ���� ���, ���� ù��°�� ��ġ�ϰ� �ִ� ������ ���ĺ��� �ε���, ���ڴ� ��� �ҹ��ڷ� ����
//	������ ���� ���� ���, -1 ��ȯ
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
		
		
//		�ٸ� ��Ǯ
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
