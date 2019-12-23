package leetcode_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

//	Ű������ ���� �ٿ� �ִ� ���ĺ��� ����Ͽ� �ۼ� �� �ܾ� ã��
//	�������θ� �� ���ڷ� ����, �� �ܾ ���� ���� ������ ��� ����
//	Given a List of words, return the words that can be typed using letters of alphabet 
//	on only one row's of American keyboard like the image below.
//	Input: ['Hello', 'Alaska', 'Dad', 'Peace']
//	Output: ['Alaska', 'Dad']
//	You may use one character in the keyboard more than once.
//	You may assume the input string will only contain letters of alphabet.

public class KeyboardRow {
	
	static HashSet<Character> line1;
	static HashSet<Character> line2;
	static HashSet<Character> line3;
	
//	char arr1[] = {'q','w','e','r','t','y','u','i','o','p'};
//	char arr2[] = {'a','s','d','f','g','h','j','k','l'};
//	char arr3[] = {'z','x','c','v','b','n','m'};
	String s1 = "qwertyuiop";
	String s2 = "asdfghjkl";
	String s3 = "zxcvbnm";
		
	public KeyboardRow() {
		
		line1 = new HashSet<Character>();
		for(int i=0; i<s1.length(); i++) {
			line1.add(s1.charAt(i));
		}
		
		line2 = new HashSet<Character>();
		line2 = new HashSet<Character>();
		for(int j=0; j<s2.length(); j++) {
			line2.add(s2.charAt(j));
		}
		
		line3 = new HashSet<Character>();
		line3 = new HashSet<Character>();
		for(int k=0; k<s3.length(); k++) {
			line3.add(s3.charAt(k));
		}
		
	}
	

	public static String[] findWords(String[] words) {
		
		String str = "";
		
		for(String word : words) {
			
			int count = 0;
			String w = word.toLowerCase();
			
			for(int i=0; i<word.length(); i++) {
				if(line1.contains(w.charAt(i))) {
					count++;
				}
			}
			
			if(count == word.length()) {
				if(!str.equals("")) {
					str += ",";
				}
				str += word;
				continue;
				
			}else if(count != 0 && count != word.length()) {
				
				continue;
			}
			
			
			
			for(int j=0; j<word.length(); j++) {
				if(line2.contains(w.charAt(j))) {
					count++;
				}
			}
			
			if(count == word.length()) {
				if(!str.equals("")) {
					str += ",";
				}
				str += word;
				continue;
				
			}else if(count != 0 && count != word.length()) {
				
				continue;
			}
			
			
			
			for(int k=0; k<word.length(); k++) {
				if(line3.contains(w.charAt(k))) {
					count++;
				}
			}
			
			if(count == word.length()) {
				if(!str.equals("")) {
					str += ",";
				}
				str += word;
			}
			
		}
		
		
		if(!str.equals("")) {
			
			return str.split(",");
			
		}else {
			
			return new String[0];
		}
		
		
//		�ٸ� ��Ǯ
//		String[] strs = { "QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM" };
//		// map�� ���� ���� ���γ��� ���� value���� ������ ¦���� ��
//		Map<Character, Integer> map = new HashMap<>();
//
//		for (int i = 0; i < strs.length; i++) {
//			for (char c : strs[i].toCharArray()) {
//				map.put(c, i);// put <char, rowIndex> pair into the map
//			}
//		}
//
//		List<String> res = new ArrayList<>();
//		
//		for (String w : words) {
//			if (w.equals("")) {
//				// �� ���̸� �ǳʶٰ�
//				continue;
//			}
//			
//			// ���� ó���� ���ĺ��� �� ��° �������� index������ ��Ƶ�
//			int index = map.get(w.toUpperCase().charAt(0));
//			for (char c : w.toUpperCase().toCharArray()) {
//				
//				// �ϳ��� ���� ������ �ƴ� ���� ���ĺ��� �߰ߵȴٸ�, �ش� �ܾ�� ���ϴ� ������� �ƴ�[-1�� ��� Ż��]
//				if (map.get(c) != index) {
//					index = -1; // don't need a boolean flag.
//					break;
//				}
//			}
//			
//			if (index != -1) {
//				// -1�� �ƴ϶��, ��� ���� ������[���� value�� ���� �ܾ�]�ܾ�! 
//				res.add(w);// if index != -1, this is a valid string
//			}
//
//		}
//		return res.toArray(new String[0]);
		
    }
	
	
	public static void main(String[] args) {
		
		KeyboardRow k = new KeyboardRow();
		String words[] = {"Hello", "Alaska", "Dad", "Peace"};
//		String words[] = {"Alaska", "Dad"};
		System.out.println(Arrays.toString(findWords(words)));
		
	}
	
}
