package workbook.StepC;

import java.util.Scanner;

public class ThreenumToMaxMin {
	//initialize
	private int num1, num2, num3;
	private int max_num, min_num;
	
	//constructor
	public ThreenumToMaxMin() {input();}
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ���.");
		num1 = s.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���.");
		num2 = s.nextInt();
		System.out.print("����° ���ڸ� �Է��ϼ���.");
		num3 = s.nextInt();
	}
	
	//print max min
	public void printMaxMin() {
		System.out.printf("���� ū ���� %d �̰�, ���� ���� ���� %d �Դϴ�.\n", getMax(), getMin());
	}
	
	private int getMax() {
		max_num = num1;
		if(max_num < num2) max_num=num2;
		if(max_num < num3) max_num=num3;
		
		return max_num;
	}
	
	private int getMin() {
		min_num = num1;
		if(min_num > num2) min_num=num2;
		if(min_num > num3) min_num=num3;
		
		return min_num;
	}
}
