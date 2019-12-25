package programmers;

//	수박 두글자가 주어진 숫자만큼 반복된 패턴으로 출력되는 프로그램 작성
//	길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
//	예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.
//	제한 조건 => n은 길이 10,000이하인 자연수입니다.
//	입출력 예
//	3	수박수
//	4	수박수박

public class SuParkSu {
	
	public static String solution(int n) {
		
	      String answer = "";
	      String pattern = "수박";
	      
	      for(int i=0; i<n; i++) {
	    	  answer += pattern.charAt(i%2);
	      }
	      
	      return answer;
	  }

	public static void main(String[] args) {
		
//		int n = 3;
		int n = 4;
		System.out.println(solution(n));
		
	}
}
