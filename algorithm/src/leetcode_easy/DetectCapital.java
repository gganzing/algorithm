package leetcode_easy;

//	알파벳 대문자 유효성 검사
//	모두 대문자, 모두 소문자, 첫 글자만 대문자만 올바른 사용으로 간주
//	Given a word, you need to judge whether the usage of capitals in it is right or not.
//	We define the usage of capitals in a word to be right when one of the following cases holds:
//	All letters in this word are capitals, like "USA".
//	All letters in this word are not capitals, like "leetcode".
//	Only the first letter in this word is capital, like "Google".
//	Otherwise, we define that this word doesn't use capitals in a right way.
	 

public class DetectCapital {
	
	public static boolean detectCapitalUse(String word) {
    
		if(word.length() <= 1) {
			
			return true;
		}
		
		boolean first = false;
		if(word.charAt(0) >= 'a' && word.charAt(0) <= 'z') {
			// 첫 번째 글자가 소문자
			first = true;
		}
		
		boolean check = true;
		// 두 번째 글자부터 끝까지 모두 같은 글자인지 판별
		if(word.charAt(1) >= 'A' && word.charAt(1) <= 'Z') {
			
			if(first) {
				// 첫 번째가 소문자인데 두 번째가 대문자가 나온 경우
				return false;
			}
			
			for(int i=2; i<word.length(); i++) {
				if(word.charAt(i) < 'A' || word.charAt(i) > 'Z') {
					check = false;
					break;
				}
			}
			
		}else if(word.charAt(1) >= 'a' && word.charAt(1) <= 'z') {
			for(int i=2; i<word.length(); i++) {
				if(word.charAt(i) < 'a' || word.charAt(i) > 'z') {
					check = false;
					break;
				}
			}
			
		}
		
		if(check) {
			
			return true;
		}
		
		return false;
		
		
//		다른 문풀1 - 정규표현식 사용
//		return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
		
		
//		다른 문풀2
//		내 코드보다 잘 정리된 코드
//		 int cnt = 0;
//		// 대문자의 개수만 판별
//	     for(char c: word.toCharArray()) {
//	    	 // 대문자[65~90], 소문자[97~122]
//	    	 // 아래 조건이 성립할 경우, 대문자라는 의미!
//	    	 if('Z' - c >= 0) {
//	    		 cnt++;
//	    	 }
//	     }
//	     //		  모두 소문자|| 모두 대문자			||	대문자 한 개 이고, 첫 번째 글자가 대문자!!
//	     return ((cnt==0 || cnt==word.length()) || (cnt==1 && 'Z' - word.charAt(0)>=0));
		
    }
	
	public static void main(String[] args) {
		
//		String word = "USA";
//		String word = "leetcode";
//		String word = "Google";
//		String word = "FlaG";
		String word = "gOOGLE";
		System.out.println(detectCapitalUse(word));
		
	}
}
