package leetcode_easy;

//	�Ű������� ���� ���� ���� �Ϻ��� ������ ���� �Ǵ�
//	�⺻ ���̺귯�� �����Լ� ��� ����
//	Given a positive integer num, write a function which returns True if num is a perfect square else False.
//	Note: Do not use any built-in library function such as sqrt.

public class ValidPerfectSquare {
	
	public static boolean isPerfectSquare(int num) {
		
//		�������� ��Ģ : 1+3+5+7+9+...
//		1*1 = 1
//		2*2 = 1+3 => ���� �������� �� 2�� ����
//		3*3 = 1+3+5
//		4*4 = 1+3+5+7
//		5*5 = 1+3+5+7+9
//		6*6 = 1+3+5+7+9+11
//		...
		
		
//		int i = 1;
//		while (num > 0) {
//			num -= i;
//			i += 2;
//		}
//		return num == 0;	
		
		
//		�ٸ� ��Ǯ
		// ������ �̷�� ���� ���� �ּ� ����, �ִ� ���� 
		long l = 1, r = num;
        while(l < r){
		  // ���� ���� ���� �ּ� ���� ���� �ִ� ������ �Ѱ� �Ǹ�, ���� �ȿ��� ���� ������ �ʾҴٴ� �ǹ��̹Ƿ� ����Ż��
            long mid = (l + r) / 2; 
            // l < mid < r => ���� ������ �߰� ���� �˱� ����
            if(mid * mid == num){
                return true;
		
            }else if(mid * mid > num){
				// �߰� ���� ���� ���� num���� ũ��, ������ �̷�� ���� ���� �ִ� ������ �ٿ���
                r = mid - 1;
		
            }else{
				// �߰� ���� ���� ���� num���� ������, ������ �̷�� ���� ���� �ּ� ������ Ű����
                l = mid + 1;
            }
        }
        return l * l == num;
		
		
//		Time Limit Exceeded
//		�������� 1�ڸ��� ���ڴ�  0, 1, 4, 5, 6, 9
//		switch(num) {
//		case 2: case 3: case 7: case 8: return false;
//		}
//        
//		for(int i=1; i<=num; i++) {
//			
//			if(i * i == num) {
//				
//				return true;
//			}
//		}
//		return false;
    }
	
	public static void main(String[] args) {
		
//		int num = 216;
		int num = 104976;
//		int num = 14;
//		int num = 1;
		
		System.out.println(isPerfectSquare(num));
		
	}

}
