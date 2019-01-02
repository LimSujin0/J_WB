package workbook.StepI;

import java.util.Scanner;

public class RightAngledTriangle {
	public RightAngledTriangle() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("직각 삼각형을 그리는데 사용할 문자를 입력하시오. ");
		char ch = s.next().charAt(0);
		System.out.print("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하시오. ");
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
