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
		System.out.print("���簢���� ���� ũ�⸦ �Է��Ͻÿ�. ");
		width = s.nextInt();
		System.out.print("���簢���� ���� ũ�⸦ �Է��Ͻÿ�. ");
		height = s.nextInt();
	}
	
	//print squaredecision
	public void printSquaredecision() {
		System.out.printf("���簢���� �κ��� %d�̰�\n", getArea());
		System.out.println(getSquaredecision());
	}
	
	//get area and square decision
	private int getArea() {
		area = width * height;
		return area;
	}
	
	private String getSquaredecision() {
		String square_decision;
		if(width == height) square_decision = "���簢���Դϴ�.";
		else square_decision = "���簢���� �ƴմϴ�.";
		return square_decision;
	}
}
