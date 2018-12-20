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
		
		System.out.print("������ �Է��ϼ���. ");
		days = s.nextInt();
	}
	
	//print seconds and decision
	public void printSecondsAndDecision() {
		System.out.printf("������ �ش�Ǵ� �Ⱓ�� ��� %d ���Դϴ�.\n", getSeconds());
		printDecision();
	}

	private int getSeconds() {
		seconds = days * 24 * 60 * 60;
		return seconds;
	}
	
	private void printDecision() {
		if(seconds > 1000000) {
			System.out.printf("100�� �ʰ� ��� %d�� �̳� ���Ե˴ϴ�.\n", getMillionCount());
		}
	}

	private int getMillionCount() {
		int million_count;
		million_count =  seconds/1000000;
		return million_count;
	}
}
