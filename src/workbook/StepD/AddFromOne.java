package workbook.StepD;

import java.util.Scanner;

public class AddFromOne {
	//initialize
	private int number;
	private int totalsum = 0;
	
	//constructor
	public AddFromOne() { input(); }
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���. ");
		number = s.nextInt();
	}
	
	//print total
	public void printTotal() {
		if(number <= 1) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else {
		System.out.printf("1���� �Է��� ���ڱ����� ��� ������ ���� ���� %d �Դϴ�.\n", getTotal());
		}
	}
	
	private int getTotal() {
		for(int i=1; i<=number; i++) {
			totalsum = totalsum + i;
		}
		return totalsum;
	}
}
