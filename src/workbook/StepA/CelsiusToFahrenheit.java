package workbook.StepA;

import java.util.Scanner;

public class CelsiusToFahrenheit {
	private double c_degree;
	private double f_degree;
	
	public CelsiusToFahrenheit(){ input();}
	
	private void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.printf("���� �µ��� �Է��Ͻÿ�.\n");
		this.c_degree = s.nextDouble();
	}
	
	private double getTemprature() {
		f_degree = c_degree*1.8 + 32;
		return this.f_degree;
	}
	
	public void printTemprature() {
		System.out.printf("ȭ�� �µ��� %.1f�� �Դϴ�.\n", getTemprature());	
	}
}
