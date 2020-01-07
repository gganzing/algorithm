package programmers;

import java.util.ArrayList;
import java.util.Arrays;

//	�����ڴ� ������ ������ ����� �ظ��Դϴ�. ������ ���ι��� ���ǰ�翡 ���� ������ ���� ������ �մϴ�. 
//	�����ڴ� 1�� �������� ������ �������� ������ ���� ����ϴ�.
//	
//	1�� �����ڰ� ��� ���: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//	2�� �����ڰ� ��� ���: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//	3�� �����ڰ� ��� ���: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
//	
//	1�� �������� ������ ���������� ������ ������� ���� �迭 answers�� �־����� ��, 
//	���� ���� ������ ���� ����� �������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
//	
//	���� ����
//	������ �ִ� 10,000 ������ �����Ǿ��ֽ��ϴ�.
//	������ ������ 1, 2, 3, 4, 5�� �ϳ��Դϴ�.
//	���� ���� ������ ���� ����� ������ ���, return�ϴ� ���� �������� �������ּ���.
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
