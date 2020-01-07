package additional_study;

import java.util.Arrays;

//	삽입 정렬
//	적은 개수일 때 효과적, 이미 정렬되어있는 배열에 새로운 요소를 삽일 할 경우 유용

public class InsertionSort {

	public static int[] insertionSort(int[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			
			int j = 0;
			
			// 1번 인덱스부터 차례로 숫자 선택
			int temp = arr[i]; 
			
			// 선택한 숫자를 이미 정렬 된 숫자와 비교하며 넣을 위치 지정
			// 선택된 숫자가 정렬 된 숫자보다 작으면
			for(j = i-1; j>=0 && temp < arr[j]; j--) {
				// 한 칸씩 뒤로 밀어냄
				arr[j+1] = arr[j];
			}
			// 마지막 빈 칸에 선택한 숫자를 넣어줌
			arr[j+1] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {5, 6, 1, 2, 4, 3};
		System.out.println(Arrays.toString(insertionSort(arr)));
		
	}
	
}
