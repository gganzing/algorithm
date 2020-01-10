package additional_study;

import java.util.Arrays;

//	병합 정렬 자바로 구현

public class MergeSort {

	public static int[] mergeSort(int[] arr) {
		
		int[] temp = new int[arr.length];
		mergeSort(arr, temp, 0, arr.length-1);
		
		return arr;
	}
	
	public static void mergeSort(int[] arr, int[] temp, int start, int end) {
		
		// 배열 방의 크기가 2이상 일 때까지 계속 나눠줌 
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
		
		// 나눠진 두 배열의 어느 한 쪽이 끝까지 도달할 때까지 반복
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
		
		// 앞 쪽 데이터가 남아있을 때만 배열의 뒤 쪽으로 옮겨줌
		// 뒤 쪽 데이터의 경우 원래 큰 수가 뒤에 남아 있는 경우니깐
		for(int i=0; i<= mid-left; i++) {
			arr[idx+i] = temp[left+i];
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {5, 2, 4, 7, 6, 1, 3, 8};
		System.out.println(Arrays.toString(mergeSort(arr)));
	}
	
}
