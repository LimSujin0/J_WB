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
		
		System.out.print("온도를 입력하세요. ");
		input_degree = s.nextDouble();
		System.out.print("입력하신 온도가 섭씨온도이면 C를, 화씨온도이면 F를 입력하세요. ");
		kind = s.next();
	}
	
	//print outcome
	public void printTemperature() {
		System.out.printf("변환된 온도는 %.1f입니다.\n", getTemperature());
	}
	
	private double getTemperature() {
		if(kind.equals("C")) {	calculateFahrenheit();}
		else if(kind.equals("F")) {	calculateCelcius(); }
		else getNewString();
		return output_degree;
	}
	
	private void getNewString() {
		Scanner s = new Scanner(System.in);
		System.out.println("올바른 문자를 입력해주세요.\n입력하신 온도가 섭씨온도이면 C를, 화씨온도이면 F를 입력하세요.");
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
