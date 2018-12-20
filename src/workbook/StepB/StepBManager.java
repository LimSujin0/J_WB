package workbook.StepB;

import java.util.Scanner;

public class StepBManager {
	public StepBManager(){
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. ���̰�� �� �̼����� ����\n");
			printf("2. �µ� ��ȣ ��ȯ\n");
			printf("3. ���簢�� ���̰�� �� ���簢�� ����\n");
			printf("4. ����Ʈ ���� ��� �� ���� ����\n");
			printf("5. ��¥ ���\n");
			printf("6. ���� ���\n");
			printf("7. ���� ���� �ð� ���\n");
			printf("8. �پ��� ���� ����\n");
			printf("9. �� ����\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu){
				case 1 :
					AgeToMinordecision atm = new AgeToMinordecision();
					atm.printMinordecision();
					break;
				case 2 :
					DegreeToTemperature dtt = new DegreeToTemperature();
					dtt.printTemperature();
					break;
				case 3 :
					AreaToSquaredecision ats = new AreaToSquaredecision();
					ats.printSquaredecision();
					break;
				case 4:
					PyeongToSizedecision pts = new PyeongToSizedecision();
					pts.printSizedecision();
					break;
				case 5 :
					DayToSeconds dts = new DayToSeconds();
					dts.printSecondsAndDecision();
					break;
				case 6:
					ScoreToDecision std = new ScoreToDecision();
					std.printScoreAndDecision();
					break;
				case 7 :
					MegabytesToSpeed mts = new MegabytesToSpeed();
					mts.printTransferTime();
					break;
				case 8 :
					ThreenumToCondition ttc = new ThreenumToCondition();
					ttc.printCondition();
					break;
				case 9:
					WeightToObesitydecision wto = new WeightToObesitydecision();
					wto.printObesity();
					break;
			}
		}
	}

	private void printf(String s) {
		System.out.print(s);
	}
}
