package leetcode_easy;

//  ���� target�� ���ڸ� ��Ÿ���� �迭�� �� ����� �ε��� ��ȣ ���
//	�ε��� ���� ���κ��̽��� �ƴ�/ �ݵ�� ���� �ε��� ��ȣ�� �տ� ���
//
//	Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
//	The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
//	
//	Your returned answers (both index1 and index2) are not zero-based.
//	You may assume that each input would have exactly one solution and you may not use the same element twice.
//
//	Input: numbers = [2,7,11,15], target = 9
//	Output: [1,2]
//	Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.

import java.util.Arrays;

public class TwoSum2 {

	public static int[] twoSum(int[] numbers, int target) {

		int arr[] = new int[2];
		
		for(int i=0; i<numbers.length-1; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				if(numbers[i] + numbers[j] == target) {
					arr[0] = i+1;
					arr[1] = j+1;
				}
			}
		}
		
		return arr;
		
		
//		�ٸ� ��� �ڵ� ���Ҵ� ��
//		int start = 0, end = numbers.length - 1;
//
//		while (start < end) {
//
//			if (numbers[start] + numbers[end] == target) {
//				break;
//			}
//
//			if (numbers[start] + numbers[end] < target) {
//				start++;
//			} else {
//				end--;
//			}
//		}
//
//		int arr[] = new int[] { start + 1, end + 1 };
//
//		return arr;
		
	}

	public static void main(String[] args) {

		int numbers[] = { 2, 7, 11, 15 };
		int target = 9;

		System.out.println(Arrays.toString(twoSum(numbers, target)));

	}
}
