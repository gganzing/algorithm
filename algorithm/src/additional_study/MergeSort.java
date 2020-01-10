package additional_study;

import java.util.Arrays;

//	���� ���� �ڹٷ� ����

public class MergeSort {

	public static int[] mergeSort(int[] arr) {
		
		int[] temp = new int[arr.length];
		mergeSort(arr, temp, 0, arr.length-1);
		
		return arr;
	}
	
	public static void mergeSort(int[] arr, int[] temp, int start, int end) {
		
		// �迭 ���� ũ�Ⱑ 2�̻� �� ������ ��� ������ 
		if(start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, temp, start, mid);
			mergeSort(arr, temp, mid + 1, end);
			merge(arr, temp, start, mid, end);
		}
	}
	
	public static void merge(int[] arr, int[] temp, int start, int mid, int end) {
		
		for(int i=start; i<=end; i++) {
			temp[i] = arr[i];
		}
		
		int left = start;
		int right = mid + 1;
		int idx = start;
		
		// ������ �� �迭�� ��� �� ���� ������ ������ ������ �ݺ�
		while(left <= mid && right <= end) {
			if(temp[left] <= temp[right]) {
				arr[idx] = temp[left];
				left++;
				
			}else {
				arr[idx] = temp[right];
				right++;
			}
			idx++;
		}
		
		// �� �� �����Ͱ� �������� ���� �迭�� �� ������ �Ű���
		// �� �� �������� ��� ���� ū ���� �ڿ� ���� �ִ� ���ϱ�
		for(int i=0; i<= mid-left; i++) {
			arr[idx+i] = temp[left+i];
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {5, 2, 4, 7, 6, 1, 3, 8};
		System.out.println(Arrays.toString(mergeSort(arr)));
	}
	
}
