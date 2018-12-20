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
		System.out.print("국어 점수를 입력하세요.");
		this.kor = s.nextInt();
		System.out.print("영어 점수를 입력하세요.");
		this.eng = s.nextInt();
		System.out.print("수학 점수를 입력하세요.");
		this.math = s.nextInt();
	}
	
	public void printAvareage() {
		getAverage();
		System.out.printf("입력하신 총점은 %d 이고,\n평균은 %.1f 입니다.\n" , total, average);
	}
	
	private void getAverage() {
		this.total = kor + eng + math;
		this.average = (double)total/3.0f;
	}
}
