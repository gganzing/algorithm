package programmers;

import java.util.ArrayList;
import java.util.Arrays;

//	정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
//	단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
//	예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
//	* 제한 조건
//	arr은 길이 1 이상인 배열입니다.
//	인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다. => 배열 안 요소들은 모두 다른 요소

public class RemoveMinimum {
	
	public static int[] solution(int[] arr) {

		if(arr.length == 1) {
			
			arr[0] = -1;
			
			return arr;
		}
		
		int[] answer = new int[arr.length-1];
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		int k = 0;
		for(int j=0; j<arr.length; j++) {
			if(arr[j] != min) {
				answer[k++] = arr[j];
			}
		}

		return answer;
		
		
//		다른 문풀
//		if (arr.length == 1) {
//            arr[0] = -1;
//            return arr;
//        } else {
//            ArrayList<Integer> arrayList = new ArrayList<Integer>();
//            for (int a : arr) {
//                arrayList.add(a);
//            }
//		
//			  //Collections.min(arrayList)으로 최소값 찾기 가능, Collections.max 최대값
//            Integer minimum = Collections.min(arrayList);
//            arrayList.remove(minimum);
//            int[] resultArray = new int[arr.length - 1];
//            for (int i = 0; i < arrayList.size(); ++i) {
//                resultArray[i] = arrayList.get(i);
//            }
//            return resultArray;
//        }
		
		
//		다른 문풀2 : stream사용
//		// Collections같은 객체 집합.스트림생성().중개연산().최종연산();
//		if (arr.length <= 1) {
//			
//			return new int[] { -1 };
//		}
//		// Arrays.stream(arr) 배열로 스트림 생성, ArrayList.stream() 리스트로 스트림 생성
//		int min = Arrays.stream(arr).min().getAsInt();
//		
//		return Arrays.stream(arr).filter(i -> i != min).toArray();
		
	}
	
	public static void main(String[] args) {
		
//		int[] arr = {4,3,2,1};
		int[] arr = {10};
		System.out.println(Arrays.toString(solution(arr)));
		
	}

}
