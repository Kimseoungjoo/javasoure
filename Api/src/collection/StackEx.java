package collection;

import java.util.Stack;

// Strack : LIFO(Last in First Out)
//        : 수식계산 (ex. 계산기), 수식 괄호 검사, Undo, redo, **웹 브라우저 뒤로/앞으로

public class StackEx {
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		// data insert
		stack.push("사과");
		stack.push("딸기");
		stack.push("바나나");
		stack.push("감");
		
		// data output
		System.out.println(stack);
		while(!stack.empty()) {
			System.out.println(stack.pop());
			
		}
	}
}
