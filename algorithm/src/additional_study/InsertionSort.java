package additional_study;

import java.util.Arrays;

//	���� ����
//	���� ������ �� ȿ����, �̹� ���ĵǾ��ִ� �迭�� ���ο� ��Ҹ� ���� �� ��� ����

public class InsertionSort {

	public static int[] insertionSort(int[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			
			int j = 0;
			
			// 1�� �ε������� ���ʷ� ���� ����
			int temp = arr[i]; 
			
			// ������ ���ڸ� �̹� ���� �� ���ڿ� ���ϸ� ���� ��ġ ����
			// ���õ� ���ڰ� ���� �� ���ں��� ������
			for(j = i-1; j>=0 && temp < arr[j]; j--) {
				// �� ĭ�� �ڷ� �о
				arr[j+1] = arr[j];
			}
			// ������ �� ĭ�� ������ ���ڸ� �־���
			arr[j+1] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {5, 6, 1, 2, 4, 3};
		System.out.println(Arrays.toString(insertionSort(arr)));
		
	}
	
}
