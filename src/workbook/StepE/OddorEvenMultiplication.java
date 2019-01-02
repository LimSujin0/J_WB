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
		System.out.print("�������� ��¸��(1:Ȧ����, 2:¦����)�� �Է��Ͻÿ�.");
		mode = s.nextInt();
	}
	//print multiplication
	public void printMultiplication() {
		if(mode==1 || mode==2) {
			printEvenOddMultiplication();
		}else {
			System.out.print("�߸� �Է��ϼ̽��ϴ�.\n");
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
