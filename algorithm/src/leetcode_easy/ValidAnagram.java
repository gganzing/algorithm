package leetcode_easy;

//	애너그램 유효성 검사
//	Given two strings s and t , write a function to determine if t is an anagram of s.
//	특수문자의 처리는?

public class ValidAnagram {
	
	public static boolean isAnagram(String s, String t) {
        
		if(s.length() != t.length()) {
			
			return false;
		}
		
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
        int cnt = 0;
        
        for(int i=0; i<s.length(); i++) {
        	for(int j=0; j<t.length(); j++) {
        		if(arr1[i] == arr2[j]) {
        			arr2[j] = 0;
        			cnt++;
        			break;
        		}
        	}
        }
        
        if(cnt == s.length()) {
        	
        	return true;
        }
        
        return false;
        
		
//      다른 문풀
//        int[] alphabet = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//        	alphabet[s.charAt(i) - 'a']++;
//        }
//        
//        for (int i = 0; i < t.length(); i++) {
//        	alphabet[t.charAt(i) - 'a']--;
//        }
//        
//        for (int i : alphabet) {
//        	if (i != 0) {
//        		return false;
//        	}
//        }
//        return true;
        
    }
	
	public static void main(String[] args) {
		
//		String s = "anagram";
//		String t = "nagaran";
		String s = "aacc";
		String t = "ccac";
//		String t = "nagaram";
//		String t = "nag";
		
		System.out.println(isAnagram(s, t));
	}

}
