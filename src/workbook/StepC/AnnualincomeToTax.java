package workbook.StepC;

import java.util.Scanner;

public class AnnualincomeToTax {
	//initialize
	private int income;
	private int tax;
	
	//constructor
	public AnnualincomeToTax() { input();}
	private void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("연봉(원 단위)을 숫자로 입력하세요. ");
		income = s.nextInt();
	}
	
	//print Tax
	public void printTax() {
		System.out.printf("연봉 금액에 대한 소득세는 %d원 입니다.\n", getTax());
	}
	
	private int getTax() {
		double percent = getPercent();
		tax = (int) (income*percent);
		return tax;
	}
	
	private double getPercent() {
		double percent = 0;
		if(income<10000000) percent = 0.095;
		else if(income<40000000) percent = 0.19;
		else if(income<80000000) percent = 0.28;
		else percent = 0.37;
		
		return percent;
	}
}
