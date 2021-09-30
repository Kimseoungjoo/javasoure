package test;

import java.util.Scanner;

//사용자한테 피 연산자 2개 입력받기
//연산자도 입력받기(+,-,/,%)
//switch 로 계산
public class SwitchMain5 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 :");
		int num1 = k.nextInt();
		
		System.out.print("숫자를 입력하세요 :");
		int num2 = k.nextInt();
		
		System.out.print("연산자를 넣어주세요(+,-,*,/,%) : ");
		String operator1 = k.next();
		
		double result = 0;
		
		switch (operator1) {
		case "+":
			result = num1+num2;
			//System.out.println(num1+operator1+num2+"의 계산 값은 : " + (num1 + num2));
			break;
		case "-":
			result = num1-num2;
			//System.out.println(num1+operator1+num2+"의 계산 값은 : " + (num1 - num2));
			break; 
		case "*":
			result = num1*num2;
			//System.out.println(num1+operator1+num2+"의 계산 값은 : " + (num1 * num2));
			break;
		case "/":
			result = (num1/(double)num2);
			//System.out.println(num1+operator1+num2+"의 계산 값은 : " + (num1 / (double) num2));
			break;

		default:
			result = num1%num2;
			//System.out.println(num1+operator1+num2+"의 계산 값은 : " + (num1 % num2));
			break;
		}
		System.out.printf("%d %s %d = %.1f\n",num1,operator1,num2,result);

		
		System.out.print("연산자를 넣어주세요 : ");
		char operator2 = k.next().charAt(0);//charAt(0) 인덱스를 0부터 불러서 찾는다.
		
		k.close();
		
		switch (operator2) {
		case '+':
			result = num1+num2;
			//System.out.println("계산 값은 : " + (num1 + num2));
			break;
		case '-':
			result = num1-num2;
			//System.out.println("계산 값은 : " + (num1 - num2));
			break;
		case '*':
			result = num1*num2;
			//System.out.println("계산 값은 : " + (num1 * num2));
			break;
		case '/':
			result = num1/(double)num2;
			//System.out.println("계산 값은 : " + (num1 / (double) num2));
			break;

		default:
			result = num1%num2;
			//System.out.println("계산 값은 : " + (num1 % num2));
			break;
		}

		System.out.printf("%d %s %d = %.1f",num1,operator1,num2,result);
	}
}
