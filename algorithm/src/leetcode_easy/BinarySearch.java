package leetcode_easy;

//	이진 검색을 활용하여 원하는 데이터를 찾아 인덱스 번호를 반환, 없을 경우 -1 반환
//	Given a sorted (in ascending order) integer array nums of n elements and a target value, write a function to search target in nums. 
//	If target exists, then return its index, otherwise return -1.
//	You may assume that all elements in nums are unique.
//	n will be in the range [1, 10000].
//	The value of each element in nums will be in the range [-9999, 9999].


public class BinarySearch {
	
	public static int search(int[] nums, int target) {
		
		int start = 0;
		int end = nums.length-1;
		
		while(start <= end) {

			int mid = (start + end)/2;
			
			if(nums[mid] == target) {
				
				return mid;
				
			}else if(nums[mid] < target) {
				
				start = mid + 1;
				
			}else if(nums[mid] > target) {
				
				end = mid - 1;
			}
			
		}
		
		return -1;
    }
	
	public static void main(String[] args) {
		
		int []nums = {-1,0,3,5,9,12};
//		int target = 9;
		int target = 2;
		System.out.println(search(nums, target));
		
	}

}
