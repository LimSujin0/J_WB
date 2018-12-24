package workbook.StepE;

import java.util.Scanner;

public class OddEvenAndColumn {
	//initialize
	private int mode, column;
	private int i, j;
	//constructor
	public OddEvenAndColumn() {
		input();
	}
	private void input() {
		Scanner s  = new Scanner(System.in);
		System.out.print("구구단의 출력모드(1:홀수단, 2:짝수단)를 입력하시오.");
		mode = s.nextInt();
		System.out.print("한 줄에 출력할 갯수를 입력하시오.");
		column = s.nextInt();
	}
	//print multiplication
	public void printColumnMultiplication() {
		if(mode==1) printOddColumnMultiplication();
		else if(mode==2) printEvenColumnMultiplication();
		else System.out.print("잘못 입력하셨습니다.\n");
	}
	private void printEvenColumnMultiplication() {
		for(i=2;i<10;i=i+2) {
			for(j=1;j<10;j++) {
				System.out.printf("%d x %d = %d\t", i, j, i*j);
				if(j%column==0) System.out.println("");
			}
			System.out.println("");
		}
		
	}
	private void printOddColumnMultiplication() {
		for(i=3;i<10;i=i+2) {
			for(j=1;j<10;j++) {
				System.out.printf("%d x %d = %d\t", i, j, i*j);
				if(j%column==0) System.out.println("");
			}
			System.out.println("");
		}
	}
}
