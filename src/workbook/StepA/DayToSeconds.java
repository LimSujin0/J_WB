package workbook.StepA;

import java.util.Scanner;

public class DayToSeconds {
	private int days;
	private int seconds;
	
	public DayToSeconds() {input();}
	
	private void input() {
		System.out.print("�� ���� �Է��ϼ���.");
		
		Scanner s = new Scanner(System.in);
		this.days = s.nextInt();
	}
	
	public void printSeconds() {
		System.out.printf("�� ���� �ش�Ǵ� �ð��� ��� %d ���Դϴ�.\n", getSeconds());
	}
	
	private int getSeconds() {
		seconds = days *24 * 60 * 60;
		return this.seconds;
	}
}
