package programmers;

import java.util.ArrayList;
import java.util.Arrays;

//	k��° ��
//	�迭 array�� i��° ���ں��� j��° ���ڱ��� �ڸ��� �������� ��, k��°�� �ִ� ���� ���Ϸ� �մϴ�.
//	
//	���� ��� array�� [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3�̶��
//	
//	array�� 2[i-1]��°���� 5[j]��°���� �ڸ��� [5, 2, 6, 3]�Դϴ�.
//	1���� ���� �迭�� �����ϸ� [2, 3, 5, 6]�Դϴ�.
//	2���� ���� �迭�� 3��° ���ڴ� 5�Դϴ�.
//	�迭 array, [i, j, k]�� ���ҷ� ���� 2���� �迭 commands�� �Ű������� �־��� ��, 
//	commands�� ��� ���ҿ� ���� �ռ� ������ ������ �������� �� ���� ����� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
//	[1, 5, 2, 6, 3, 7, 4]	
//	  i	 j	k
//	[[2, 5, 3], 
//	 [4, 4, 1], 
//	 [1, 7, 3]]	
//	return [5, 6, 3]	


public class NumOfKth {

	public static int[] solution(int[] array, int[][] commands) {
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		for(int i=0; i<commands.length; i++) {
//			int len = commands[i][1] - commands[i][0] + 1;
//			int temp[] = new int[len];
//			int k = commands[i][0] - 1;
//			for(int j=0; j<temp.length; j++) {
//				temp[j] = array[k++];
//			}
//			
//			Arrays.sort(temp);
//			list.add(temp[commands[i][2] - 1]);
//		}
//		
//		int[] answer = new int[list.size()];
//		for(int l=0; l<answer.length; l++) {
//			answer[l] = list.get(l);
//		}
//		
//        return answer;
        

//		list�� ���� �� ���� �� ��
		int []answer = new int[commands.length];
		for(int i=0; i<commands.length; i++) {
			
			int len = commands[i][1] - commands[i][0] + 1;
			int temp[] = new int[len];
			int k = commands[i][0] - 1;
			
			for(int j=0; j<temp.length; j++) {
				temp[j] = array[k++];
			}
			
			Arrays.sort(temp);
			answer[i] = temp[commands[i][2] - 1];
		}
		
        return answer;
        
    }
	
	public static void main(String[] args) {
		
		int array[] = {1, 5, 2, 6, 3, 7, 4};
		int commands[][] = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		System.out.println(Arrays.toString(solution(array, commands)));
		
	}
}
