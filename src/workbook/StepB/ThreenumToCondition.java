package workbook.StepB;

import java.util.Scanner;

public class ThreenumToCondition {
	//initialize
	private int num1, num2, num3; 
	
	//constructor
	public ThreenumToCondition() { input();}
	private void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요. ");
		num1 = s.nextInt();
		System.out.print("두번째 숫자를 입력하세요. ");
		num2 = s.nextInt();
		System.out.print("세번째 숫자를 입력하세요. ");
		num3 = s.nextInt();
	}
	
	//print condition satisfied
	public void printCondition() {
		getConditions();
	}
	
	private void getConditions(){
		printCondition1();
		printCondition2();
		printCoditionn3();
		printCondition4();
	}
	//get condition 1, 2, 3, 4
	private void printCondition4() {
		int count = 0;
		if(num2%num1==0 || num3%num1==0) count++;
		else if(num1%num2==0 || num3%num2==0) count++;
		else if(num1%num3==0 || num2%num3==0) count++;
		
		if(count==1) System.out.println("4번 조건 만족 : 3개의 숫자 중 어떤 하나의 수로 다른 두 수를 나누면 나누어떨어지는 경우가 있다.");
	}
	
	private void printCoditionn3() {
		int count = 0;	
		if(num1+num2==num3) count++;
		else if(num1+num3==num2) count++;
		else if(num2+num3 == num1) count++;
		
		if(count==1) System.out.println("3번 조건 만족 : 3개의 숫자 중 어떤 두 수의 합이 나머지 하나의 숫자와 같다.");
	}
	
	private void printCondition2() {
		int count = 0;
		if(num1 > 50) count++;
		if(num2 > 50) count++;
		if(num3 > 50) count++;
		
		if(count>=2) System.out.println("2번 조건 만족 : 3개의 숫자 중 적어도 두 수의 크기가 모두 50보다 크다.");
	}
	
	private void printCondition1() {
		int count = 0;
		if(num1==num2) count++;
		else if(num1==num3) count++;
		else if(num2==num3) count++;
		
		if(count==1) System.out.println("1번 조건 만족 : 3개의 숫자 중 적어도 두 수의 값이 같다.");
	}

}