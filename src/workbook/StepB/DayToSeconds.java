package workbook.StepB;

import java.util.Scanner;

public class DayToSeconds {
	//initialize
	private int days;
	private int seconds;
	private int m_count;
	
	//constructor
	public DayToSeconds(){input();}
	
	private void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("날수를 입력하세요. ");
		days = s.nextInt();
	}
	
	//print seconds and decision
	public void printSecondsAndDecision() {
		System.out.printf("날수에 해당되는 기간은 모두 %d 초입니다.\n", getSeconds());
		printDecision();
	}

	private int getSeconds() {
		seconds = days * 24 * 60 * 60;
		return seconds;
	}
	
	private void printDecision() {
		if(seconds > 1000000) {
			System.out.printf("100만 초가 모두 %d번 이나 포함됩니다.\n", getMillionCount());
		}
	}

	private int getMillionCount() {
		int million_count;
		million_count =  seconds/1000000;
		return million_count;
	}
}
