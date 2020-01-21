package leetcode_easy;

// 	규칙에 따른 엑셀시트 컬럼 번호 반환하기
//	Given a column title as appear in an Excel sheet, return its corresponding column number.
//		A -> 1
//	    B -> 2
//	    C -> 3
//	    ...
//	    Z -> 26
//	    AA -> 27
//	    AB -> 28 
//	    ...
//
//	Input: "A"
//	Output: 1
//
//	Input: "AB"
//	Output: 28
//
//	Input: "ZY"
//	Output: 701

public class ExcelSheetColumnNumber {

	public static int titleToNumber(String s) {
		
//        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
		int col = 0;
		int cnt = 0;
		for(int i=s.length()-1; i>=0; i--) {
			
//			char c = s.charAt(i);
//			col += (alphabet.indexOf(c)+1) * Math.pow(26, cnt++);
			
			// A => 1 이니깐 +1 해주기
			col += (s.charAt(i)+1 - 'A') * Math.pow(26, cnt++);
			
		}

//      처음 두자리 수까지만 생각
//		if(s.length() == 1) {
//			col = alphabet.indexOf(s)+1;
//			
//		} else if(s.length() == 2){
//			col = (alphabet.indexOf(s.charAt(0))+1)*26 + (alphabet.indexOf(s.charAt(1))+1);
//		}
		
		return col;
    }
	
	public static void main(String[] args) {
		
//		String s = "AA";
//		String s = "A";
//		String s = "ZA";
//		String s = "ZZ";
		String s = "AAA";
		
		System.out.println(titleToNumber(s));
		
	}
	
}
