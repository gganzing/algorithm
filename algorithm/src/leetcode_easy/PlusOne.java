package leetcode_easy;

// �����迭�� �ش��ڸ����� ����, �����迭 ��ü�� �ش� ������ ������ ���� �������� ��Ÿ��
// �ش� �������� +1�� �� ���� ���ڸ����� �ɰ��� �迭�� ��Ƽ� ���!
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
//					���� �� �־��൵ �� ��
//					������ 9999ó�� 9�θ� �̷���� �����϶���, �� ���̽��� �ش��
//					�ش� ������ �迭 ����� 0���� �ʱ�ȭ => ù��° �ڸ����� 1�� �־��ָ� ��

					return arr;
				}

			}

		}
		return digits;
		
//		�ٸ� ��� �ڵ�
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
//		�̷��� �ϸ�, int/ long�� ������ �ʰ��� ���ڴ� ǥ���� �ȵ�! 
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
