package workbook.StepA;
import java.util.Scanner;

public class SquareToArea {

	private int area;
	private int width;
	private int height;
	
	public SquareToArea() { input();}
	
	private void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("���簢���� ���� ũ�⸦ �Է��ϼ���.");
		this.width = s.nextInt();
		System.out.print("���簢���� ���� ũ�⸦ �Է��ϼ���.");
		this.height = s.nextInt();
	}
	
	private int getArea() {
		area = width*height;
		return this.area;
	}
	
	public void printArea() {
		System.out.printf("���簢���� ���̴� %d�Դϴ�.\n", getArea());
	}
}
