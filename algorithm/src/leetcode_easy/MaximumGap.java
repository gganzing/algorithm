package leetcode_easy;

import java.util.Arrays;

//	오름차순으로 배열을 정렬/ 정렬된 배열의 붙어있는 요소의 가장 큰 차이값을 반환
//	Given an unsorted array, find the maximum difference between the successive elements in its sorted form.
//	Return 0 if the array contains less than 2 elements.
//	
//	Input: [3,6,9,1]
//	Output: 3
//	Explanation: The sorted form of the array is [1,3,6,9], either
//	             (3,6) or (6,9) has the maximum difference 3.
//	
//	You may assume all elements in the array are non-negative integers and fit in the 32-bit signed integer range.
//	Try to solve it in linear time/space. 

public class MaximumGap {

	public static int maximumGap(int[] nums) {
		
		if(nums.length < 2) {
			
			return 0;
		}
        
		int max = 0;
		
		Arrays.sort(nums);
		
		for(int i=0; i<nums.length-1; i++) {
			int gap = nums[i+1] - nums[i];
			if(gap > max) {
				max = gap;
			}
		}
		
		return max;
    }
	
	public static void main(String[] args) {
		
		int nums[] = {3,6,9,1};
		
		System.out.println(maximumGap(nums));
		
	}
	
}
