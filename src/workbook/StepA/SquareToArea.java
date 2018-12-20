package workbook.StepA;
import java.util.Scanner;

public class SquareToArea {

	private int area;
	private int width;
	private int height;
	
	public SquareToArea() { input();}
	
	private void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("직사각형의 가로 크기를 입력하세요.");
		this.width = s.nextInt();
		System.out.print("직사각형의 세로 크기를 입력하세요.");
		this.height = s.nextInt();
	}
	
	private int getArea() {
		area = width*height;
		return this.area;
	}
	
	public void printArea() {
		System.out.printf("직사각형의 넓이는 %d입니다.\n", getArea());
	}
}
