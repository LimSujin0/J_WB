package workbook.StepK;

import java.util.Scanner;

public class Point {
	double x=0, y=0;
	int quadrant;
	int count;
	void input(){
		Scanner s = new Scanner(System.in);
		System.out.print("좌표의 x, y 값을 입력하시오  -->");
		x = s.nextDouble();
		y = s.nextDouble();
	}
	void printFirst() {
		System.out.println("===========================");
	}
	void printQuadrant() {
		System.out.printf("%d번째 좌표는 %d"
				+ "사분면에 위치합니다.\n", count, getArea(x, y));
	}
	private int getArea(double x, double y) {
		if(x>0 && y>0) quadrant=1;
		else if(x<0 && y>0) quadrant=2;
		else if(x<0 && y<0) quadrant=3;
		else if(x>0 && y<0) quadrant=4;
		else quadrant=0;
		return quadrant;
	}
}
