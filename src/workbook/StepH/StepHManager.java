package workbook.StepH;

import java.util.Scanner;

public class StepHManager {
	private int menu;
	Scanner s = new Scanner(System.in);
	public StepHManager() {
		while(true) {
			printf("---------------------------\n");
			printf("1. ���� �˾� ���߱�\n");
			printf("2. �ζ� ��ȣ �����\n");
			printf("3. �ζ� ��ȣ ��÷ Ȯ���ϱ�\n");
			printf("4. ���������� �����ϱ�\n");
			printf("5. ���Ըӽ� �����\n");
			printf("6. 5�� ������ ������ ���� ���ϱ�\n");
			printf("7. ������ ������ ������ ����ϱ�\n");
			printf("8. ���ڿ� �ٲٱ�\n");
			printf("9. ����� ���� ����ϱ�\n");
			printf("=>���ϴ� �޴���? (0 : exit) : ");
			menu = s.nextInt();
			if(menu==0) break;
			switch(menu) {
				case 1:
					GuessANumber gan = new GuessANumber();  
					break;
				case 2:
					MakeLottoNum mln = new MakeLottoNum();
					break;
				case 3:
					CheckLottoNum cln = new CheckLottoNum();
					cln.printCoincidecetLottoNumber();
					break;
				case 4:
					RockPaperScissors rps = new RockPaperScissors();
					rps.printFinalOutcome();
					break;
				case 5:
					ExecuteSlotMachine esm = new ExecuteSlotMachine();
					esm.playGame();
					break;
				case 6:
					SquareNumCombination snc = new SquareNumCombination();
					snc.printMinMaxSquareNum();
					break;
				case 7:
					PrintStringSplit psp = new PrintStringSplit();
					break;
				case 8:
					ChangeToString cts = new ChangeToString();
					break;
				case 9:
					ExtractUserInfo euf = new ExtractUserInfo();
					break;
					
					
					
			}
		}
	}
	private void printf(String s) {
		System.out.print(s);
	}
}
