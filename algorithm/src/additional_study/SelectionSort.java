package additional_study;

import java.util.Arrays;

//	��������

public class SelectionSort {
	
	public static int[] selectionSort(int[] arr) {
		
		// ���� �ε������� �����ؼ�
		// �ּҰ��� ã�� �� ������ ����
		for(int i=0; i<arr.length-1; i++) {
			int min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {5,1,4,7,2,6,8,3};
		System.out.println(Arrays.toString(selectionSort(arr)));
		
	}
	
}
