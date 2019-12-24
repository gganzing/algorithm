package leetcode_easy;

//	문자 A를 회전하여 B가 될 수 있는지 판단
//	We are given two strings, A and B.
//	
//	A shift on A consists of taking string A and moving the leftmost character to the rightmost position. 
//	For example, if A = 'abcde', then it will be 'bcdea' after one shift on A. 
//	Return True if and only if A can become B after some number of shifts on A.
//	
//	Input: A = 'abcde', B = 'cdeab' / Output: true
//	Input: A = 'abcde', B = 'abced' / Output: false
//	A and B will have length at most 100.

public class RotateString {

	public static boolean rotateString(String A, String B) {
		
		if(A.length() != B.length() || A.indexOf(B.charAt(0)) == -1) {
			return false;
		}
		
		int cnt = 0;
		for(int j=1; j<A.length(); j++) {
			if(A.indexOf(B.charAt(0), j) != -1) {
				cnt++;
			}
		}
       
		int check = 0;
		for(int k=0; k<cnt; k++) {
			int idxA = A.indexOf(B.charAt(0), k);
			for(int i=0; i<B.length(); i++) {
				if(B.charAt(i) == A.charAt(idxA)) {
					idxA++;
					if(idxA >= A.length()) {
						idxA = idxA % A.length(); 
					}
				}else {
					check++;
					break;
				}
			}
		}
		
		if(check == cnt) {
			return false;
		}
		
		return true;
		
//		다른 문풀
//		return A.length() == B.length() && (A + A).contains(B);
    }
	
	
	public static void main(String[] args) {
		
		String A = "bbbacddceeb";
		String B = "ceebbbbacdd";
//		String A = "ohbrwzxvxe";
//		String B = "uornhegseo";
//		String A = "abcde";
//		String B = "cdeab";
//		String B = "abced";
		
		System.out.println(rotateString(A, B));
		
	}
	
}
