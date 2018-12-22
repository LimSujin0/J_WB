package workbook.StepD;
import java.util.Scanner;

public class QuadraticEquationToCoordinate {
	//initialize
	private int a, b, c;
	private int x_begin, x_end;
	private int x, y;
	
	//constructor
	public QuadraticEquationToCoordinate() {
		input();
	}
	private void input() {
		getIntialize();
	}
	private void getIntialize() {
		Scanner s = new Scanner(System.in);
		System.out.print("2차 함수 y=ax^2+bx+c의 계수 a와 b,c를 입력하시오. ");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		System.out.print("x좌표의 시작 값과 끝 값을 입력하시오. ");
		x_begin = s.nextInt();
		x_end = s.nextInt();
	}
	
	//print
	public void printQuadraticCoordinate() {
		for(x=x_begin; x<=x_end; x++) {
			y = a*x*x + b*x + c;
			System.out.printf("좌표 (%d, %d)\n", x, y);
		}
	}
}
