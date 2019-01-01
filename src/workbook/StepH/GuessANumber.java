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
			System.out.print("1부터 100까지의 숫자 하나를 맞춰보세요. ");
			int number_try = s.nextInt();
			count++;
			
			if(number_try > answer)	System.out.print("좀 더 작은 수입니다.\n");
			else if(number_try < answer)	System.out.print("좀 더 큰 수입니다.\n");
			else {
				System.out.printf("%d 번만에 숫자를 맞추셨습니다.\n",count);
				break;
			}
		}
	}
	
}
