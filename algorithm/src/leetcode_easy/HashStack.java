package leetcode_easy;

// hashstack에 needle의 첫 값이 오는 인덱스 반환
// 없을 경우, -1 반환
// Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
// 
// Example 1:
// Input: haystack = "hello", needle = "ll"
// Output: 2
// 
// Example 2:
// Input: haystack = "aaaaa", needle = "bba"
// Output: -1

public class HashStack {

	public static int strStr(String haystack, String needle) {
        
		
		return haystack.indexOf(needle);
    }
	
	public static void main(String[] args) {
		
//		String haystack = "hello";
//		String needle = "ll";
		String haystack = "aaaaa";
//		String needle = "bba";
		String needle = "";
		
		System.out.println(strStr(haystack, needle));
		
	}
}
