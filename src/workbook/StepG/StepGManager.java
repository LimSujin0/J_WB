package workbook.StepG;

import java.util.Scanner;

public class StepGManager {
	int menu = 0;
	Scanner s = new Scanner(System.in);
	public StepGManager() {
		while(true){
			printf("-------------------------\n");
			printf("1.나이 계산 및 연령대 판정\n");
			printf("2.물의 온도 구간 판정\n");
			printf("3.점수 계산\n");
			printf("4.부동산 중계 수수로 계산\n");
			printf("5.PC방 이용료 계산기\n");
			printf("6.쇼핑몰 매출 계산기\n");
			printf("7.놀이공원 매표소\n");
			printf("=>원하는 메뉴는? (0:exit) : ");
			menu = s.nextInt();
			if(menu==0) break;
			switch(menu){
			case 1:
				AgeToAgegroupDecision atad = new AgeToAgegroupDecision();
				atad.printAgeGroup();
				break;
			case 2:
				TempToSection tts = new TempToSection();
				tts.printTempSection();
				break;
			case 3:
				ScoreToPer stp = new ScoreToPer();
				stp.printScorePerSubStd();
				break;
			case 4:
				RealestateComission rc = new RealestateComission();
				rc.printTotalCharge();
				break;
			case 5:
				InternetCafeCharge icf = new InternetCafeCharge();
				icf.printTotalCharge();
				break;
			case 6:
				MallAccountSale mas = new MallAccountSale();
				mas.printTotalSale();
				break;
			case 7:
				AmusementTicketOffice ato = new AmusementTicketOffice();
				ato.printVisitorFee();
				break;
			}
		}
	}

	private void printf(String s) {
		System.out.print(s);
	}
}
