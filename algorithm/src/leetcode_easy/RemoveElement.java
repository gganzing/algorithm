package leetcode_easy;

import java.util.Arrays;

// 매개변수로 전달 받은 값을 제거한 배열의 길이를 반환
// 추가로 새로운 배열을 생성하지 말 것
// 배열의 요소는 새 길이만큼, 제외한 값을 제외한 순서대로 배치되도록 할 것 / 그 뒤의 요소는 어떤 수이든 신경쓰지 않아도 됨
// Given an array nums and a value val, remove all instances of that value in-place and return the new length.
// Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
// The order of elements can be changed. It doesn't matter what you leave beyond the new length.
// example 1:
//	Given nums = [3,2,2,3], val = 3,
//	Your function should return length = 2, with the first two elements of nums being 2.
//	It doesn't matter what you leave beyond the returned length.
// example 2:
//	Given nums = [0,1,2,2,3,0,4,2], val = 2,
//	Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.
//	Note that the order of those five elements can be arbitrary.
//	It doesn't matter what values are set beyond the returned length.
	
public class RemoveElement {
	
	public static int removeElement(int[] nums, int val) {
        
		int len = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] != val) {
				nums[len] = nums[i];
				len++;
			}
		}
		
		System.out.println(Arrays.toString(nums));
		
		return len;
    }
	
	public static void main(String[] args) {
		
//		int nums[] = {3,2,2,3};
//		int val = 3;
		int nums[] = {0,1,2,2,3,0,4,2};
		int val = 2;
		System.out.println(removeElement(nums, val));
		
	}

}
