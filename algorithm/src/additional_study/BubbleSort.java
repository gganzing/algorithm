package additional_study;

import java.util.Arrays;

// ��������, ����x

public class BubbleSort {

	public static int[] bubbleSort(int[] arr) {
		
		// ���������� ���� ���� �ݺ���
		for(int i=0; i<arr.length-1; i++) {
			
			// �� ������ ��� �ٽ� ó������ ���� ���� �ݺ��� 
			// �׻� ���� ū ���� �� �ڿ� ä�����Ƿ� ������ �ε��� �ϳ��� �ٿ����鼭 �˻�
			for(int j=0; j<arr.length-1-i; j++) {
				int temp = 0;
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {5,1,7,4,6,3,2,8};
		System.out.println(Arrays.toString(bubbleSort(arr)));
		
	}
	
}
