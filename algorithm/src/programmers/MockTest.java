package programmers;

import java.util.ArrayList;
import java.util.Arrays;

//	수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 
//	수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
//	
//	1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//	2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//	3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
//	
//	1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 
//	가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
//	
//	제한 조건
//	시험은 최대 10,000 문제로 구성되어있습니다.
//	문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
//	가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
//	answers		return
//	[1,2,3,4,5]	[1]
//	[1,3,2,4,2]	[1,2,3]


public class MockTest {

	public static int[] solution(int[] answers) {
        
		int[] one = {1, 2, 3, 4, 5};
		int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int[] cnt = {0, 0, 0};
		
		for(int i=0; i<answers.length; i++) {
			if(answers[i] == one[i % one.length]) {
				cnt[0]++;
			}
			
			if(answers[i] == two[i % two.length]) {
				cnt[1]++;
			}
			
			if(answers[i] == three[i % three.length]) {
				cnt[2]++;
			}
		}
		
		int max = cnt[0];
		for(int j=1; j<cnt.length; j++) {
			if(max < cnt[j]) {
				max = cnt[j];
			}
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int k=0; k<cnt.length; k++) {
			if(max == cnt[k]) {
				list.add(k+1);
			}
		}
		
		int[] answer = new int[list.size()];
        for(int l=0; l<list.size(); l++) {
        	answer[l] = list.get(l);
        }
		
        return answer;
    }
	
	public static void main(String[] args) {
		
//		int answers[] = {1,2,3,4,5};
		int answers[] = {1,3,2,4,2};
		System.out.println(Arrays.toString(solution(answers)));
		
	}
	
}
