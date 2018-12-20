package workbook.StepB;

import java.util.Scanner;

public class ThreenumToCondition {
	//initialize
	private int num1, num2, num3; 
	
	//constructor
	public ThreenumToCondition() { input();}
	private void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("ù��° ���ڸ� �Է��ϼ���. ");
		num1 = s.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���. ");
		num2 = s.nextInt();
		System.out.print("����° ���ڸ� �Է��ϼ���. ");
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
		
		if(count==1) System.out.println("4�� ���� ���� : 3���� ���� �� � �ϳ��� ���� �ٸ� �� ���� ������ ����������� ��찡 �ִ�.");
	}
	
	private void printCoditionn3() {
		int count = 0;	
		if(num1+num2==num3) count++;
		else if(num1+num3==num2) count++;
		else if(num2+num3 == num1) count++;
		
		if(count==1) System.out.println("3�� ���� ���� : 3���� ���� �� � �� ���� ���� ������ �ϳ��� ���ڿ� ����.");
	}
	
	private void printCondition2() {
		int count = 0;
		if(num1 > 50) count++;
		if(num2 > 50) count++;
		if(num3 > 50) count++;
		
		if(count>=2) System.out.println("2�� ���� ���� : 3���� ���� �� ��� �� ���� ũ�Ⱑ ��� 50���� ũ��.");
	}
	
	private void printCondition1() {
		int count = 0;
		if(num1==num2) count++;
		else if(num1==num3) count++;
		else if(num2==num3) count++;
		
		if(count==1) System.out.println("1�� ���� ���� : 3���� ���� �� ��� �� ���� ���� ����.");
	}

}