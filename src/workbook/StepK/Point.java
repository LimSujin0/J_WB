package workbook.StepK;

import java.util.Scanner;

public class Point {
	double x=0, y=0;
	int quadrant;
	int count;
	void input(){
		Scanner s = new Scanner(System.in);
		System.out.print("��ǥ�� x, y ���� �Է��Ͻÿ�  -->");
		x = s.nextDouble();
		y = s.nextDouble();
	}
	void printFirst() {
		System.out.println("===========================");
	}
	void printQuadrant() {
		System.out.printf("%d��° ��ǥ�� %d"
				+ "��и鿡 ��ġ�մϴ�.\n", count, getArea(x, y));
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
