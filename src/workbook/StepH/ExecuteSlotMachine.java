package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class ExecuteSlotMachine {
	private int coins=0;
	private int number[] = new int[3];
	Scanner s = new Scanner(System.in);	
	Random generator = new Random();
	
	public ExecuteSlotMachine() {
		input();
	}
	private void input() {
		System.out.print("사용하실 코인의  개수를 입력하세요. ");
		coins  = s.nextInt();
	}
	
	public void playGame() {
		for(int i=0;i<coins;i++){
			System.out.printf("게임 %d회 start!!! (아무 숫자나 입력하세요.) ", i+1);
			int dummy = s.nextInt();
			getRandNum();
			printOutcome();
		}
		System.out.print("\n게임 종료!!\n");
	}
	private void printOutcome() {
		System.out.printf("게임 결과 : %d %d %d ----> ", number[0], number[1], number[2]);
		if(number[0]==number[1] && number[1]==number[2]) {
			System.out.print("숫자 3개 일치... 코인 4개 증정\n");
			coins = coins+4;
		}else if(number[0]==number[1] || number[1]==number[2] || number[2]==number[0]) {
			System.out.print("숫자 2개 일치... 코인 2개 증정\n");
			coins = coins+2;
		}else {
			System.out.print("꽝입니다... 아쉽군요...\n");
		}
	}
	private void getRandNum() {
		for(int i=0;i<3;i++) number[i]=generator.nextInt(9)+1;
	}
}
