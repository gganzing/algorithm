package leetcode_easy;

import java.util.HashMap;
import java.util.Stack;

// �ٸ� ����� ����Ǯ��
class Solution {
	
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}
	
	/*private HashMap<Character, Character> mappings;

	// �ʱ�ȭ �۾�
	public Solution() {
		this.mappings = new HashMap<Character, Character>();
		this.mappings.put('(', ')');
		this.mappings.put('{', '}');
		this.mappings.put('[', ']');
	}

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();

		// �Է��� ������� ������ ���ؼ� �Ųٷ� ���ÿ� �ֱ� ����
		for (int i = s.length() - 1; i >= 0; i--) {
			// �ؽ��ʿ� ���ԵǾ��ִ��� ���ϱ����� char�� ����.
			char c = s.charAt(i);

			// �ؽ��� mappins�� Ű�� c��( (,{,[ ) ���Ե��ִٸ�
			if (this.mappings.containsKey(c)) {
				// top �� ��������� '#' ���� ����, �ƴϸ� stack���� ���� ������ ����
				char top = stack.empty() ? '#' : stack.pop();

				// top�� ���� mappins���� ���� c�� ���� �ʴٸ� false
				if (top != this.mappings.get(c)) {
					return false;
				}
			}
			// �ؽ��� mappings�� c �� ���ԵǾ��ִٸ�
			else {
				// stack�� ����
				stack.push(c);
			}
		}

		// ���� ���ÿ� ���� �����ִٸ� false
		return stack.isEmpty();
	}*/
}

public class VaildParentheses_other {
	
	public static void main(String[] args) {
		
		Solution s = new Solution();
		System.out.println(s.isValid("{}[]()"));
		
	}

}
