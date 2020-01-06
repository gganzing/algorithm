package programmers;

//	�빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�. 
//	s�� 'p'�� ������ 'y'�� ������ ���� ������ True, �ٸ��� False�� return �ϴ� solution�� �ϼ��ϼ���. 
//	'p', 'y' ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�. ��, ������ ���� �� �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�.
//	
//	���� ��� s�� pPoooyY�� true�� return�ϰ� Pyy��� false�� return�մϴ�.
//	
//	���ѻ���
//	���ڿ� s�� ���� : 50 ������ �ڿ���
//	���ڿ� s�� ���ĺ����θ� �̷���� �ֽ��ϴ�.

public class CountPY {

	static boolean solution(String s) {
		
        boolean answer = false;
        int cntP = 0;
        int cntY = 0;
        
        for(int i=0; i<s.length(); i++) {
        	char c = Character.toLowerCase(s.charAt(i));
        	if(c == 'p') {
        		cntP++;
        		
        	}else if(c == 'y') {
        		cntY++;
        	}
        }
        
        if(cntP == cntY) {
        	answer = true;
        }

        return answer;
        
//        �ٸ� ��Ǯ - ȿ���� ���� ������
//        s = s.toUpperCase();
//        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
        
    }
	
	public static void main(String[] args) {
		
//		String s = "pPoooyY";
		String s = "Pyy";
		System.out.println(solution(s));
		
	}
}
