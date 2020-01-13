package programmers;
	
//	���ɽð��� ������ ���, �Ϻ� �л��� ü������ �������߽��ϴ�. 
//	������ ���� ü������ �ִ� �л��� �̵鿡�� ü������ �����ַ� �մϴ�. 
//	�л����� ��ȣ�� ü�� ������ �Ű��� �־�, �ٷ� �չ�ȣ�� �л��̳� �ٷ� �޹�ȣ�� �л����Ը� ü������ ������ �� �ֽ��ϴ�. 
//	���� ���, 4�� �л��� 3�� �л��̳� 5�� �л����Ը� ü������ ������ �� �ֽ��ϴ�. 
//	ü������ ������ ������ ���� �� ���� ������ ü������ ������ ���� �ִ��� ���� �л��� ü�������� ���� �մϴ�.
//	
//	��ü �л��� �� n, ü������ �������� �л����� ��ȣ�� ��� �迭 lost, 
//	������ ü������ ������ �л����� ��ȣ�� ��� �迭 reserve�� �Ű������� �־��� ��, 
//	ü�������� ���� �� �ִ� �л��� �ִ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
//	
//	���ѻ���
//	��ü �л��� ���� 2�� �̻� 30�� �����Դϴ�.
//	ü������ �������� �л��� ���� 1�� �̻� n�� �����̰� �ߺ��Ǵ� ��ȣ�� �����ϴ�.
//	������ ü������ ������ �л��� ���� 1�� �̻� n�� �����̰� �ߺ��Ǵ� ��ȣ�� �����ϴ�.
//	���� ü������ �ִ� �л��� �ٸ� �л����� ü������ ������ �� �ֽ��ϴ�.
//	***���� ü������ ������ �л��� ü������ ���������� �� �ֽ��ϴ�. 
//	***�̶� �� �л��� ü������ �ϳ��� �������ߴٰ� �����ϸ�, ���� ü������ �ϳ��̱⿡ �ٸ� �л����Դ� ü������ ������ �� �����ϴ�.
//	
//	����� ��
//	n	lost	reserve		return
//	5	[2, 4]	[1, 3, 5]	5
//	5	[2, 4]	[3]			4
//	3	[3]		[1]			2
//	����� �� ����
//	���� #1
//	1�� �л��� 2�� �л����� ü������ �����ְ�, 3�� �л��̳� 5�� �л��� 4�� �л����� ü������ �����ָ� �л� 5���� ü�������� ���� �� �ֽ��ϴ�.
//	���� #2
//	3�� �л��� 2�� �л��̳� 4�� �л����� ü������ �����ָ� �л� 4���� ü�������� ���� �� �ֽ��ϴ�.

public class WorkoutClothes {

	public static int solution(int n, int[] lost, int[] reserve) {
        
		int answer = n - lost.length;

		for (int k=0; k<lost.length; k++) {
			for (int i = 0; i < reserve.length; i++) {
				if (lost[k] == reserve[i]) {
					answer++;
					reserve[i] = -reserve[i];
					lost[k] = -lost[k];
					break;
				}
			}
		}
		
		for(int student : lost) {
			if(student < 0) {
				continue;
			}
			
			for(int j=0; j<reserve.length; j++) {
				if(reserve[j]-1 == student || reserve[j]+1 == student) {
					answer++;
					reserve[j] = -reserve[j];
					break;
				}
			}
		}
        return answer;
        
        
//        �ٸ� ��Ǯ
//        int answer = n - lost.length;
//        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//
//        for (int i = 0; i < reserve.length; i++) {
//           map.put(reserve[i], reserve[i]);
//        }
//
//        for (int i = 0; i < lost.length; i++) {
//           if (map.containsKey(lost[i])) {
//              answer++;
//              map.remove(lost[i]);
//              lost[i] = -1;
//           }
//        }
//
//        for (int i = 0; i < lost.length; i++) {
//           if (map.containsKey(lost[i] - 1)) {
//              answer++;
//              map.remove(lost[i] - 1);
//           } else if (map.containsKey(lost[i] + 1)) {
//              answer++;
//              map.remove(lost[i] + 1);
//           }
//        }
//
//
//        return answer;

    }
	
	public static void main(String[] args) {
		
//		int n = 5;
//		int[] lost = {2, 4};
//		int[] reserve = {1, 3, 5};
		int n = 10;
		int[] lost = {3,9,10};
		int[] reserve = {3,8,9}; //9
//		int n = 3;
//		int n = 5;
//		int[] lost = {2, 4};
//		int[] reserve = {3};
		System.out.println(solution(n, lost, reserve));
		
	}
	
}
