package workbook.StepC;

import java.util.Scanner;

public class ScoreToGrade {
	//initialize
	private int kor, eng, math;
	private int total;
	private double average;
	
	//constructor
	public ScoreToGrade() {input();}
	private void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요.");
		kor = s.nextInt();
		System.out.print("영어 점수를 입력하세요.");
		eng = s.nextInt();
		System.out.print("수학 점수를 입력하세요.");
		math = s.nextInt();
	}
	
	//print grade
	public void printGrade() {
		System.out.printf("입력하신 점수의 총점은 %d 이고,\n 평균은 %.1f 입니다.\n", getTotal(), getAverage());
		System.out.printf("%s 입니다.\n", getGrade());
	}
	
	private Object getGrade() {
		String grade;
		if(average>90)  grade = "수";
		else if(average>80) grade = "우";
		else if(average>70) grade = "미";
		else if(average>60) grade = "양";
		else grade = "가";
		return grade;
	}
	
	private Object getAverage() {
		average = (double)total/3.0f;
		return average;
	}
	
	private Object getTotal() {
		total = kor+eng+math;
		return total;
	}
	
}
