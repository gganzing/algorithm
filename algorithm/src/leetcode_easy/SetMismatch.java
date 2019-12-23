package leetcode_easy;

import java.util.Arrays;
import java.util.HashSet;

//	배열 속 중복 된 숫자와 누락 된 숫자를 찾아서 배열 형태로 반환
//	The set S originally contains numbers from 1 to n. 
//	But unfortunately, due to the data error, one of the numbers in the set got duplicated to another number in the set, 
//	which results in repetition of one number and loss of another number.
//	Given an array nums representing the data status of this set after the error. 
//	Your task is to firstly find the number occurs twice and then find the number that is missing. 
//	Return them in the form of an array.
//	Input: nums = [1,2,2,4]
//	Output: [2,3]
//	The given array size will in the range [2, 10000].
//	The given array's numbers won't have any order.

public class SetMismatch {
	
	public static int[] findErrorNums(int[] nums) {
		
		int re[] = new int[2];
		
		for(int i=0; i<nums.length; i++) {
			int num = Math.abs(nums[i]) - 1;
			
			if(nums[num] > 0) {
				nums[num] = -nums[num]; 
				
			}else if(nums[num] < 0){
				re[0] = num + 1;
			}
		}
		
		for(int j=0; j<nums.length; j++) {
			if(nums[j] > 0) {
				re[1] = j+1;
			}
		}
		
		return re;
    
		
//		HashSet<Integer> set = new HashSet<Integer>();
//		int re[] = new int[2];
//		
//		for(int n : nums) {
//			if(!set.add(n)){
//				re[0] = n;
//			}
//		}
//        
//		for(int i=1; i<=nums.length; i++) {
//			if(!set.contains(i)) {
//				re[1] = i;
//			}
//		}
//		
//        return re;
    }

	public static void main(String[] args) {
		
//		int nums[] = {1,2,2,4};
		int nums[] = {2,2};
		System.out.println(Arrays.toString(findErrorNums(nums)));
		
	}
}
