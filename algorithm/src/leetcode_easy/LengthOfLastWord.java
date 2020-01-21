package leetcode_easy;

//	마지막 단어의 길이 반환
//	Given a string s consists of upper/lower-case alphabets and empty space characters ' ', 
//	return the length of last word (last word means the last appearing word if we loop from left to right) in the string.
//	If the last word does not exist, return 0.
//	
//	Note: A word is defined as a maximal substring consisting of non-space characters only.
//	
//	Input: "Hello World"
//	Output: 5

public class LengthOfLastWord {

	public static int lengthOfLastWord(String s) {

		s = s.trim();
		
		if(s.length() == 0) {
			return 0;
		}
		
		String strs[] = s.split(" ");
		
		return strs[strs.length-1].length();
		
		
//		다른 문풀
//		s = s.trim();
//	    int lastIndex = s.lastIndexOf(' ') + 1;
//	    
//	    return s.length() - lastIndex;
		
	}
	
	public static void main(String[] args) {
		
		String s = "Hello World hahahahaha";
//		String s = " ";
		System.out.println(lengthOfLastWord(s));
		
	}
	
}
