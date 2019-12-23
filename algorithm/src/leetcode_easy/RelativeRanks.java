package leetcode_easy;

import java.util.Arrays;
import java.util.HashMap;

//	배열 안 고득점자 순으로 금/은/동 + 이하의 점수는 해당 점수의 순위를 담은 배열을 반환
//	Given scores of N athletes, find their relative ranks and the people with the top three highest scores, 
//	who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".
//	Input: [5, 4, 3, 2, 1]
//	Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
//	Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal". 
//	For the left two athletes, you just need to output their relative ranks according to their scores.
//	N is a positive integer and won't exceed 10,000.
//	All the scores of athletes are guaranteed to be unique.

public class RelativeRanks {

	public static String[] findRelativeRanks(int[] nums) {
		
		int []clone = nums.clone();
		Arrays.sort(clone);
		
		HashMap<Integer, String> rank = new HashMap<Integer, String>();
		
		int r = 4;
		for(int i=nums.length-1; i>=0; i--) {
			
			if(i == nums.length-1) {
				rank.put(clone[i], "Gold Medal");
				
			}else if(i == nums.length-2) {
				rank.put(clone[i], "Silver Medal");
				
			}else if(i == nums.length-3){
				rank.put(clone[i], "Bronze Medal");
				
			}else {
				// for i가 0부터 시작하게 하고, 위에는 그대로
				// ranking = nums.length-i 이렇게 해도~
				String ranking = r++ + "";
				rank.put(clone[i], ranking);
			}
		}
		
		String []result = new String[nums.length];
		for(int j=0; j<nums.length; j++) {
			result[j] = rank.get(nums[j]);
		}
        
		return result;
		
		
//		다른 문풀
//		index에 배열 복사
//		Integer[] index = new Integer[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            index[i] = i;
//        }
//        
//        // Arrays.sort(정렬할 배열, 정렬 기준) 여기 부터 모르겠음, 나중에 다시 보기!
//        Arrays.sort(index, (a, b) -> (nums[b] - nums[a]));
//        
//        String[] result = new String[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            if (i == 0) {
//                result[index[i]] = "Gold Medal";
//            }
//            else if (i == 1) {
//                result[index[i]] = "Silver Medal";
//            }
//            else if (i == 2) {
//                result[index[i]] = "Bronze Medal";
//            }
//            else {
//                result[index[i]] = (i + 1) + "";
//            }
//        }
//		
//        return result;
		
    }
	
	public static void main(String[] args) {

//		int nums[] = {5, 4, 3, 2, 1};
		int nums[] = {5, 14, 3, 22, 10};
		System.out.println(Arrays.toString(findRelativeRanks(nums)));
		
	}
	
}
