package workbook.StepA;

import java.util.Scanner;

public class DayToSeconds {
	private int days;
	private int seconds;
	
	public DayToSeconds() {input();}
	
	private void input() {
		System.out.print("날 수를 입력하세요.");
		
		Scanner s = new Scanner(System.in);
		this.days = s.nextInt();
	}
	
	public void printSeconds() {
		System.out.printf("날 수에 해당되는 시간은 모두 %d 초입니다.\n", getSeconds());
	}
	
	private int getSeconds() {
		seconds = days *24 * 60 * 60;
		return this.seconds;
	}
}
