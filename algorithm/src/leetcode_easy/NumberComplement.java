package leetcode_easy;

import java.util.ArrayList;

//	2진수 보수 구하기
//	Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
//	The given integer is guaranteed to fit within the range of a 32-bit signed integer.
//	You could assume no leading zero bit in the integer’s binary representation.
//	Input: 5 / Output: 2
//	Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
//	Input: 1 / Output: 0
//	Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.

public class NumberComplement {
	
	public static int findComplement(int num) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(num > 0) {
			list.add(num % 2);
			
			if(num / 2 == 1) {
				list.add(num / 2);
				break;
			}
			num = num / 2;
		}

		for(int i=0; i<list.size(); i++) {
			if(list.get(i) == 0) {
				list.remove(i);
				list.add(i, 1);
				
			}else {
				list.remove(i);
				list.add(i, 0);
			}
		}
		
		
		int r = 0;
		for(int j=0; j<list.size(); j++) {
			if(list.get(j) == 1) {
				r += Math.pow(2, j);
			}
		}
        
		return r;
		
		
//		다른 문풀
//		만약, num = 5 => 101 = 2^2 + 2^0
//		num의 보수 = 2 => 010 = 2^1
//		num의 보수 => (2^2 + 2^1 + 2^0) - (2^2 + 2^0)[num] = 2^1 [2]	
//		
//		int i = 0;
//        int j = 0;
//        
//        while (i < num){
//            i += Math.pow(2, j);
//            j++;
//        }
//        
//        return i - num;
		
    }
	
	public static void main(String[] args) {
		
		int num = 5;
//		int num = 1;
		System.out.println(findComplement(num));
		
	}

}
