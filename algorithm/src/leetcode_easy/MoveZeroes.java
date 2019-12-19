package leetcode_easy;

import java.util.Arrays;

//	�迭�� ��� 0�� 0�� �ƴ� ��ҵ��� �� �ڷ� ��� �ű��
//	��, �迭�� �������� �ʱ�, �۾��� ���� �ּ�ȭ ��Ű��
//	Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//	Input: [0,1,0,3,12]
//	Output: [1,3,12,0,0]
//	You must do this in-place without making a copy of the array.
//	Minimize the total number of operations.

public class MoveZeroes {

	public static void moveZeroes(int[] nums) {
		
		int idx = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] != 0) {
				nums[idx++] = nums[i];
			}
		}
		
		for(int j=idx; j<nums.length; j++) {
			nums[idx++] = 0;
		}
		
		
//		for(int i=0; i<nums.length-1; i++) {
//			for(int j=i+1; j<nums.length; j++) {
//				if(nums[i] == 0 && nums[j] != 0) {
//					nums[i] = nums[j];
//					nums[j] = 0;
//				}
//			}
//		}
		

//		0�� �ڷ� �ű�� ���� ������ ��� ��Ҵ� ������ ������ ��µǵ��� �ϱ�, ���� ���~
//		Arrays.sort(nums);
//
//		int i = 0;
//
//		for (i = 0; i < nums.length; i++) {
//			if (nums[i] != 0) {
//				break;
//			}
//		}
//
//		int k = 0;
//		for (int j = i; j < nums.length; j++) {
//			nums[k++] = nums[j];
//		}
//
//		int len = nums.length - 1;
//		for (int l = i; l > 0; l--) {
//			nums[len--] = 0;
//		}

		System.out.println(Arrays.toString(nums));

	}

	public static void main(String[] args) {

//		int nums[] = {0,1,0,3,12};
//		int nums[] = {0,1};
//		int nums[] = {2,1};
		int nums[] = {4,2,4,0,0,3,0,5,1,0};
		
		moveZeroes(nums);

	}

}
