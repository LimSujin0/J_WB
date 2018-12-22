package workbook.StepD;

import java.util.Scanner;

public class AddFromOne {
	//initialize
	private int number;
	private int totalsum = 0;
	private int i;
	
	//constructor
	public AddFromOne() { input(); }
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. ");
		number = s.nextInt();
	}
	
	//print total
	public void printTotal() {
		if(number <= 1) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
		System.out.printf("1부터 입력한 숫자까지의 모든 정수를 더한 값은 %d 입니다.\n", getTotal());
		}
	}
	
	private int getTotal() {
		for(i=1; i<=number; i++) {
			totalsum = totalsum + i;
		}
		return totalsum;
	}
}
