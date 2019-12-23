package leetcode_easy;

import java.util.Arrays;
import java.util.HashMap;

//	�迭 �� ������� ������ ��/��/�� + ������ ������ �ش� ������ ������ ���� �迭�� ��ȯ
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
				// for i�� 0���� �����ϰ� �ϰ�, ������ �״��
				// ranking = nums.length-i �̷��� �ص�~
				String ranking = r++ + "";
				rank.put(clone[i], ranking);
			}
		}
		
		String []result = new String[nums.length];
		for(int j=0; j<nums.length; j++) {
			result[j] = rank.get(nums[j]);
		}
        
		return result;
		
		
//		�ٸ� ��Ǯ
//		index�� �迭 ����
//		Integer[] index = new Integer[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            index[i] = i;
//        }
//        
//        // Arrays.sort(������ �迭, ���� ����) ���� ���� �𸣰���, ���߿� �ٽ� ����!
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
