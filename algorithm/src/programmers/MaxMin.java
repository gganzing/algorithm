package programmers;

//	최대값과 최소값을 반환

public class MaxMin {

	public static String solution(String s) {
		
		String answer = "";
		String[] arr = s.split(" ");
		int min = Integer.parseInt(arr[0]);
		int max = Integer.parseInt(arr[0]);
		
		for(int i=1; i<arr.length; i++) {
			int temp = Integer.parseInt(arr[i]);
			
			if(min > temp) {
				min = temp;
			}
			
			if(max < temp) {
				max = temp;
			}
		}

		answer = min + " " + max;
		
		return answer;
	}
	
	public static void main(String[] args) {
		
//		String s = "1 2 3 4";
		String s = "-1 -2 -3 -4";
//		String s = "-1 -1";
		System.out.println(solution(s));
		
	}
	
}
