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
		System.out.print("숫자1 을 입력하세요.");
		num1 = s.nextInt();
		System.out.print("숫자2 을 입력하세요.");
		num2 = s.nextInt();
		System.out.print("연산기호문자('+','-','*','/' 중 1개)를 입력하세요, ");
		operator = s.next();
	}
	
	//print result
	public void printResult() {
		result = getResult();
		System.out.printf("계산식의 결과 값은 %d입니다.\n", result);
	}
	
	private int getResult() {
		if(operator.equals("+")) add();
		else if(operator.equals("-")) sub();
		else if(operator.equals("*")) mul();
		else if(operator.equals("/")) div();
		//else result="잘못 입력하셨습니다.";
		
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
