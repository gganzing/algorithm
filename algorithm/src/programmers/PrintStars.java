package programmers;

import java.util.Scanner;

//	���簢�� �����
//	�� �������� ǥ�� �Է����� �� ���� ���� n�� m�� �־����ϴ�.
//	��(*) ���ڸ� �̿��� ������ ���̰� n, ������ ���̰� m�� ���簢�� ���¸� ����غ�����.

public class PrintStars {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int j=0; j<b; j++) {
        	String n = "";
	        for(int i=0; i<a; i++) {
	        	n += "*";
	        }
	        System.out.println(n);
        }
        
        System.out.println(a + b);
    }
	
}
