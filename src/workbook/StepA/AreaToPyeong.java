package workbook.StepA;

import java.util.Scanner;

public class AreaToPyeong {
	private double m2_area;
	private double pyeong_area;
	
	public AreaToPyeong(){input();}
	
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("아파트의 분양 면적을 입력하시오.");
		this.m2_area = s.nextDouble();
	}
	
	public void printPyeong() {
		System.out.printf("아파트의 평형은 %.1f 입니다.\n", getPyeong());
	}
	
	private double getPyeong() {
		pyeong_area = m2_area / 3.305f;
		return this.pyeong_area;
	}
}
