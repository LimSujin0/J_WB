package workbook.StepD;

import java.util.Scanner;

public class InputToTotalAverage {
	//initialize
	private int number;
	private int count = 0;
	private int totalsum;
	private double average;
	//constructor
	public InputToTotalAverage() {
		input();
	}
	private void input() {
		getNumber();
	}
	
	private void getNumber(){
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.print("0���� 100������ ���ڸ� �Է��ϼ���.");
			number = s.nextInt();
			if(0 > number || number > 100) break;
			getTotal();
		}
		getAverage();
	}
	private void getTotal() {
		count++;
		totalsum = totalsum + number;
	}
	private void getAverage() {
		average = (double)totalsum / (double)count;
	}
	
	//print total average
	public void printTotalAverage() {
		System.out.printf("�Է��� %d ���� ���ڵ��� ���հ�� %d �̰�, ��� ���� %.1f �Դϴ�.\n"
				, count, totalsum, average);
	}
}
