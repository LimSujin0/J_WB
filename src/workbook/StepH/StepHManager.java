package workbook.StepH;

import java.util.Scanner;

public class StepHManager {
	private int menu;
	Scanner s = new Scanner(System.in);
	public StepHManager() {
		while(true) {
			printf("---------------------------\n");
			printf("1. 숫자 알아 맞추기\n");
			printf("2. 로또 번호 만들기\n");
			printf("3. 로또 번호 당첨 확인하기\n");
			printf("4. 가위바위보 게임하기\n");
			printf("5. 슬롯머신 만들기\n");
			printf("6. 5개 숫자의 제곱수 조합 구하기\n");
			printf("7. 문자의 개수와 나누어 출력하기\n");
			printf("8. 문자열 바꾸기\n");
			printf("9. 사용자 정보 출력하기\n");
			printf("=>원하는 메뉴는? (0 : exit) : ");
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
