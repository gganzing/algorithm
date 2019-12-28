package programmers;

//	���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�. �� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�. 
//	�� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
//	
//	* ���� ����
//	���ڿ� ��ü�� ¦/Ȧ�� �ε����� �ƴ϶�, �ܾ�(������ ����)���� ¦/Ȧ�� �ε����� �Ǵ��ؾ��մϴ�.
//	ù ��° ���ڴ� 0��° �ε����� ���� ¦����° ���ĺ����� ó���ؾ� �մϴ�.
//	input : try hello world  /	output : TrY HeLlO WoRlD


public class CreateStrangeString {

	public static String solution(String s) {
		
		String answer = "";
		int idx = 0;
		
		for(int i=0; i<s.length(); i++) {
			String letter = s.charAt(i)+"";
			
			if(!letter.equals(" ")) {
				if(idx % 2 == 0) {
					letter = letter.toUpperCase();
					
				}else {
					letter = letter.toLowerCase();
				}
				idx++;
				
			}else {
				idx = 0;
			}
			answer += letter;
		}
		
		return answer;
		
		
//		String answer = "";
//		limit �� '-1'�� �� ���� ���, ���� ������ ���Խ�Ű�� ����
//		String arr[] = s.split(" ", -1);
//
//		for(String str : arr) {
//			for(int i=0; i<str.length(); i++) {
//				String add = str.charAt(i)+"";
//				
//				if(i % 2 == 0) {
//					add = add.toUpperCase();
//					
//				}else {
//					add = add.toLowerCase();
//				}
//				answer += add;
//			}
//			answer += " ";
//		}
//		
//		return answer.substring(0, answer.length()-1);
	}
	
	public static void main(String[] args) {
		
		String s = "try    hello world  ";
		System.out.println(solution(s));
		
	}
	
}
