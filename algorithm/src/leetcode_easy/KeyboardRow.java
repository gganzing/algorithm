package leetcode_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

//	키보드의 같은 줄에 있는 알파벳만 사용하여 작성 된 단어 찾기
//	영문으로만 된 글자로 가정, 한 단어에 같은 문자 여러번 사용 가능
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
		
		
//		다른 문풀
//		String[] strs = { "QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM" };
//		// map을 만들어서 같은 라인끼리 같은 value값을 갖도록 짝지어 둠
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
//				// 빈 값이면 건너뛰고
//				continue;
//			}
//			
//			// 가장 처음의 알파벳이 몇 번째 라인인지 index변수에 담아둠
//			int index = map.get(w.toUpperCase().charAt(0));
//			for (char c : w.toUpperCase().toCharArray()) {
//				
//				// 하나라도 같은 라인이 아닌 곳의 알파벳이 발견된다면, 해당 단어는 원하는 결과값이 아님[-1을 담고 탈출]
//				if (map.get(c) != index) {
//					index = -1; // don't need a boolean flag.
//					break;
//				}
//			}
//			
//			if (index != -1) {
//				// -1이 아니라면, 모두 같은 라인의[같은 value값 가진 단어]단어! 
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
