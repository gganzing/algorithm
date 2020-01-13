package programmers;

//	��ȭ��ȣ�ο� ���� ��ȭ��ȣ ��, �� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 �ִ��� Ȯ���Ϸ� �մϴ�.
//	��ȭ��ȣ�� ������ ���� ���, ������ ��ȭ��ȣ�� �������� ��ȭ��ȣ�� ���λ��Դϴ�.
//	
//	������ : 119
//	���ؿ� : 97 674 223
//	������ : 11 9552 4421
//	��ȭ��ȣ�ο� ���� ��ȭ��ȣ�� ���� �迭 phone_book �� solution �Լ��� �Ű������� �־��� ��, 
//	� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 ������ false�� �׷��� ������ true�� return �ϵ��� solution �Լ��� �ۼ����ּ���.
//	
//	���� ����
//	phone_book�� ���̴� 1 �̻� 1,000,000 �����Դϴ�.
//	�� ��ȭ��ȣ�� ���̴� 1 �̻� 20 �����Դϴ�.
//	����� ����
//	phone_book					return
//	[119, 97674223, 1195524421]	false
//	[123,456,789]				true
//	[12,123,1235,567,88]		false
//	�� ��ȣ�� �ٸ� ��ȣ�� ���λ��� ��찡 ������, ���� true�Դϴ�.
//	ù ��° ��ȭ��ȣ, ��12���� �� ��° ��ȭ��ȣ ��123���� ���λ��Դϴ�. ���� ���� false�Դϴ�.

public class PhoneBook {
	
	public static boolean solution(String[] phone_book) {
		
        boolean answer = true;
        
        for(int i=0; i<phone_book.length; i++) {
        	for(int j=0; j<phone_book.length; j++) {
        		
        		if(i == j) continue;
        		
        		if(phone_book[j].startsWith(phone_book[i])) {
        			return false;
        		}
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		
//		String []phone_book = {"119", "97674223", "1195524421"};
		String []phone_book = {"123","456","789"};
		System.out.println(solution(phone_book));
		
	}

}
