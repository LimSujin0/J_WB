package workbook.StepA;

import java.util.Scanner;

public class AreaToPyeong {
	private double m2_area;
	private double pyeong_area;
	
	public AreaToPyeong(){input();}
	
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("����Ʈ�� �о� ������ �Է��Ͻÿ�.");
		this.m2_area = s.nextDouble();
	}
	
	public void printPyeong() {
		System.out.printf("����Ʈ�� ������ %.1f �Դϴ�.\n", getPyeong());
	}
	
	private double getPyeong() {
		pyeong_area = m2_area / 3.305f;
		return this.pyeong_area;
	}
}
