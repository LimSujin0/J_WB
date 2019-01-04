package workbook.StepK;

import java.util.Scanner;

public class Student {
	int kor, math, eng;
	double average=0;
	int total=0;
	String degree;
	int count;
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("%d번 학생의 국어, 영어, 수학점수를 입력하시오 --> ",  count);
		kor = s.nextInt();
		eng = s.nextInt();
		math = s.nextInt();
	}
	void printFirst() {
		System.out.print("===========================\n");
		System.out.print("등록된 3명의 학생 목록은 다음고 같습니다.\n");
		System.out.print("---------------------------\n");
		System.out.print("번호\t국어\t국어\t수학\t총점\t평균\t학점\n");
	}
	void print() {
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%.1f\t%s\n", count, kor, eng, math, getTotal(), getAverage(), getDegree());
	}
	private double getAverage() {
		average = total/3.0f;
		return average;
	}
	private int getTotal() {
		total = math+eng+kor;
		return total;
	}
	private String getDegree() {
		if(average>=95) degree="A+";
		else if(average>=90) degree="A";
		else if(average>=85) degree="B+";
		else if(average>=80) degree="B";
		else if(average>=75) degree="C+";
		else if(average>=70) degree="C";
		else if(average>=60) degree="D";
		else degree="F";
		return degree;
	}
}
