package workbook.StepC;

import java.util.Scanner;

public class TempToWatergroup {
	//initialize
	private double input_degree;
	
	//constructor
	public TempToWatergroup() { input(); }
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("물의 온도를 입력하세요. ");
		input_degree = s.nextDouble();
	}
	
	//print water group
	public void printWatergroup() {
		System.out.println(getWatergroup());
	}
	
	private String getWatergroup() {
		String water_group;
		if(input_degree < 0) water_group = "잘못입력하셨습니다.";
		else if(input_degree < 25) water_group = "냉수입니다.";
		else if(input_degree < 40) water_group = "미온수입니다.";
		else if(input_degree < 80) water_group = "온수입니다.";
		else water_group = "끓는 물입니다.";
		
		return water_group;
	}

}
