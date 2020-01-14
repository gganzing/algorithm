package programmers;

import java.util.Arrays;

//	h�� �̻� �ο� �� ���� h�� �̻��� ��, h�� �ִ� ���� ���϶�
//
//	H-Index�� �������� ���꼺�� ������� ��Ÿ���� ��ǥ�Դϴ�. ��� �������� H-Index�� ��Ÿ���� ���� h�� ���Ϸ��� �մϴ�. 
//	��Ű���1�� ������, H-Index�� ������ ���� ���մϴ�.
//	� �����ڰ� ��ǥ�� �� n�� ��, h�� �̻� �ο�� ���� h�� �̻��̰� ������ ���� h�� ���� �ο�Ǿ��ٸ� h�� �� �������� H-Index�Դϴ�.
//	� �����ڰ� ��ǥ�� ���� �ο� Ƚ���� ���� �迭 citations�� �Ű������� �־��� ��, �� �������� H-Index�� return �ϵ��� solution �Լ��� �ۼ����ּ���.
//	���ѻ���
//	�����ڰ� ��ǥ�� ���� ���� 1�� �̻� 1,000�� �����Դϴ�.
//	���� �ο� Ƚ���� 0ȸ �̻� 10,000ȸ �����Դϴ�.
//	����� ��
//	citations		return
//	[3, 0, 6, 1, 5]	3
//	����� �� ����
//	�� �����ڰ� ��ǥ�� ���� ���� 5���̰�, �� �� 3���� ���� 3ȸ �̻� �ο�Ǿ����ϴ�. 
//	�׸��� ������ 2���� ���� 3ȸ ���� �ο�Ǿ��� ������ �� �������� H-Index�� 3�Դϴ�.

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
		
		
//		�ٸ� ��Ǯ
//		int answer = 0;
//
//        Arrays.sort(citations); // �������� ����
//
//        for(int i = citations.length - 1; i >= 0; i--) {
//            if(citations.length - i > citations[i]) break;
//            // >= �� �� ���, 1�� ��� �ִ� �迭���� ���� ���� ��Ű�� �� ��
//            // �������� ���ķ� ���� ���� ������ ��� ū �� 
//            // h-index�� h���ڰ� h�� �̻� �ο�Ǿ� ��!
//			// ���� citations.length - i ��[�ش� �ε��������� ����]�̻��� citations[i]���� �������Ѿ߸� ���� ����
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
