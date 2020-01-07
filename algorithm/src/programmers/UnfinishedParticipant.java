package programmers;

import java.util.HashMap;

//	마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
//	완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
//	
//	제한사항
//	마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
//	completion의 길이는 participant의 길이보다 1 작습니다.
//	참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
//	참가자 중에는 동명이인이 있을 수 있습니다.
//
//	입출력 예
//	participant									completion							return
//	[leo, kiki, eden]							[eden, kiki]						leo
//	=> leo는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
//	[marina, josipa, nikola, vinko, filipa]		[josipa, filipa, marina, nikola]	vinko
//	=> vinko는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
//	[mislav, stanko, mislav, ana]				[stanko, ana, mislav]				mislav
//	=> mislav는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.

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
		
		
//		다른 문풀 : getOrDefault 사용
//		map.getOrDefault("key","value") 
//		=> 해당 key의 값이 없을 경우, 설정한 값 "value"를 return [set되는 것은 아님] 
//		map.putIfAbsent("key","value")
//		=> 해당 key의 값이 없을 경우, 설정한 값 "value"를 해당 키의 값으로 set!
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
		
		
//		다른 문풀2
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
		
		
//		효율성 불통
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
