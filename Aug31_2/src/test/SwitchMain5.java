package test;

import java.util.Scanner;

//��������� �� ������ 2�� �Է¹ޱ�
//�����ڵ� �Է¹ޱ�(+,-,/,%)
//switch �� ���
public class SwitchMain5 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� :");
		int num1 = k.nextInt();
		
		System.out.print("���ڸ� �Է��ϼ��� :");
		int num2 = k.nextInt();
		
		System.out.print("�����ڸ� �־��ּ���(+,-,*,/,%) : ");
		String operator1 = k.next();
		
		double result = 0;
		
		switch (operator1) {
		case "+":
			result = num1+num2;
			//System.out.println(num1+operator1+num2+"�� ��� ���� : " + (num1 + num2));
			break;
		case "-":
			result = num1-num2;
			//System.out.println(num1+operator1+num2+"�� ��� ���� : " + (num1 - num2));
			break; 
		case "*":
			result = num1*num2;
			//System.out.println(num1+operator1+num2+"�� ��� ���� : " + (num1 * num2));
			break;
		case "/":
			result = (num1/(double)num2);
			//System.out.println(num1+operator1+num2+"�� ��� ���� : " + (num1 / (double) num2));
			break;

		default:
			result = num1%num2;
			//System.out.println(num1+operator1+num2+"�� ��� ���� : " + (num1 % num2));
			break;
		}
		System.out.printf("%d %s %d = %.1f\n",num1,operator1,num2,result);

		
		System.out.print("�����ڸ� �־��ּ��� : ");
		char operator2 = k.next().charAt(0);//charAt(0) �ε����� 0���� �ҷ��� ã�´�.
		
		k.close();
		
		switch (operator2) {
		case '+':
			result = num1+num2;
			//System.out.println("��� ���� : " + (num1 + num2));
			break;
		case '-':
			result = num1-num2;
			//System.out.println("��� ���� : " + (num1 - num2));
			break;
		case '*':
			result = num1*num2;
			//System.out.println("��� ���� : " + (num1 * num2));
			break;
		case '/':
			result = num1/(double)num2;
			//System.out.println("��� ���� : " + (num1 / (double) num2));
			break;

		default:
			result = num1%num2;
			//System.out.println("��� ���� : " + (num1 % num2));
			break;
		}

		System.out.printf("%d %s %d = %.1f",num1,operator1,num2,result);
	}
}
