package leetcode_easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//	배열 안 중복 값의 위치 차이값이 k보다 작거나 같은지[최대 k이내 인지] 판단
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
	
	
//	다른 문풀
//	public static boolean containsNearbyDuplicate(int[] nums, int k) {
//		
//        Set<Integer> set = new HashSet<Integer>();
//        
//        for(int i = 0; i < nums.length; i++){
//        	
//        	// set의 크기를 계속 k값의 크기 만큼 만들어 둠
//            // remove element if its distance to nums[i] is not lesser than k
//            if(i > k) {
//            	
//            	// 그 크기를 벗어나서 중복 값이 생길 경우는 해당사항이 없는 경우[false]이므로,
//            	// k의 범위를 초과 했다면, 현재 set의 가장 앞에 담겨 있는 요소를 지워줌!
//            	set.remove(nums[i-k-1]);
//            }
//            
//            // because all still existed elements is closer than k distance to the num[i], therefore if the add() return false, 
//            // it means there's a same value element already existed within the distance k, therefore return true.
//            // set의 크기를 true조건에 맞게 조정해왔으므로, 중복 값이 생겼다면 true!
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
