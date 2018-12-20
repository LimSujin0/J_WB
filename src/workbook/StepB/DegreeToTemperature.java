package workbook.StepB;

import java.util.Scanner;

public class DegreeToTemperature {
//initialize
	private double input_degree;
	private String kind;
	private double output_degree;
	
	//constructor
	public DegreeToTemperature() {input();}
	
	private void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�µ��� �Է��ϼ���. ");
		input_degree = s.nextDouble();
		System.out.print("�Է��Ͻ� �µ��� �����µ��̸� C��, ȭ���µ��̸� F�� �Է��ϼ���. ");
		kind = s.next();
	}
	
	//print outcome
	public void printTemperature() {
		System.out.printf("��ȯ�� �µ��� %.1f�Դϴ�.\n", getTemperature());
	}
	
	private double getTemperature() {
		if(kind.equals("C")) {	calculateFahrenheit();}
		else if(kind.equals("F")) {	calculateCelcius(); }
		else getNewString();
		return output_degree;
	}
	
	private void getNewString() {
		Scanner s = new Scanner(System.in);
		System.out.println("�ùٸ� ���ڸ� �Է����ּ���.\n�Է��Ͻ� �µ��� �����µ��̸� C��, ȭ���µ��̸� F�� �Է��ϼ���.");
		kind = s.next();
	}
	
	//calculate temperature
	private void calculateFahrenheit() {
		output_degree = input_degree * 1.8 + 32;
	}
	private void calculateCelcius(){
		output_degree = (input_degree-32)/1.8f;
	}
}
