package workbook.StepB;

import java.util.Scanner;

public class AreaToSquaredecision {
	//initialize
	private int width, height;
	private int area;
	
	//constructor
	public AreaToSquaredecision() {input();}
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("직사각형의 가로 크기를 입력하시오. ");
		width = s.nextInt();
		System.out.print("직사각형의 세로 크기를 입력하시오. ");
		height = s.nextInt();
	}
	
	//print squaredecision
	public void printSquaredecision() {
		System.out.printf("직사각형의 널비은 %d이고\n", getArea());
		System.out.println(getSquaredecision());
	}
	
	//get area and square decision
	private int getArea() {
		area = width * height;
		return area;
	}
	
	private String getSquaredecision() {
		String square_decision;
		if(width == height) square_decision = "정사각형입니다.";
		else square_decision = "정사각형이 아닙니다.";
		return square_decision;
	}
}
