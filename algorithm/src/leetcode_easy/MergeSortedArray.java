package leetcode_easy;

import java.util.Arrays;

//	���޹��� �� ���� �����迭�� �迭1�� ���ļ�, ������������ ���� �� ��ȯ
//	nums1���� �� ���� ��ĥ �� �ִ� ũ���� ������ ����/ ���� m, n�� �� �迭�� ����� ����
//	Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
//	The number of elements initialized in nums1 and nums2 are m and n respectively.
//	You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
//	
//	Input:
//	nums1 = [1,2,3,0,0,0], m = 3
//	nums2 = [2,5,6],       n = 3
//	Output: [1,2,2,3,5,6]

public class MergeSortedArray {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		int j = 0;
		for (int i = m; i<m+n; i++) {
			nums1[i] = nums2[j];
			j++;
		}

		Arrays.sort(nums1);

//		for(int a=0; a<nums1.length-1; a++) {
//			int temp = 0;
//			for(int b=a+1; b<nums1.length; b++) {
//				if(nums1[a]>nums1[b]) {
//					temp = nums1[a];
//					nums1[a] = nums1[b];
//					nums1[b] = temp;
//				}
//			}
//		}

//		�ٸ� ��� �ڵ�
//		int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1; �������� ���
//		
//		������ �迭�� �� �ε���[������ �� ���� ����ִ�]���� ��ĥ �� �迭�� �� �� ���� ���ؼ� ū ������ �Ųٷ� �־��ֱ�
//		while (tail1 >= 0 && tail2 >= 0) {
//			nums1[finished--] = (nums1[tail1] > nums2[tail2]) ? nums1[tail1--] : nums2[tail2--];
//		}
//
//		while (tail2 >= 0) { // only need to combine with remaining nums2
//			nums1[finished--] = nums2[tail2--];
//		}

		System.out.println(Arrays.toString(nums1));
	}

	public static void main(String[] args) {

		int nums1[] = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int nums2[] = { 2, 5, 6 };
		int n = 3;

		merge(nums1, m, nums2, n);

	}

}
