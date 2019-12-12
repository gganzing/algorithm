package leetcode_easy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Two Sum ///
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//Example:
//Given nums = [2, 7, 11, 15], target = 9,
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].

public class TwoSum {
	
    public static int[] twoSum(int[] nums, int target) {
    	
//    	�ٸ� ��Ǯ
//    	int[] result = new int[2];
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(target - nums[i])) {
//                result[1] = i;
//                result[0] = map.get(target - nums[i]);
//                
//                return result;
//            }
//            map.put(nums[i], i);
//        }
//        
//        return result;
        
        int []result = new int[2];
        for(int i=0; i<nums.length; i++){
            int sum = 0;
            for(int j=i+1; j<nums.length; j++){
                sum = nums[i]+nums[j];
                if(target == sum){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
		
		int []nums = {3,3};
		int target = 6;
		int result[] = twoSum(nums, target);
		System.out.println(Arrays.toString(result));
	}
}

