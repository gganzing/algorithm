package additional_study;

import java.util.Arrays;

//	퀵정렬

public class QuickSort {
	
	
	public static int partition(int[] arr, int start, int end) {
		
		// 중간 값을 기준 값으로 지정 
		int pivot = arr[(start + end)/2];
		while(start <= end) {
			
			// 기준 값 보다 시작 값이 작으면, 그 자리에 둠[기준보다 앞에 위치]
			// 시작 포인트 계속 뒤로 감  '기준 보다 앞 쪽에 기준 값 보다 큰 값이 나올 때까지'  
			while(arr[start] < pivot) {
				start++;
			}
			
			// 기준 값 보다 끝 값이 크면, 그 자리에 둠[기준보다 뒤에 위치]
			// 끝 포인트 계속 앞으로 감  '기준 보다 뒷 쪽에 기준 값 보다 작은 값이 나올 때까지'
			while(arr[end] > pivot) {
				end--;
			}
			
			// 두 값의 위치를 바꿔줌
			if(start <= end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
		// 새로 나눌 배열방의 첫 번째 인덱스 값[가운데 인덱스 - 기준의 위치]
		return start;
	}

	public static int[] quickSort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
		
		return arr;
	}
	
	public static void quickSort(int[] arr, int start, int end) {
		int right = partition(arr, start, end);
		
		if(start < right-1) { 
			// 왼쪽 partition의 배열방이 1개 이상일 경우에만 정렬 필요하니깐
			// 한 개만 남은 경우 더이상 확인 필요 없음
			
			quickSort(arr, start, right-1);
			// 오른쪽 partition의 시작점보다 하나 작은 곳까지
		}
		
		if(right < end) {
			// 오른쪽 partition의 배열방이 마지막 배열방보다 작은 경우에만
			quickSort(arr, right, end);
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {4,1,7,6,3,8,2,5};
		System.out.println(Arrays.toString(quickSort(arr)));
		
	}
	
}
