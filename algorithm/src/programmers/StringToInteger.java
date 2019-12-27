package programmers;

//	���ڿ��� ������ ��ȯ

public class StringToInteger {

	public static int solution(String str) {
		
//		return Integer.parseInt(str);
		
//		�ٸ� ��Ǯ : Integer.parseInt �ɰ� ����
		boolean sign = true;
		int result = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '-') {
				//sign�� ���, ������ �Ǻ��ϱ� ����
				sign = false;
			
			// '-'��ȣ�� result���� ����Ǿ� ���Ե��� �ʰ� �ϱ� ����
			}else if (ch != '-') {
				// �ƽ�Ű�ڵ� '0' = 48 ~ '9' = 57
				// result�� �����Ͽ� �ݺ����� ���鼭 10�� ��������, ���������� �ڽ��� �ڸ�����ŭ ������
				result = result * 10 + (ch - '0');
			}
		}
		
		return sign ? result : -1 * result;
	}
	
	public static void main(String[] args) {
		
		String str = "-139892324";
		System.out.println(solution(str));
		
	}
}
