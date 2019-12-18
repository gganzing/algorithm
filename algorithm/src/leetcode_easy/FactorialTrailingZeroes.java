package leetcode_easy;

//	�Է¹��� n�� n!�� ���� �����ϰ� �ִ� 0�� ������ ��ȯ
//	Given an integer n, return the number of trailing zeroes in n!.
//		Input: 3
//		Output: 0
//		Explanation: 3! = 6, no trailing zero.
//
//		Input: 5
//		Output: 1
//		Explanation: 5! = 120, one trailing zero.
//	Your solution should be in logarithmic time complexity.


public class FactorialTrailingZeroes {

	public static int trailingZeroes(int n) {
		
//		���ڸ��� 0�� �ǹ� => 10 = 2 * 5 ; 5�� ����� ������ ���ϱ�!
//		but, 5�� ����� �ȿ��� 25 = 5 * 5�� �ֵ��� ����(5�� ��������)
//		-> �̰��� ���ϱ� ���� 5�� ����� ������ �ٽ� 5�� ������ �� �̻� �������� ���ڰ� ���� ������ ���� ���� ��� ���� ���� ���� ����
//		ex) n = 100�̸�, temp = n/ 5 = 20
//		temp��� ���� �ᱹ 5�� ����� �����ε�, �̴� �Ʒ��� ����ó�� �ش� ���ڵ��� 5*1���� temp���� �̷���� ����
//		���� 5�� ����� ���ڸ� 5�� ���� ���ڴ� �� ���� 5�� ������ ã���� ����!
//		���̻� 5�� ������������ ���������� ��� ������ �� ������ ���� ���� ���� ��!
//		 5	5x1
//		10	5x2
//		15	5x3
//		20	5x4
//		25	5x5
//		30	5x6
//		35	5x7
//		40	5x8
//		45	5x9
//		50	5x10 = 5 x 2x5 -> 5�� �� �� ���� �ϴ� ��
//		55	5x11
//		60	5x12
//		65	5x13
//		70	5x14
//		75	5x15
//		80	5x16
//		85	5x17
//		90	5x18
//		95	5x19
//		100	5x20
		
		int count = 0;
		
        while (n != 0) {
            int tmp = n / 5;
            count += tmp;
            n = tmp;
        }
        
        return count;
        
        /*
        if(n < 5)
			return 0;
		else
			return (n / 5) + trailingZeroes(n / 5);
        */
        
//		int r = 0;
//		// ���� �� �ִ� ������ �ʰ��� ���� ��� ó���� ���ΰ�..
//		long mul = 1;
//		
//		for(int i=n; i>0; i--) {
//			mul *= i;
//		}
//		
//		String multi = mul+""; 
//		
//		while(multi.endsWith("0")) {
//			
//			multi = multi.substring(0, multi.length()-1);
//			r++;
//			
//		}
//		
//		return r;
		
    }
	
	public static void main(String[] args) {
		
		System.out.println(trailingZeroes(125));
		
	}
	
}
