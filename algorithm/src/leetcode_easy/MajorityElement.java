package leetcode_easy;

import java.util.Arrays;
import java.util.HashMap;

//	배열 안의 주요 요소 찾기 
// 	주요 값은 배열의 길이의 절반이상의 수가 들어있음, 배열은 비어있지 않음, 배열안에는 반드시 주요 요소가 존재함
//	Given an array of size n, find the majority element. The majority element is the element that appears more than [n/2] times.
//	You may assume that the array is non-empty and the majority element always exist in the array.
//	
//	Input: [3,2,3]
//	Output: 3
//	
//	Input: [2,2,1,1,1,2,2]
//	Output: 2

public class MajorityElement {

	public static int majorityElement(int[] nums) {

		int r = 0;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			if (map.containsKey(nums[i])) {

				map.put(nums[i], map.get(nums[i]) + 1);

			} else {
				map.put(nums[i], 1);
			}

			if (map.get(nums[i]) > nums.length / 2) {

				r = nums[i];
			}
		}

		return r;

//		다른 문풀2
//		int count = 0, ret = 0;
//		for (int num : nums) {
//
//			if (count == 0)
//				ret = num;
//
//			if (num != ret)
//				count--;
//
//			else
//				count++;
//		}
//
//		return ret;

//		다른 문풀1 : 주요값은 항상 배열의 길이의 과반수 이상이므로!! 
//		Arrays.sort(nums);
//	    return nums[nums.length/2];

	}

	public static void main(String[] args) {

		int[] nums = { 3, 2, 3 };
//		int []nums = {2,2,1,1,1,2,2};
//		int []nums = {1};
		System.out.println(majorityElement(nums));

	}
}
