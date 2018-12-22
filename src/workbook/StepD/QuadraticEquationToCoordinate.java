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
		System.out.print("2�� �Լ� y=ax^2+bx+c�� ��� a�� b,c�� �Է��Ͻÿ�. ");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		System.out.print("x��ǥ�� ���� ���� �� ���� �Է��Ͻÿ�. ");
		x_begin = s.nextInt();
		x_end = s.nextInt();
	}
	
	//print
	public void printQuadraticCoordinate() {
		for(x=x_begin; x<=x_end; x++) {
			y = a*x*x + b*x + c;
			System.out.printf("��ǥ (%d, %d)\n", x, y);
		}
	}
}
