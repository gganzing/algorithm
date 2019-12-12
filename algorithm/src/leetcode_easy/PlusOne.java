package leetcode_easy;

// 정수배열은 해당자리수의 숫자, 정수배열 전체를 해당 순서로 나열한 값이 정수값을 나타냄
// 해당 정수값에 +1을 한 수를 한자리수씩 쪼개어 배열에 담아서 출력!
// Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
// The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
// You may assume the integer does not contain any leading zero, except the number 0 itself.

import java.util.Arrays;

public class PlusOne {

	public static int[] plusOne(int[] digits) {

		for (int i = digits.length - 1; i >= 0; i--) {

			if (digits[i] < 9) {
				digits[i] += 1;

				return digits;

			} else {
				digits[i] = 0;

				if (i == 0) {
					int[] arr = new int[digits.length + 1];

					arr[0] = 1;

//					for(int j=1; j<digits.length; j++) {
//						arr[j] = digits[j-1];
//					}
//					굳이 안 넣어줘도 될 듯
//					어차피 9999처럼 9로만 이루어진 숫자일때만, 이 케이스에 해당됨
//					해당 길이의 배열 선언시 0으로 초기화 => 첫번째 자리수만 1로 넣어주면 됨

					return arr;
				}

			}

		}
		return digits;
		
//		다른 사람 코드
//		int n = digits.length;
//		for (int i = n - 1; i >= 0; i--) {
//			if (digits[i] < 9) {
//				digits[i]++;
//				return digits;
//			}
//
//			digits[i] = 0;
//		}
//
//		int[] newNumber = new int[n + 1];
//		newNumber[0] = 1;
//
//		return newNumber;
		

//		String str = "";
//		for(int d : digits) {
//			str += d+"";
//		}
//		
//		int num = Integer.parseInt(str)+1;
//		str = num+"";
//		
//		int arr[] = new int[str.length()];
//		for(int i=0; i<str.length(); i++) {
//			arr[i] = Integer.parseInt(str.charAt(i)+"");
//		}
//		 
//		return arr;
//		이렇게 하면, int/ long의 범위를 초과한 숫자는 표현이 안됨! 
	}

	public static void main(String[] args) {

//		int[] digits = {1,2,3};
//		int[] digits = {4,3,2,1};
//		int[] digits = {9,8,7,6,5,4,3,2,1,0};
//		int[] digits = {9};
		int[] digits = { 9, 9 };

		System.out.println(Arrays.toString(plusOne(digits)));
	}
}
