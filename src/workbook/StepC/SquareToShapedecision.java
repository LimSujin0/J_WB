package workbook.StepC;

import java.util.Scanner;

public class SquareToShapedecision {
	//initialize
	private int width, height;
	
	//constructor
	public SquareToShapedecision() {input();}
	private void input() {
		Scanner s  = new Scanner(System.in);
		System.out.print("직사각형의 가로 크기를 입력하시오.");
		width = s.nextInt();
		System.out.print("직사각형의 세로 크기를 입력하시오.");
		height = s.nextInt();
	}
	
	//print shape decision
	public void printShaperdecision() {
		System.out.println(getShapedecision());
	}
	
	private String getShapedecision() {
		String shape_decision = null;
		if(width == height) shape_decision = "정사각형입니다.";
		else if(width >= height*2) shape_decision = "좌우로 길쭉한 직사각형입니다.";
		else if(width*2 <= height) shape_decision = "위아래로 길쭉한 직사각형입니다.";
		else if(width > height) shape_decision = "일반적인 가로형 직사각형입니다.";
		else if(width < height) shape_decision = "일반적인 세로형 직사각형입니다.";
		
		return shape_decision;
	}
}
