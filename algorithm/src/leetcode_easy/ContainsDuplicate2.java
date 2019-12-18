package leetcode_easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//	�迭 �� �ߺ� ���� ��ġ ���̰��� k���� �۰ų� ������[�ִ� k�̳� ����] �Ǵ�
//	Given an array of integers and an integer k, 
//	find out whether there are two distinct indices i and j in the array 
//	such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

public class ContainsDuplicate2 {
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        
		for(int i=0; i<nums.length-1; i++) {
			
			for(int j=i+1; j<nums.length; j++) {
				
				if(nums[i] == nums[j]) {
					
					if(Math.abs(j-i) <= k) {
						
						return true;
					}
					
				}
				
			}
			
		}
		return false;
    }
	
	
//	�ٸ� ��Ǯ
//	public static boolean containsNearbyDuplicate(int[] nums, int k) {
//		
//        Set<Integer> set = new HashSet<Integer>();
//        
//        for(int i = 0; i < nums.length; i++){
//        	
//        	// set�� ũ�⸦ ��� k���� ũ�� ��ŭ ����� ��
//            // remove element if its distance to nums[i] is not lesser than k
//            if(i > k) {
//            	
//            	// �� ũ�⸦ ����� �ߺ� ���� ���� ���� �ش������ ���� ���[false]�̹Ƿ�,
//            	// k�� ������ �ʰ� �ߴٸ�, ���� set�� ���� �տ� ��� �ִ� ��Ҹ� ������!
//            	set.remove(nums[i-k-1]);
//            }
//            
//            // because all still existed elements is closer than k distance to the num[i], therefore if the add() return false, 
//            // it means there's a same value element already existed within the distance k, therefore return true.
//            // set�� ũ�⸦ true���ǿ� �°� �����ؿ����Ƿ�, �ߺ� ���� ����ٸ� true!
//            if(!set.add(nums[i])) {
//            
//            	return true; 
//            }
//        }
//        return false;
// }
	
	
	public static void main(String[] args) {
		
		int nums[] = {1,0,1,1};
//		int nums[] = {1,1};
//		int nums[] = {1,2,3,4};
		int k = 1;
		
		System.out.println(containsNearbyDuplicate(nums, k));
		
	}

}
