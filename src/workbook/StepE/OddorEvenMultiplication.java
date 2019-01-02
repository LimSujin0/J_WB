package workbook.StepE;

import java.util.Scanner;

public class OddorEvenMultiplication {
	//initialize
	private int mode;
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
		if(mode==1 || mode==2) {
			printEvenOddMultiplication();
		}else {
			System.out.print("잘못 입력하셨습니다.\n");
		}
	}
	private void printEvenOddMultiplication() {
		if(mode==1) mode = mode+2;
		for(int i=2;i<10;i=i+2) {
			for(int j=1;j<10;j++) {
				System.out.printf("%d x %d = %d\t", i, j, i*j);
				if(j%3==0) System.out.print("\n");
			}
			System.out.println("");
		}
	}	
}
