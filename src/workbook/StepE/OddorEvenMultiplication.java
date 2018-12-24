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
		System.out.print("�������� ��¸��(1:Ȧ����, 2:¦����)�� �Է��Ͻÿ�.");
		mode = s.nextInt();
	}
	//print multiplication
	public void printMultiplication() {
		if(mode==1) {
			printOddMultiplication();
		}else if(mode==2) {
			printEvenMultiplication();
		}else {
			System.out.print("�߸� �Է��ϼ̽��ϴ�.\n");
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
