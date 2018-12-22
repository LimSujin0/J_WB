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
			System.out.print("0부터 100사이의 숫자를 입력하세요.");
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
		System.out.printf("입력한 %d 개의 숫자들의 총합계는 %d 이고, 평균 값은 %.1f 입니다.\n"
				, count, totalsum, average);
	}
}
