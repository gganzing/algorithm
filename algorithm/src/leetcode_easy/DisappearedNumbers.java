package leetcode_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//	�迭 �� ���� �� ���� ã��, ������ ������ ������ �ʰ� Ǯ��
//	Given an array of integers where 1 �� a[i] �� n (n = size of array), some elements appear twice and others appear once.
//	Find all the elements of [1, n] inclusive that do not appear in this array.
//	Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
//		Input:	[4,3,2,7,8,2,3,1]
//		Output: [5,6]

public class DisappearedNumbers {
	
	public static List<Integer> findDisappearedNumbers(int[] nums) {
        
		List<Integer> list = new ArrayList<Integer>();
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int n : nums) {
			set.add(n);
		}
		
		for(int i=1; i<=nums.length; i++) {
			if(!set.contains(i)) {
				list.add(i);
			}
		}
		return list;
		
		
//		�ٸ� ��Ǯ
//		�ε��� ��ȣ�� 0���� length-1����
//		�迭 �� ����� ������ 1����[0��° �ε���] �迭.length[length-1��° �ε���]����
//		�迭�� �ε��� ��ȣ�� �̿��ؼ�, �迭 ���� �̹� �ִ� ����� ���� �ش� �ε������� ��Ҹ� ������ ����� ����
//		�迭�� ����� ���� ������ �ƴ� ���� ������ �ִ� �迭�̶��, �ش� ���� ������ ���� �� �� ����
//		���� �ش� �ε�����ȣ+1�� ���� ����Ʈ�� �߰��ϰ� ��ȯ
//		List<Integer> list = new ArrayList<Integer>();
//
//		for (int i = 0; i < nums.length; i++) {
//			int val = Math.abs(nums[i]) - 1;
//			if (nums[val] > 0) {
//				nums[val] = -nums[val];
//			}
//		}
//
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] > 0) {
//				list.add(i + 1);
//			}
//		}
//		return list;
		
//		�� �ڵ�� ���� ���ε�, �����ϴ� ����� +length������ �� ��Ǯ
//		List<Integer> res = new ArrayList<>();
//        int n = nums.length;
//        for (int i = 0; i < nums.length; i ++) nums[(nums[i]-1) % n] += n;
//        for (int i = 0; i < nums.length; i ++) if (nums[i] <= n) res.add(i+1);
//        return res;
		
    }
	
	public static void main(String[] args) {
		
		int []nums = {4,3,2,7,8,2,3,1};
//		int []nums = {1,1,1};
		System.out.println(findDisappearedNumbers(nums));
		
	}

}
