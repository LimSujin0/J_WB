package workbook.StepC;

import java.util.Scanner;

public class SquareToShapedecision {
	//initialize
	private int width, height;
	
	//constructor
	public SquareToShapedecision() {input();}
	private void input() {
		Scanner s  = new Scanner(System.in);
		System.out.print("���簢���� ���� ũ�⸦ �Է��Ͻÿ�.");
		width = s.nextInt();
		System.out.print("���簢���� ���� ũ�⸦ �Է��Ͻÿ�.");
		height = s.nextInt();
	}
	
	//print shape decision
	public void printShaperdecision() {
		System.out.println(getShapedecision());
	}
	
	private String getShapedecision() {
		String shape_decision = null;
		if(width == height) shape_decision = "���簢���Դϴ�.";
		else if(width >= height*2) shape_decision = "�¿�� ������ ���簢���Դϴ�.";
		else if(width*2 <= height) shape_decision = "���Ʒ��� ������ ���簢���Դϴ�.";
		else if(width > height) shape_decision = "�Ϲ����� ������ ���簢���Դϴ�.";
		else if(width < height) shape_decision = "�Ϲ����� ������ ���簢���Դϴ�.";
		
		return shape_decision;
	}
}
