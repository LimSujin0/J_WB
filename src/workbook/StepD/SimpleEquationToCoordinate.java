package workbook.StepD;

import java.util.Scanner;

public class SimpleEquationToCoordinate {
	//initialize
	private int a, b;
	private int x_begin, x_end;
	//constructor
	public SimpleEquationToCoordinate() {
		input();
	}
	private void input() {
		getIntialize();
	}
	private void getIntialize() {
		Scanner s = new Scanner(System.in);
		System.out.print("1차 함수 y=ax+b의 계수 a와 b를 입력하시오. ");
		a = s.nextInt();
		b = s.nextInt();
		System.out.print("x좌표의 시작 값과 끝 값을 입력하시오. ");
		x_begin = s.nextInt();
		x_end = s.nextInt();
	}
	
	//print coordinate
	public void printSimpleCoordinate() {
		for(int x=x_begin; x<=x_end; x++) {
			int y = x * a + b;
			System.out.printf("좌표 (%d, %d)\n", x, y);
		}
	}
}
