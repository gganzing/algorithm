package programmers;

import java.util.ArrayList;
import java.util.Arrays;

//	array�� �� element �� divisor�� ������ �������� ���� ������������ ������ �迭�� ��ȯ�ϴ� �Լ�, solution�� �ۼ����ּ���.
//	divisor�� ������ �������� element�� �ϳ��� ���ٸ� �迭�� -1�� ��� ��ȯ�ϼ���.
//	
//	���ѻ���
//	arr�� �ڿ����� ���� �迭�Դϴ�.
//	���� i, j�� ���� i �� j �̸� arr[i] �� arr[j] �Դϴ�. => �迭 ��� �ߺ��� ����
//	divisor�� �ڿ����Դϴ�.
//	array�� ���� 1 �̻��� �迭�Դϴ�.
//	����� ��
//	arr				divisor	return
//	[5, 9, 7, 10]	5		[5, 10]
//	[2, 36, 1, 3]	1		[1, 2, 3, 36]
//	[3,2,6]			10		[-1]

public class DivideNumberArray {

	public static int[] solution(int[] arr, int divisor) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
		
		if(list.size() == 0) {
			list.add(-1);
		}
		
		int[] answer = new int[list.size()];
		for(int j=0; j<list.size(); j++) {
			answer[j] = list.get(j);
		}
		Arrays.sort(answer);
		
		return answer;
	}
	
	public static void main(String[] args) {
		
//		int arr[] = {5, 9, 7, 10};
//		int divisor = 5;
		int arr[] = {3, 2, 6};
		int divisor = 10;
		System.out.println(Arrays.toString(solution(arr, divisor)));
		
	}
	
}
