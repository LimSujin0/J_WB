package workbook.StepF;

import java.util.Scanner;

public class CountPerFloorHo {
	//initialize
	private int number[][] = new int[5][3];
	private int newnum;
	private int floor_total[] = new int[5];
	private int line_total[] = new int[3];
	private int total;
	private int ho;
	private int i, j;
	//constructor
	public CountPerFloorHo() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		for(i=0;i<5;i++) {
			for(j=0;j<3;j++) {
				ho = (i+1)*100 + (j+1);
				System.out.printf("%d호에 살고 있는 사람의 숫자를 입력하시오.", ho);
				number[i][j] = s.nextInt();
			}
		}
	}
	//print number of total person per ho per line
	public void printPerFloorLine() {
		getPerFloor();
		getPerLine();
		printPerFloor();
		System.out.println("");
		printPerLine();
	};
	private void printPerLine() {
		for(i=0;i<3;i++)
			System.out.printf("%d호 라인에 사는 거주자는 모두 %d명 입니다.\n", i+1, line_total[i]);
	}
	private void printPerFloor() {
		for(i=0;i<5;i++)
			System.out.printf("%d층에 사는 거주자는 모두 %d명 입니다.\n", i+1, floor_total[i]);
	}
	private void getPerLine() {
		for(i=0;i<3;i++)
			for(j=0;j<5;j++)
				line_total[i] = line_total[i] + number[j][i];
	}
	private void getPerFloor() {
		for(i=0;i<5;i++)
			for(j=0;j<3;j++)
				floor_total[i] = floor_total[i] + number[i][j]; 
	}
	
}
