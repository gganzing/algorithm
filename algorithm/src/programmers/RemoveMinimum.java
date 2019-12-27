package programmers;

import java.util.ArrayList;
import java.util.Arrays;

//	������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���. 
//	��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. 
//	������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, [10]�� [-1]�� ���� �մϴ�.
//	* ���� ����
//	arr�� ���� 1 �̻��� �迭�Դϴ�.
//	�ε��� i, j�� ���� i �� j�̸� arr[i] �� arr[j] �Դϴ�. => �迭 �� ��ҵ��� ��� �ٸ� ���

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
		
		
//		�ٸ� ��Ǯ
//		if (arr.length == 1) {
//            arr[0] = -1;
//            return arr;
//        } else {
//            ArrayList<Integer> arrayList = new ArrayList<Integer>();
//            for (int a : arr) {
//                arrayList.add(a);
//            }
//		
//			  //Collections.min(arrayList)���� �ּҰ� ã�� ����, Collections.max �ִ밪
//            Integer minimum = Collections.min(arrayList);
//            arrayList.remove(minimum);
//            int[] resultArray = new int[arr.length - 1];
//            for (int i = 0; i < arrayList.size(); ++i) {
//                resultArray[i] = arrayList.get(i);
//            }
//            return resultArray;
//        }
		
		
//		�ٸ� ��Ǯ2 : stream���
//		// Collections���� ��ü ����.��Ʈ������().�߰�����().��������();
//		if (arr.length <= 1) {
//			
//			return new int[] { -1 };
//		}
//		// Arrays.stream(arr) �迭�� ��Ʈ�� ����, ArrayList.stream() ����Ʈ�� ��Ʈ�� ����
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
