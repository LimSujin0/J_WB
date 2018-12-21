package workbook.StepC;

import java.util.Scanner;

public class CheckLeapyear {
	//initialize
	private int year;
	
	//constructor
	public CheckLeapyear() {input();}
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("�⵵�� �Է��ϼ���. ");
		year = s.nextInt();
	}
	
	//print checking leap year
	public void printLeapyear() {
		System.out.printf("�Է��Ͻ� �⵵�� %s\n", getLeapyear());
	}
	private String getLeapyear() {
		String check_leap = null;
		if(checkLeapyer())
			check_leap = "�����Դϴ�.";
		else
			check_leap = "������ �ƴմϴ�.";
		return check_leap;
	}
	private boolean checkLeapyer() {
		if(year%4 == 0) {
			if(year%100 == 0) return false;
			else if(year%400 == 0) return true;
			else return true;
		}
		return false;
	}
	
}
