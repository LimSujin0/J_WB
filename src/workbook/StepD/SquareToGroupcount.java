package workbook.StepD;

import java.util.Scanner;

public class SquareToGroupcount {
	//initialize
	private int width, height;
	private int count1, count2, count3, count4, count5;
	//constructor
	public SquareToGroupcount() {
		input();
	}
	private void input() {
		SquareToCount();
	}
	private void SquareToCount() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("직사각형의 가로 크기와 세로 크기를 입려하시오. : ");
			width = s.nextInt();
			height = s.nextInt();
			if(width<1 || height<1) break;
			getCount();
		}
	}
	
	private void getCount() {
		if(width==height) count1++;
		else if(width >= height*2) count2++;
		else if(height >= width*2) count3++;
		else if(width>height) count4++;
		else if(height>width) count5++;
	}
	
	//printGroupcount
	public void printSquareGroupcount() {
		System.out.printf("\"정사각형\"의 개수는 %d입니다.\n", count1);
		System.out.printf("\"좌우로 길쭉한 직사각형\"의 개수는 %d입니다.\n", count2);
		System.out.printf("\"위아래로 길쭉한 직사각형\"의 개수는 %d입니다.\n", count3);
		System.out.printf("\"일반적인 가로형 직사각형\"의 개수는 %d입니다.\n", count4);
		System.out.printf("\"일반적인 세로형 직사각형\"의 개수는 %d입니다.\n", count5);

	}
}
