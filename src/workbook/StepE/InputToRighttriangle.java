package workbook.StepE;

import java.util.Scanner;

public class InputToRighttriangle {
	//initialize
	private int height, blank;
	private int i, j;
	//constructor
	public InputToRighttriangle() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하시오. ");
		height = s.nextInt();
		blank = s.nextInt();
	}
	//print triangle
	public void printRighttriangle() {
		for(i=1;i<=height;i++) {
			for(j=0;j<blank+height-i;j++) {
				System.out.print(" ");
			}
			for(j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	

}
