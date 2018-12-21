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
		
		System.out.print("����(�� ����)�� ���ڷ� �Է��ϼ���. ");
		income = s.nextInt();
	}
	
	//print Tax
	public void printTax() {
		System.out.printf("���� �ݾ׿� ���� �ҵ漼�� %d�� �Դϴ�.\n", getTax());
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
