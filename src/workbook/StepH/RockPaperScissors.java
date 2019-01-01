package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	private int com_finger;
	private int my_finger;
	private int score[][] = new int[2][3];
	Random generator = new Random();
	
	public RockPaperScissors() {
		input();
	}
	private void input() {
		while(true) {
			getUserFinger();
			if(my_finger==0) break;
			getComputerFinger();
			printOutcome();			
		}
	}
	private void printOutcome() {
		String[] rock_paper_scissors = {"가위","바위","보"};
		System.out.printf("컴퓨터가 낸 것은 %s입니다. ------> ", rock_paper_scissors[com_finger-1]);
		if(com_finger==my_finger) {
			score[0][1]++;
			score[1][1]++;
			System.out.print("비김~!\n");
		}else if((com_finger==1&&my_finger==2)|| 
				(com_finger==2&&my_finger==3)|| 
				(com_finger==3&&my_finger==1)) {
			score[0][2]++;
			score[1][0]++;
			System.out.print("사용자 승!\n");			
		}else {
			score[0][0]++;
			score[1][2]++;
			System.out.print("컴퓨터 승!\n");
		}
	}
	private void getUserFinger() {
		Scanner s = new Scanner(System.in);
		System.out.print("\n가위(1), 바위(2), 보(3)를 입력하세요. ");
		my_finger = s.nextInt();
	}
	private void getComputerFinger() {
		com_finger = generator.nextInt(3)+1;
	}
	
	public void printFinalOutcome() {
		System.out.printf("컴퓨터 : 이긴 횟수는 %d회, 진 횟수 %d회, 비긴 횟수는 %d 입니다.\n", score[0][0], score[0][2], score[0][1]);
		System.out.printf("사용자 : 이긴 횟수는 %d회, 진 횟수 %d회, 비긴 횟수는 %d 입니다.\n", score[1][0], score[1][2], score[1][1]);
	}
}
