package workbook.StepE;

import java.util.Scanner;

public class OddorEvenMultiplication {
	//initialize
	private int mode;
	private int i, j;
	//constructor
	public OddorEvenMultiplication() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("구구단의 출력모드(1:홀수단, 2:짝수단)을 입력하시오.");
		mode = s.nextInt();
	}
	//print multiplication
	public void printMultiplication() {
		if(mode==1) {
			printOddMultiplication();
		}else if(mode==2) {
			printEvenMultiplication();
		}else {
			System.out.print("잘못 입력하셨습니다.\n");
		}
	}
	private void printEvenMultiplication() {
		for(i=2;i<10;i=i+2) {
			for(j=1;j<10;j++) {
				System.out.printf("%d x %d = %d\t", i, j, i*j);
				if(j%3==0) System.out.print("\n");
			}
			System.out.println("");
		}
	}
	private void printOddMultiplication() {
		for(i=3;i<10;i=i+2) {
			for(j=1;j<10;j++) {
				System.out.printf("%d x %d = %d\t", i, j, i*j);
				if(j%3==0) System.out.println("");
			}
			System.out.println("");
		}
	}	
}
