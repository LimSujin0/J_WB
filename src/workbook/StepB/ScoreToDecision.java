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
		
		System.out.print("국어 점수를 입력하세요. ");
		kor = s.nextInt();
		System.out.print("영어 점수를 입력하세요. ");
		eng = s.nextInt();
		System.out.print("수학 점수를 입력하세요. ");
		math = s.nextInt();
	}
	
	//print score and decision
	public void printScoreAndDecision() {
		System.out.printf("입력하신 점수의 총점은 %d 이고,\n", getTotal());
		System.out.printf("평균은 %.1f 입니다.\n", getAverage());
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
		if(math >= 90) System.out.println("수학 점수가 우수합니다.");
	}

	private void getDecisionEnglish() {
		if(eng >= 90) System.out.println("영어점수가 우수합니다.");
	}

	private void getDecisionKorea() {
		if(kor >= 90) System.out.println("국어점수가 우수합니다.");
		
	}
	
}
