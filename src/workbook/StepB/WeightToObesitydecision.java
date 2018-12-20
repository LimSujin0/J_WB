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
		System.out.print("신장(cm단위)를 입력하세요. ");
		height = s.nextInt();
		System.out.print("체중(kg단위)를 입력하세요. ");
		weight = s.nextInt();
	}
	
	//print obesity decision
	public void printObesity() {
		getBmi();
		if(bmi>=25) System.out.println("당신은 비만이십니다.");
		else System.out.println("당신은 비만이 아니군요");
	}
	
	private void getBmi() {
		double height_m = height/100f;
		double height_m_square = height_m * height_m;
		bmi = weight/(int)height_m_square;
	}

}