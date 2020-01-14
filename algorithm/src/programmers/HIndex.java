package programmers;

import java.util.Arrays;

//	h번 이상 인용 된 논문이 h개 이상일 때, h의 최대 값을 구하라
//
//	H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다. 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다. 
//	위키백과1에 따르면, H-Index는 다음과 같이 구합니다.
//	어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h가 이 과학자의 H-Index입니다.
//	어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때, 이 과학자의 H-Index를 return 하도록 solution 함수를 작성해주세요.
//	제한사항
//	과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.
//	논문별 인용 횟수는 0회 이상 10,000회 이하입니다.
//	입출력 예
//	citations		return
//	[3, 0, 6, 1, 5]	3
//	입출력 예 설명
//	이 과학자가 발표한 논문의 수는 5편이고, 그 중 3편의 논문은 3회 이상 인용되었습니다. 
//	그리고 나머지 2편의 논문은 3회 이하 인용되었기 때문에 이 과학자의 H-Index는 3입니다.

public class HIndex {

	public static int solution(int[] citations) {
        
		Arrays.sort(citations);
		int len = citations.length;
		int cnt = 0;
		for(int i=len-1; i>=0; i--) {
			
			if(len == cnt) {
				break;
			}
			
			if(citations[i] >= len) {
				cnt++;
				
			}else if(citations[i] != 0 && citations[i] < len) {
				
				while(true) {
					len--;
					
					if(len == cnt) {
						return len;
					}
					
					if(len == citations[i]) {
						cnt++;
						break;
					}
				}
			}
		}
		return cnt;
		
		
//		다른 문풀
//		int answer = 0;
//
//        Arrays.sort(citations); // 오름차순 정렬
//
//        for(int i = citations.length - 1; i >= 0; i--) {
//            if(citations.length - i > citations[i]) break;
//            // >= 로 할 경우, 1만 들어 있는 배열에선 조건 충족 시키지 못 함
//            // 오름차순 정렬로 순번 뒤의 수들은 모두 큰 수 
//            // h-index는 h숫자가 h번 이상 인용되야 함!
//			// 따라서 citations.length - i 값[해당 인덱스까지의 개수]이상을 citations[i]값이 충족시켜야만 답이 성립
//            answer++;
//        }
//
//        return answer;
		
    }
	
	public static void main(String[] args) {
		
//		int citations[] = {3, 0, 6, 1, 5};
//		int citations[] = {4, 3, 3, 3, 3};
//		int citations[] = {22, 42};
//		int citations[] = {20, 19, 18, 1};
		int citations[] = {20, 19, 18, 1, 20, 19, 18, 1};
//		int citations[] = {0, 0, 0, 0};
//		int citations[] = {1, 1, 1, 1};
//		int citations[] = {2, 7, 5};
		System.out.println(solution(citations));
		
	}
	
}
