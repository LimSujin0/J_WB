package workbook.StepB;

import java.util.Scanner;

public class ScoreToDecision {
	//initialize
	private int kor, eng, math;
	private int total;
	private double average;
	
	//constructor
	public ScoreToDecision(){input();}
	
	private void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� ������ �Է��ϼ���. ");
		kor = s.nextInt();
		System.out.print("���� ������ �Է��ϼ���. ");
		eng = s.nextInt();
		System.out.print("���� ������ �Է��ϼ���. ");
		math = s.nextInt();
	}
	
	//print score and decision
	public void printScoreAndDecision() {
		System.out.printf("�Է��Ͻ� ������ ������ %d �̰�,\n", getTotal());
		System.out.printf("����� %.1f �Դϴ�.\n", getAverage());
		printDecision();
	}

	//getscore
	private double getAverage() {
		average = (double)total/3.0f;
		return average;
	}

	private int getTotal() {
		total = kor + eng + math;
		return total;
	}
	
	//get decision
	private void printDecision() {
		getDecisionKorea();
		getDecisionEnglish();
		getDecisionMath();
		
	}

	private void getDecisionMath() {
		if(math >= 90) System.out.println("���� ������ ����մϴ�.");
	}

	private void getDecisionEnglish() {
		if(eng >= 90) System.out.println("���������� ����մϴ�.");
	}

	private void getDecisionKorea() {
		if(kor >= 90) System.out.println("���������� ����մϴ�.");
		
	}
	
}
