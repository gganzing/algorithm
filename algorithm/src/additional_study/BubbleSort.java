package additional_study;

import java.util.Arrays;

// 버블정렬, 성능x

public class BubbleSort {

	public static int[] bubbleSort(int[] arr) {
		
		// 순차적으로 돌기 위한 반복문
		for(int i=0; i<arr.length-1; i++) {
			
			// 다 돌았을 경우 다시 처음부터 돌기 위한 반복문 
			// 항상 가장 큰 수가 맨 뒤에 채워지므로 마지막 인덱스 하나씩 줄여가면서 검사
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
