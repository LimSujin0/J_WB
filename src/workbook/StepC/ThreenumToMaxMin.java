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
		System.out.print("첫번째 숫자를 입력하세요.");
		num1 = s.nextInt();
		System.out.print("두번째 숫자를 입력하세요.");
		num2 = s.nextInt();
		System.out.print("세번째 숫자를 입력하세요.");
		num3 = s.nextInt();
	}
	
	//print max min
	public void printMaxMin() {
		System.out.printf("가장 큰 수는 %d 이고, 가장 작은 수는 %d 입니다.\n", getMax(), getMin());
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
