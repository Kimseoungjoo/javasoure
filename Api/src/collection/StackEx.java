package collection;

import java.util.Stack;

// Strack : LIFO(Last in First Out)
//        : ���İ�� (ex. ����), ���� ��ȣ �˻�, Undo, redo, **�� ������ �ڷ�/������

public class StackEx {
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		// data insert
		stack.push("���");
		stack.push("����");
		stack.push("�ٳ���");
		stack.push("��");
		
		// data output
		System.out.println(stack);
		while(!stack.empty()) {
			System.out.println(stack.pop());
			
		}
	}
}
