package leetcode_easy;

//Given a 32-bit signed integer, reverse digits of an integer.
//Example 1)
//Input: 123
//Output: 321
//Example 2)
//Input: -123
//Output: -321
//Example 3)
//Input: 120
//Output: 21

public class ReverseInteger {

//	public static int reverse(int x) {
//		long res = 0;
//		while (x != 0) {
//			res *= 10;
//			res += x % 10;
//			x /= 10;
//		}
//		return (int) res == res ? (int) res : 0;
//	}

	/*
	 * public static int reverse(int x) { String reversed = new
	 * StringBuilder().append(Math.abs(x)).reverse().toString(); try { return (x <
	 * 0) ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
	 * 
	 * } catch (NumberFormatException e) { return 0; } }
	 */

	public static int reverse(int x) {

		int r = 0;

		String str = Math.abs(x) + "";
		String re = "";

		if (str.charAt(str.length() - 1) == '0') {
			str = str.substring(0, str.length() - 1);
		}

		for (int i = str.length() - 1; i >= 0; i--) {
			re += str.charAt(i);
		}

		try {
			r = Integer.parseInt(re);
		} catch (NumberFormatException e) {
			return 0;
		}

		r = (x < 0) ? r *= -1 : r;

		return r;
	}

	public static void main(String[] args) {
		System.out.println(reverse(-2101));
	}

}
