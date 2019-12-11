package leetcode_easy;

//정렬 된 배열 속, 타깃 숫자의 인덱스 반환
//없을 경우, 들어갈 위치의 인덱스 반환
// Given a sorted array and a target value, return the index if the target is found. 
//		 If not, return the index where it would be if it were inserted in order.
// You may assume no duplicates in the array.

// Input: [1,3,5,6], 5
// Output: 2
// Input: [1,3,5,6], 2
// Output: 1
// Input: [1,3,5,6], 7
// Output: 4
// Input: [1,3,5,6], 0
// Output: 0

public class SearchInsertPosition {

	public static int searchInsert(int[] nums, int target) {
        
		int idx = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == target) {
				return i;
				
			}else if(nums[i] < target) {
				idx = i+1;
			}
		}
		
		return idx;
    }
	
	public static void main(String[] args) {
		
		int []nums = {1,3,5,6};
//		int target = 5;
//		int target = 2;
//		int target = 7;
		int target = 0;
		System.out.println(searchInsert(nums, target));
		
	}
	
}
