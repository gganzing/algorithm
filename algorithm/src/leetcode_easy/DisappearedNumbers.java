package leetcode_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//	배열 속 누락 된 숫자 찾기, 여분의 공간을 남기지 않고 풀기
//	Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
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
		
		
//		다른 문풀
//		인덱스 번호는 0부터 length-1까지
//		배열 안 요소의 값들은 1부터[0번째 인덱스] 배열.length[length-1번째 인덱스]까지
//		배열의 인덱스 번호를 이용해서, 배열 안의 이미 있는 요소의 값을 해당 인덱스안의 요소를 음수로 만들어 구분
//		배열안 요소의 값이 음수가 아닌 값을 가지고 있는 배열이라면, 해당 값이 누락된 것을 알 수 있음
//		따라서 해당 인덱스번호+1의 값을 리스트에 추가하고 반환
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
		
//		위 코드랑 같은 논리인데, 구분하는 방법을 +length값으로 한 문풀
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
