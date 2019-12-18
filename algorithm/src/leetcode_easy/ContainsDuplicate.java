package leetcode_easy;

import java.util.HashSet;

//	배열 안에 중복 요소 있는지 판단, 하나의 요소가 하나 이상의 중복 값을 가질 경우 true 반환, 모두 유일할 경우 false 반환
//	Given an array of integers, find if the array contains any duplicates.
//	Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

public class ContainsDuplicate {
	
	public static boolean containsDuplicate(int[] nums) {
        
//		for(int i=0; i<nums.length-1; i++) {
//			
//			for(int j=i+1; j<nums.length; j++) {
//				
//				if(nums[i]==nums[j]) {
//					
//					return true;
//				}
//			}
//		}
//		
//		return false;
		
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i : nums) {
			
			if(!set.add(i)) {
				
				return true;
			}
			
//			if(set.contains(i)) {
//				
//				return true;
//			}
//			
//			set.add(i);
		}
		return false;
		
    }
	
	
	public static void main(String[] args) {
		
		int nums[] = {1,2,3,1};
//		int nums[] = {1,2,3,4};
		
		System.out.println(containsDuplicate(nums));
		
	}

}
