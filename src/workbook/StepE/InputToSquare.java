package workbook.StepE;

import java.util.Scanner;

public class InputToSquare {
	//initialize
	private int length;
	private int i, j;
	//constructor
	public InputToSquare() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("\n정사각형의 크기를 입력하시오.");
		length = s.nextInt();
	}
	//print square
	public void printSquare() {
		for(i=0;i<length;i++) {
			for(j=0;j<length;j++) {
				System.out.print("# ");
			}
			System.out.print("\n");
		}
	}
	
}
