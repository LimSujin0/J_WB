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
		
		System.out.print("���� ������ �Է��ϼ���.");
		kor = s.nextInt();
		System.out.print("���� ������ �Է��ϼ���.");
		eng = s.nextInt();
		System.out.print("���� ������ �Է��ϼ���.");
		math = s.nextInt();
	}
	
	//print grade
	public void printGrade() {
		System.out.printf("�Է��Ͻ� ������ ������ %d �̰�,\n ����� %.1f �Դϴ�.\n", getTotal(), getAverage());
		System.out.printf("%s �Դϴ�.\n", getGrade());
	}
	
	private Object getGrade() {
		String grade;
		if(average>90)  grade = "��";
		else if(average>80) grade = "��";
		else if(average>70) grade = "��";
		else if(average>60) grade = "��";
		else grade = "��";
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
