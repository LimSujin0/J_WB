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
			System.out.print("���簢���� ���� ũ��� ���� ũ�⸦ �Է��Ͻÿ�. : ");
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
		System.out.printf("\"���簢��\"�� ������ %d�Դϴ�.\n", count1);
		System.out.printf("\"�¿�� ������ ���簢��\"�� ������ %d�Դϴ�.\n", count2);
		System.out.printf("\"���Ʒ��� ������ ���簢��\"�� ������ %d�Դϴ�.\n", count3);
		System.out.printf("\"�Ϲ����� ������ ���簢��\"�� ������ %d�Դϴ�.\n", count4);
		System.out.printf("\"�Ϲ����� ������ ���簢��\"�� ������ %d�Դϴ�.\n", count5);

	}
}
