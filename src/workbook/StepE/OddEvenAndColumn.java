package workbook.StepE;

import java.util.Scanner;

public class OddEvenAndColumn {
	//initialize
	private int mode, column;
	//constructor
	public OddEvenAndColumn() {
		input();
	}
	private void input() {
		Scanner s  = new Scanner(System.in);
		System.out.print("�������� ��¸��(1:Ȧ����, 2:¦����)�� �Է��Ͻÿ�.");
		mode = s.nextInt();
		System.out.print("�� �ٿ� ����� ������ �Է��Ͻÿ�.");
		column = s.nextInt();
	}
	//print multiplication
	public void printColumnMultiplication() {
		if(mode!=1 || mode!=2)System.out.print("�߸� �Է��ϼ̽��ϴ�.\n");
		else printOddAndEvenColumnMultiplication();
	}
	private void printOddAndEvenColumnMultiplication() {
		if(mode==1) mode++;
		else if(mode==2) mode++;
		for(int i=mode+1;i<10;i=i+2) {
			for(int j=1;j<10;j++) {
				System.out.printf("%d x %d = %d\t", i, j, i*j);
				if(j%column==0) System.out.println("");
			}
			System.out.println("");
		}
	}
}
