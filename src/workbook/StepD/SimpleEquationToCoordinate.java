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
		System.out.print("1�� �Լ� y=ax+b�� ��� a�� b�� �Է��Ͻÿ�. ");
		a = s.nextInt();
		b = s.nextInt();
		System.out.print("x��ǥ�� ���� ���� �� ���� �Է��Ͻÿ�. ");
		x_begin = s.nextInt();
		x_end = s.nextInt();
	}
	
	//print coordinate
	public void printSimpleCoordinate() {
		for(int x=x_begin; x<=x_end; x++) {
			int y = x * a + b;
			System.out.printf("��ǥ (%d, %d)\n", x, y);
		}
	}
}
