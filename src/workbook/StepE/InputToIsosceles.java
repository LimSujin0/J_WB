package workbook.StepE;

import java.util.Scanner;

public class InputToIsosceles {
	//initialize
	private int height;
	private int i,j;
	//constructor
	public InputToIsosceles() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("�̵ �ﰢ���� ���̸� �Է��Ͻÿ�.");
		height  = s.nextInt();
	}
	//print isosceles triangle
	public void printIsosceles() {
		for(i=1;i<=height;i++) {
			for(j=0;j<height-i;j++)	System.out.print(" ");
			for(j=0;j<i;j++)	System.out.print("*");
			for(j=0;j<i-1;j++)	System.out.print("*");
			for(j=0;j<height-i;j++)	System.out.print(" ");
			System.out.println("");
		}
	}
}
