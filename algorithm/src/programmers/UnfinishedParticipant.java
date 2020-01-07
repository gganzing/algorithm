package programmers;

import java.util.HashMap;

//	�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, 
//	�������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
//	
//	���ѻ���
//	������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
//	completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
//	�������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
//	������ �߿��� ���������� ���� �� �ֽ��ϴ�.
//
//	����� ��
//	participant									completion							return
//	[leo, kiki, eden]							[eden, kiki]						leo
//	=> leo�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.
//	[marina, josipa, nikola, vinko, filipa]		[josipa, filipa, marina, nikola]	vinko
//	=> vinko�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.
//	[mislav, stanko, mislav, ana]				[stanko, ana, mislav]				mislav
//	=> mislav�� ������ ��ܿ��� �� ���� ������, ������ ��ܿ��� �� ��ۿ� ���� ������ �Ѹ��� �������� ���߽��ϴ�.

public class UnfinishedParticipant {

	public static String solution(String[] participant, String[] completion) {
        
		String answer = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String p : participant) {
			if(map.containsKey(p)) {
				map.put(p, map.get(p)+1);

			}else {
				map.put(p, 1);
			}
		}
		
		for(String c : completion) {
			map.put(c, map.get(c)-1);
		}
		
		for(String a : map.keySet()) {
			if(map.get(a) != 0) {
				answer = a;
				break;
			}
		}
		
		return answer;
		
		
//		�ٸ� ��Ǯ : getOrDefault ���
//		map.getOrDefault("key","value") 
//		=> �ش� key�� ���� ���� ���, ������ �� "value"�� return [set�Ǵ� ���� �ƴ�] 
//		map.putIfAbsent("key","value")
//		=> �ش� key�� ���� ���� ���, ������ �� "value"�� �ش� Ű�� ������ set!
//		
//		String answer = "";
//        HashMap<String, Integer> hm = new HashMap<>();
//        for (String player : participant) {
//        	hm.put(player, hm.getOrDefault(player, 0) + 1);
//        }
//        
//        for (String player : completion) {
//        	hm.put(player, hm.get(player) - 1);
//        }
//
//        for (String key : hm.keySet()) {
//            if (hm.get(key) != 0){
//                answer = key;
//            }
//        }
//        return answer;
		
		
//		�ٸ� ��Ǯ2
//		Arrays.sort(participant);
//		Arrays.sort(completion);
//		int i;
//		for (i = 0; i < completion.length; i++) {
//
//			if (!participant[i].equals(completion[i])) {
//				return participant[i];
//			}
//		}
//		return participant[i];
		
		
//		ȿ���� ����
//		for(String com : completion) {
//			for(int i=0; i<participant.length; i++) {
//				if(com.equals(participant[i])) {
//					participant[i] = null;
//					break;
//				}
//			}
//		}
//		
//		String answer = "";
//		for(String pa : participant) {
//			if(pa != null) {
//				answer += pa;
//			}
//		}
//        
//        return answer;
    }
	
	public static void main(String[] args) {
		
		String participant[] = {"mislav", "stanko", "mislav", "ana"};
		String completion[] = {"stanko", "ana", "mislav"};
		System.out.println(solution(participant, completion));
		
	}
	
}
