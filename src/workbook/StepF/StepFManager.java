package workbook.StepF;

import java.util.Scanner;

public class StepFManager {
	int menu;
	Scanner s = new Scanner(System.in);
	public StepFManager() {
		while(true) {
			printf("-------------------------\n");
			printf("1.�� ��°�� ū ���� ���� ã��\n");
			printf("2.�ɻ����� ���\n");
			printf("3.5���� ��, ��, �� 3���� ������ ���� ����, ��հ� ���ϱ�.\n");
			printf("4.5���� ��, ��, �� 3���� ������ �л��� ����, ��հ� ���ϱ�.\n");
			printf("5.�� ����\n");
			printf("6.5�� ����Ʈ�� ������ ���� ���ϱ�\n");
			printf("7.5�� ����Ʈ�� ����, ȣ���� ������ ���� ���ϱ�\n");
			printf("8.��ġ�� �ʴ� ���� 10�� �Է¹ޱ�\n");
			printf("9.�迭�� �̿��� ���� ��¥ ���\n");
			printf("=>���ϴ� �޴���? (0:exit) : ");
			menu = s.nextInt();
			if(menu==0) break;
			switch(menu){
				case 1:
					SecondLargestNum sln = new SecondLargestNum();
					sln.printSecondLargestNumber();
					break;
				case 2:
					ScoreToAverage sta = new ScoreToAverage();
					sta.printAverage();
					break;
				case 3:
					ScoreToPerSubject stps = new ScoreToPerSubject();
					stps.printPerSubject();
					break;
				case 4:
					ScoreToPerPerson stpp = new ScoreToPerPerson();
					stpp.printPerPerson();
					break;
				case 5:
					TenToObesityDecision stod = new TenToObesityDecision();
					stod.printObesityDecision();
					break;
				case 6:
					CountResident cr = new CountResident();
					cr.printTotal();
					break;
				case 7:
					CountPerFloorHo cpfh = new CountPerFloorHo();
					cpfh.printPerFloorLine();
					break;
				case 8:
					GetUniqueInput gui = new GetUniqueInput();
					gui.printNumberArray();
					break;
				case 9:
					GetAnnualDays gad = new GetAnnualDays();
					gad.printDayCount();
					break;
			}
		}
	}
	private void printf(String s) {
		System.out.print(s);
	}

}
