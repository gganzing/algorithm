package leetcode_easy;

import java.util.ArrayList;
import java.util.Arrays;

// �ߺ��� ���� �� �迭�� ���� ��ȯ, �ٸ� �迭�� �߰� ������ �Ҵ����� �� ��!
// �ߺ��� ������ �ش� ���̱����� ��Ҵ� �ߺ����� ������ ��ҵ�� �̷����־�� ��
// Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
// *Do not allocate extra space for another array*, you must do this by modifying the input array 'in-place' with O(1) extra memory.
// Given nums = [0,0,1,1,1,2,2,3,3,4],
// Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
// It doesn't matter what values are set beyond the returned length.

public class RemoveDuplicates {

	public static int removeDuplicates(int[] nums) {
		
		
//		if (nums.length==0) {
//			return 0;
//		}
//		
//	    int len = 0;
//	    for (int i=0; i<nums.length; i++) {
//	    	if (nums[i]!=nums[len]) {
//	    		nums[++len]=nums[i];
//	    	}
//	    }
//	    System.out.println(Arrays.toString(nums));
//	    
//	    return ++len;
		
		
		
		int len = 1;
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i] != nums[i+1] && nums[len-1] < nums[i+1] ) {
				nums[len] = nums[i+1];
				len++;
			}
		}
		System.out.println(Arrays.toString(nums));
		
		return len;
		
		
	    
		/*
		int len = 1;
		for(int i=0; i<nums.length-1; i++) {
			for(int j=i+1; j<nums.length; j++) {
//				int temp = 0;
				if(nums[i] != nums[j] && nums[len-1] < nums[j] ) {
//					temp = nums[j];
					nums[len] = nums[j];
//					nums[j] = nums[len];
					len++;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
		
		return len;
		*/


		
//		ArrayList<Integer> nums2 = new ArrayList<Integer>();
//		nums2.add(nums[0]);
//		
//		for(int i : nums) {
//			int check = -1;
//			for(int j=0; j<nums2.size(); j++) {
//				
//				if(i == nums2.get(j)) {
//					check = 0;
//					break;
//				}
//			}
//			
//			if(check == -1) {
//				nums2.add(i);
//			}
//		}
//		System.out.println(nums2);
//		System.out.println(Arrays.toString(nums));
//		
//		return nums2.size();
		
    }
	
	public static void main(String[] args) {
		
//		int nums[] = {1,1,2};
		int nums[] = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(nums));
		
	}
	
}
