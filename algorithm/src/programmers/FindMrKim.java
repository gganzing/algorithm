package programmers;

//	String�� �迭 seoul�� element�� Kim�� ��ġ x�� ã��, �輭���� x�� �ִٴ� String�� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���. 
//	seoul�� Kim�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.
//	
//	* ���� ����
//	seoul�� ���� 1 �̻�, 1000 ������ �迭�Դϴ�.
//	seoul�� ���Ҵ� ���� 1 �̻�, 20 ������ ���ڿ��Դϴ�.
//	Kim�� �ݵ�� seoul �ȿ� ���ԵǾ� �ֽ��ϴ�.
//	ex. [Jane, Kim]	�輭���� 1�� �ִ�

public class FindMrKim {

	public static String solution(String[] seoul) {
		
		String answer = "";
		int i = 0;
		for(; i<seoul.length; i++) {
			// Ȥ�� �׳� .equlas("Kim")
			if(seoul[i].toLowerCase().indexOf("kim") != -1) {
				
				break;
			}
		}
		
		answer = "�輭���� " + i + "�� �ִ�!";
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		String seoul[] = {"Jane", "Kim"};
		System.out.println(solution(seoul));
		
	}
	
}
