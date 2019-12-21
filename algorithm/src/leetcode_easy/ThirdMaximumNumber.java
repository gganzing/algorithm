package leetcode_easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

//	배열의 요소 중, 세 번째로 큰 값을 반환
//	중복 값은 하나의 값이며, 세 번째 큰 값이 없을 경우 가장 큰 값을 반환
//	Given a non-empty array of integers, return the third maximum number in this array. 
//	If it does not exist, return the maximum number. The time complexity must be in O(n).
//		Input: [3, 2, 1]	Output: 1
//		Input: [1, 2]		Output: 2
//		Input: [2, 2, 3, 1]	Output: 1
//
//	Explanation: Note that the third maximum here means the third maximum distinct number.
//				 Both numbers with value 2 are both considered as second maximum.

public class ThirdMaximumNumber {
	
	public static int thirdMax(int[] nums) {
        
		Arrays.sort(nums);
		int max3 = nums[nums.length-1];
		
		int cnt = 0;
		if(nums.length > 2) {
			for(int i=nums.length-1; i>0; i--) {
				if(nums[i] != nums[i-1]) {
					cnt++;
				}
				
				if(cnt == 2) {
					return nums[i-1];
				}
			}
		}
		return max3;
		
		
//      다른 문풀
//		queue는 기본적으로 FIFO
//		* priorityQueue[우선순위 queue]는 comparator가 순서를 정하는 역할을 함
//		제거 : poll / remove  [queue가 비어 있을 경우, null / 예외발생]
//		읽기 : peek / element [queue가 비어 있을 경우, null / 예외발생]
//		* 우선순위 queue에선 값을 꺼낼 때, 가장 작은 값부터 꺼낼 수 있음
//		natural Ordering에 기초하고 있고, null을 허용하지 않음
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        Set<Integer> set = new HashSet<>();
//        
//        for(int n : nums) {
//            
//        	if(set.add(n)) {
//                pq.offer(n);
//                
//                if(pq.size() > 3 ) {
//                	pq.poll();
//                }
//            }
//        }
//        
//        if(pq.size() == 2) {
//        	pq.poll();
//        }
//        
//        return pq.peek();
		
    }
	
	public static void main(String[] args) {
		
//		int nums[] = {3, 2, 1};
//		int nums[] = {1, 2};
//		int nums[] = {2, 2, 3, 1};
		int nums[] = {4, 5, 1, 2, 2, 3, 1, 6};
		System.out.println(thirdMax(nums));
		
	}

}
