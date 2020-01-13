package programmers;

import java.util.Arrays;

//	S�翡���� �� �μ��� �ʿ��� ��ǰ�� ������ �ֱ� ���� �μ����� ��ǰ�� �����ϴµ� �ʿ��� �ݾ��� �����߽��ϴ�. 
//	�׷���, ��ü ������ ������ �ֱ� ������ ��� �μ��� ��ǰ�� ������ �� ���� �����ϴ�. �׷��� �ִ��� ���� �μ��� ��ǰ�� ������ �� �� �ֵ��� �Ϸ��� �մϴ�.
//	
//	��ǰ�� ������ �� ���� �� �μ��� ��û�� �ݾ׸�ŭ�� ��� ������ ��� �մϴ�. 
//	���� ��� 1,000���� ��û�� �μ����� ��Ȯ�� 1,000���� �����ؾ� �ϸ�, 1,000������ ���� �ݾ��� ������ �� ���� �����ϴ�.
//	
//	�μ����� ��û�� �ݾ��� ����ִ� �迭 d�� ���� budget�� �Ű������� �־��� ��, 
//	�ִ� �� ���� �μ��� ��ǰ�� ������ �� �ִ��� return �ϵ��� solution �Լ��� �ϼ����ּ���.
//	
//	���ѻ���
//	d�� �μ����� ��û�� �ݾ��� ����ִ� �迭�̸�, ����(��ü �μ��� ����)�� 1 �̻� 100 �����Դϴ�.
//	d�� �� ���Ҵ� �μ����� ��û�� �ݾ��� ��Ÿ����, �μ��� ��û �ݾ��� 1 �̻� 100,000 ������ �ڿ����Դϴ�.
//	budget�� ������ ��Ÿ����, 1 �̻� 10,000,000 ������ �ڿ����Դϴ�.
//
//	����� ��
//	d			budget	result
//	[1,3,2,5,4]	9		3
//	[2,2,3,3]	10		4
//	����� �� ����
//	����� �� #1
//	�� �μ����� [1��, 3��, 2��, 5��, 4��]��ŭ�� �ݾ��� ��û�߽��ϴ�. 
//	���࿡, 1��, 2��, 4���� ��û�� �μ��� ��ǰ�� �������ָ� ���� 9������ 7���� �Һ�Ǿ� 2���� �����ϴ�. 
//	�׻� ��Ȯ�� ��û�� �ݾ׸�ŭ ������ ��� �ϹǷ� ���� 2������ ������ �μ��� ������ ���� �ʽ��ϴ�. 
//	�� ��� �ܿ� 3�� �μ��� ������ �� ������� ������ �����ϴ�.
//	
//	1��, 2��, 3���� ��û�� �μ��� ��ǰ�� �������ַ��� 6���� �ʿ��մϴ�.
//	1��, 2��, 5���� ��û�� �μ��� ��ǰ�� �������ַ��� 8���� �ʿ��մϴ�.
//	1��, 3��, 4���� ��û�� �μ��� ��ǰ�� �������ַ��� 8���� �ʿ��մϴ�.
//	1��, 3��, 5���� ��û�� �μ��� ��ǰ�� �������ַ��� 9���� �ʿ��մϴ�.
//	3�� �μ����� �� ���� �μ��� ��ǰ�� ������ �� ���� �����Ƿ� �ִ� 3�� �μ��� ��ǰ�� ������ �� �� �ֽ��ϴ�.
//	
//	����� �� #2
//	��� �μ��� ��ǰ�� �������ָ� 10���� �˴ϴ�. ���� �ִ� 4�� �μ��� ��ǰ�� ������ �� �� �ֽ��ϴ�.

public class Budget {

	public static int solution(int[] d, int budget) {
		
		int answer = 0;
		Arrays.sort(d);
		
//		���� ��� ����� ���� �� ���� �Ŀ� �ִ��� ��츦 ���� �ʿ䰡 ����
//		������������ �����Ͽ� ���� ������ ���� �μ������ �����ִ� ���� ���� ���� �μ��� ������ �� �ִ� ���
		int sum = 0;
		for(int i=0; i<d.length; i++) {
			
			if(sum + d[i] <= budget) {
				sum += d[i];
				answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
//		int[] d = {5,2,4,1,3};
//		int[] d = {1,3,2,5,4};
		int[] d = {2,2,3,3};
//		int[] d = {1,2,6,9};
		int budget = 10;
		System.out.println(solution(d, budget));
		
	}
}