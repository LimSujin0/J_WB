package workbook.StepA;

import java.util.Scanner;

public class ScoreToMean {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	
	public ScoreToMean() { input(); }
	
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ���.");
		this.kor = s.nextInt();
		System.out.print("���� ������ �Է��ϼ���.");
		this.eng = s.nextInt();
		System.out.print("���� ������ �Է��ϼ���.");
		this.math = s.nextInt();
	}
	
	public void printAvareage() {
		getAverage();
		System.out.printf("�Է��Ͻ� ������ %d �̰�,\n����� %.1f �Դϴ�.\n" , total, average);
	}
	
	private void getAverage() {
		this.total = kor + eng + math;
		this.average = (double)total/3.0f;
	}
}
