package leetcode_easy;

//	���ĺ� �빮�� ��ȿ�� �˻�
//	��� �빮��, ��� �ҹ���, ù ���ڸ� �빮�ڸ� �ùٸ� ������� ����
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
			// ù ��° ���ڰ� �ҹ���
			first = true;
		}
		
		boolean check = true;
		// �� ��° ���ں��� ������ ��� ���� �������� �Ǻ�
		if(word.charAt(1) >= 'A' && word.charAt(1) <= 'Z') {
			
			if(first) {
				// ù ��°�� �ҹ����ε� �� ��°�� �빮�ڰ� ���� ���
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
		
		
//		�ٸ� ��Ǯ1 - ����ǥ���� ���
//		return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
		
		
//		�ٸ� ��Ǯ2
//		�� �ڵ庸�� �� ������ �ڵ�
//		 int cnt = 0;
//		// �빮���� ������ �Ǻ�
//	     for(char c: word.toCharArray()) {
//	    	 // �빮��[65~90], �ҹ���[97~122]
//	    	 // �Ʒ� ������ ������ ���, �빮�ڶ�� �ǹ�!
//	    	 if('Z' - c >= 0) {
//	    		 cnt++;
//	    	 }
//	     }
//	     //		  ��� �ҹ���|| ��� �빮��			||	�빮�� �� �� �̰�, ù ��° ���ڰ� �빮��!!
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
