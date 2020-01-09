package additional_study;

import java.util.Arrays;

//	������

public class QuickSort {
	
	
	public static int partition(int[] arr, int start, int end) {
		
		// �߰� ���� ���� ������ ���� 
		int pivot = arr[(start + end)/2];
		while(start <= end) {
			
			// ���� �� ���� ���� ���� ������, �� �ڸ��� ��[���غ��� �տ� ��ġ]
			// ���� ����Ʈ ��� �ڷ� ��  '���� ���� �� �ʿ� ���� �� ���� ū ���� ���� ������'  
			while(arr[start] < pivot) {
				start++;
			}
			
			// ���� �� ���� �� ���� ũ��, �� �ڸ��� ��[���غ��� �ڿ� ��ġ]
			// �� ����Ʈ ��� ������ ��  '���� ���� �� �ʿ� ���� �� ���� ���� ���� ���� ������'
			while(arr[end] > pivot) {
				end--;
			}
			
			// �� ���� ��ġ�� �ٲ���
			if(start <= end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
		// ���� ���� �迭���� ù ��° �ε��� ��[��� �ε��� - ������ ��ġ]
		return start;
	}

	public static int[] quickSort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
		
		return arr;
	}
	
	public static void quickSort(int[] arr, int start, int end) {
		int right = partition(arr, start, end);
		
		if(start < right-1) { 
			// ���� partition�� �迭���� 1�� �̻��� ��쿡�� ���� �ʿ��ϴϱ�
			// �� ���� ���� ��� ���̻� Ȯ�� �ʿ� ����
			
			quickSort(arr, start, right-1);
			// ������ partition�� ���������� �ϳ� ���� ������
		}
		
		if(right < end) {
			// ������ partition�� �迭���� ������ �迭�溸�� ���� ��쿡��
			quickSort(arr, right, end);
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {4,1,7,6,3,8,2,5};
		System.out.println(Arrays.toString(quickSort(arr)));
		
	}
	
}
