package workbook.StepI;

import java.util.Scanner;

public class RightAngledTriangle {
	public RightAngledTriangle() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���� �ﰢ���� �׸��µ� ����� ���ڸ� �Է��Ͻÿ�. ");
		char ch = s.next().charAt(0);
		System.out.print("���� �ﰢ���� ���̿� ���� ������ ũ�⸦ �Է��Ͻÿ�. ");
		int size = s.nextInt();
		int blank = s.nextInt();
		printCharWithBlank(blank, size, ch);
	}
	private void printCharWithBlank(int blank, int size, char ch) {
		for(int i=1;i<=size;i++) {
			for(int j=size-i;j>-blank;j--)	System.out.print(" ");
			for(int j=1;j<=i;j++)	System.out.printf("%c",ch);
			System.out.println("");
		}
	}
	
}
