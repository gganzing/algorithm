package programmers;

import java.util.ArrayList;
import java.util.Arrays;

//  �迭 �� ���� �� �ߺ� �� ����
//	�迭 arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�. 
//	�̶�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�. 
//	��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�. 
//	���� ���,
//	arr = [1, 1, 3, 3, 0, 1, 1] �̸� [1, 3, 0, 1] �� return �մϴ�.
//	arr = [4, 4, 4, 3, 3] �̸� [4, 3] �� return �մϴ�.
//	�迭 arr���� ���������� ��Ÿ���� ���ڴ� �����ϰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���.
//	���ѻ���
//	�迭 arr�� ũ�� : 1,000,000 ������ �ڿ���
//	�迭 arr�� ������ ũ�� : 0���� ũ�ų� ���� 9���� �۰ų� ���� ����

public class RemoveContinuousDeduplication {

	public static int[] solution(int []arr) {
        
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(arr[0]);
		for(int n : arr) {
			int last = list.get(list.size()-1);
			if(n != last) {
				list.add(n);
			}
		}
		
//		�ٸ� ��Ǯ
//		int preNum = 10; ó�� �ƹ� ���ڷ� �ʱ�ȭ
//        for(int num : arr) {
//            if(preNum != num)
//                list.add(num);
//            preNum = num; ��� ����Ʈ�� �߰��ߴ� ���ڸ� �����
//        }  
		
        int answer[] = new int[list.size()];
        for(int j=0; j<list.size(); j++) {
        	answer[j] = list.get(j);
        }
        
        return answer;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1, 1, 3, 3, 0, 1, 1};
//		int arr[] = {4, 4, 4, 3, 3};
		System.out.println(Arrays.toString(solution(arr)));
		
	}
	
}
