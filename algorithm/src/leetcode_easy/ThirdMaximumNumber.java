package leetcode_easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

//	�迭�� ��� ��, �� ��°�� ū ���� ��ȯ
//	�ߺ� ���� �ϳ��� ���̸�, �� ��° ū ���� ���� ��� ���� ū ���� ��ȯ
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
		
		
//      �ٸ� ��Ǯ
//		queue�� �⺻������ FIFO
//		* priorityQueue[�켱���� queue]�� comparator�� ������ ���ϴ� ������ ��
//		���� : poll / remove  [queue�� ��� ���� ���, null / ���ܹ߻�]
//		�б� : peek / element [queue�� ��� ���� ���, null / ���ܹ߻�]
//		* �켱���� queue���� ���� ���� ��, ���� ���� ������ ���� �� ����
//		natural Ordering�� �����ϰ� �ְ�, null�� ������� ����
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
