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
		System.out.print("����Ͻ� ������  ������ �Է��ϼ���. ");
		coins  = s.nextInt();
	}
	
	public void playGame() {
		for(int i=0;i<coins;i++){
			System.out.printf("���� %dȸ start!!! (�ƹ� ���ڳ� �Է��ϼ���.) ", i+1);
			int dummy = s.nextInt();
			getRandNum();
			printOutcome();
		}
		System.out.print("\n���� ����!!\n");
	}
	private void printOutcome() {
		System.out.printf("���� ��� : %d %d %d ----> ", number[0], number[1], number[2]);
		if(number[0]==number[1] && number[1]==number[2]) {
			System.out.print("���� 3�� ��ġ... ���� 4�� ����\n");
			coins = coins+4;
		}else if(number[0]==number[1] || number[1]==number[2] || number[2]==number[0]) {
			System.out.print("���� 2�� ��ġ... ���� 2�� ����\n");
			coins = coins+2;
		}else {
			System.out.print("���Դϴ�... �ƽ�����...\n");
		}
	}
	private void getRandNum() {
		for(int i=0;i<3;i++) number[i]=generator.nextInt(9)+1;
	}
}
