package leetcode_easy;

//	주어진 배열의 연속된 요소를 가진 하위배열 중 합이 가장 큰 결과를 반환

//	Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//
//	Input: [-2,1,-3,4,-1,2,1,-5,4],
//	Output: 6
//	Explanation: [4,-1,2,1] has the largest sum = 6.
//	
//	If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

public class MaximumSubarray {
	
	public static int maxSubArray(int[] nums) {

		// 내일 다시 확인하기
		int max = nums[0];
		for(int i=0; i<nums.length; i++) {
			int sum = 0;
			for(int j=i; j<nums.length; j++) {
				sum += nums[j];
				if(max < sum) {
					max = sum;
				}
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		
//		int []nums = {-2,1,-3,4,-1,2,1,-5,4}; // 6
		int []nums = {8,-19,5,-4,20}; // 21
		System.out.println(maxSubArray(nums));
		
	}

}
