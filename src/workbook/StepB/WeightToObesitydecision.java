package workbook.StepB;

import java.util.Scanner; 

public class WeightToObesitydecision {
	//initialize
	private int height, weight;
	private int bmi;
	
	//constructor
	public WeightToObesitydecision() { input(); }
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("����(cm����)�� �Է��ϼ���. ");
		height = s.nextInt();
		System.out.print("ü��(kg����)�� �Է��ϼ���. ");
		weight = s.nextInt();
	}
	
	//print obesity decision
	public void printObesity() {
		getBmi();
		if(bmi>=25) System.out.println("����� ���̽ʴϴ�.");
		else System.out.println("����� ���� �ƴϱ���");
	}
	
	private void getBmi() {
		double height_m = height/100f;
		double height_m_square = height_m * height_m;
		bmi = weight/(int)height_m_square;
	}

}