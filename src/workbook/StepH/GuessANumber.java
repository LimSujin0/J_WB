package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class GuessANumber {
	private int answer;
	private int count=0;
	
	public GuessANumber() {
		input();
	}
	private void input() {
		Random generator = new Random();
		answer = generator.nextInt(100)+1;
		System.out.println(answer);
		guessANumber();
	}
	
	private void guessANumber() {
		Scanner s  = new Scanner(System.in);
		while(true) {
			System.out.print("1���� 100������ ���� �ϳ��� ���纸����. ");
			int number_try = s.nextInt();
			count++;
			
			if(number_try > answer)	System.out.print("�� �� ���� ���Դϴ�.\n");
			else if(number_try < answer)	System.out.print("�� �� ū ���Դϴ�.\n");
			else {
				System.out.printf("%d ������ ���ڸ� ���߼̽��ϴ�.\n",count);
				break;
			}
		}
	}
	
}
