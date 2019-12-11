package leetcode_easy;

/*
 * 공통의 접두사 찾기/ 없을 경우 "" 반환
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 */

public class CommonPrefix {

	public static String longestCommonPrefix(String[] strs) {

		if (strs.length == 0) {
			return "";
		}

		String prefix = strs[0];

		for (int i = 1; i < strs.length; i++) {
			
			while (strs[i].indexOf(prefix) != 0) {
				
 				prefix = prefix.substring(0, prefix.length() - 1);
				
				if (prefix.isEmpty()) {
					return "";
				}
			}
		}
		return prefix;

//   		String str = "";
//   		try {
//   			String c = strs[0].charAt(0)+"";
//		
//			for (int j = 0; j < strs[0].length(); j++) {
//
//				int count = 0;
//
//				for (int i = 0; i < strs.length; i++) {
//
//					if (strs[i].startsWith(c)) {
//						count++;
//
//					} else {
//						return str;
//					}
//
//				}
//
//				if (count == strs.length) {
//					str += strs[0].charAt(j);
//					
//					if(j+1 < strs[0].length()) {
//						c += strs[0].charAt(j+1);
//					}
//				}
//			}
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//		return str;
	}

	public static void main(String[] args) {

//		String arr[] = { "aa", "ab" };
//		String arr[] = { "a", "a" };
//		String arr[] = { "c", "acc", "ccc" };
		String arr[] = { "flower", "flow", "flight" };
//		String arr[] = { "flower"};
//		String arr[] = {"dog","racecar","car"};

		System.out.println(longestCommonPrefix(arr));

	}

}
