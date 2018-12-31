package workbook.StepG;

import java.util.Scanner;

public class StepGManager {
	int menu = 0;
	Scanner s = new Scanner(System.in);
	public StepGManager() {
		while(true){
			printf("-------------------------\n");
			printf("1.���� ��� �� ���ɴ� ����\n");
			printf("2.���� �µ� ���� ����\n");
			printf("3.���� ���\n");
			printf("4.�ε��� �߰� ������ ���\n");
			printf("5.PC�� �̿�� ����\n");
			printf("6.���θ� ���� ����\n");
			printf("7.���̰��� ��ǥ��\n");
			printf("=>���ϴ� �޴���? (0:exit) : ");
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
