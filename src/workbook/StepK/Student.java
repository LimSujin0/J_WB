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
		System.out.printf("%d�� �л��� ����, ����, ���������� �Է��Ͻÿ� --> ",  count);
		kor = s.nextInt();
		eng = s.nextInt();
		math = s.nextInt();
	}
	void printFirst() {
		System.out.print("===========================\n");
		System.out.print("��ϵ� 3���� �л� ����� ������ �����ϴ�.\n");
		System.out.print("---------------------------\n");
		System.out.print("��ȣ\t����\t����\t����\t����\t���\t����\n");
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
