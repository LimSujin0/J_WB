package workbook.StepE;

import java.util.Scanner;

public class InputToTwodimensional {
	//initialize
	private int rows, columns;
	private int number;
	private int i, j;
	//constructor
	public InputToTwodimensional() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("����Ϸ��� ���� ũ��� ���� ũ�⸦ �Է��Ͻÿ�.");
		rows = s.nextInt();
		columns = s.nextInt();
	}
	//print two dimensional number
	public void printTwoDimensional() {
		for(i=1;i<=rows;i++) {
			for(j=1;j<=columns;j++) {
				System.out.printf("%4d", i*j);
			}
			System.out.println("");
		}
	}
}
