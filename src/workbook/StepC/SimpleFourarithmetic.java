package workbook.StepC;

import java.util.Scanner;

public class SimpleFourarithmetic {
	//initialize
	private int num1, num2;
	private String operator;
	private int result;
	
	//constructor
	public SimpleFourarithmetic(){input();}
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("����1 �� �Է��ϼ���.");
		num1 = s.nextInt();
		System.out.print("����2 �� �Է��ϼ���.");
		num2 = s.nextInt();
		System.out.print("�����ȣ����('+','-','*','/' �� 1��)�� �Է��ϼ���, ");
		operator = s.next();
	}
	
	//print result
	public void printResult() {
		result = getResult();
		System.out.printf("������ ��� ���� %d�Դϴ�.\n", result);
	}
	
	private int getResult() {
		if(operator.equals("+")) add();
		else if(operator.equals("-")) sub();
		else if(operator.equals("*")) mul();
		else if(operator.equals("/")) div();
		//else result="�߸� �Է��ϼ̽��ϴ�.";
		
		return result;
	}
	private void div() {
		result = num1/num2;
	}
	private void mul() {
		result = num1*num2;
	}
	private void sub() {
		result = num1-num2;
	}
	private void add() {
		result = num1+num2;
	}
}
