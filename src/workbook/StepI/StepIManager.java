package workbook.StepI;

import java.util.Scanner;

public class StepIManager {
	private int menu;
	Scanner s = new Scanner(System.in);
	public StepIManager() {
		while(true) {
			printf("---------------------------\n");
			printf("1. �޴��� �����ִ� �޼ҵ� �����\n");
			printf("2. ��ĭ�� �Բ� Ư�� ���ڸ� ������ŭ ��� �޼ҵ� �����\n");
			printf("3. �� ����\n");
			printf("4. �޴� ��ȣ �޾ƿ��� �޼ҵ� �����\n");
			printf("5. �ִ� �����ϴ� �޼ҵ� �����\n");
			printf("6. ������ ���ڸ� ����� ������ �����ϴ� �޼ҵ� �����\n");
			printf("7. ���Ǳ⿡�� ������ ���� ������ �����ϴ� �޼ҵ� �����\n");
			printf("=>���ϴ� �޴���? (0 : exit) : ");
			menu = s.nextInt();
			if(menu==0) break;
			switch(menu) {
				case 1:
					ShowingMenu sm = new ShowingMenu();
					sm.finTotalPrice();
					break;
				case 2:
					RightAngledTriangle rat = new RightAngledTriangle();
					break;
				case 3:
					DecideWhetherObesity dwo = new DecideWhetherObesity();
					break;
				case 4:
					GettingMenu gm = new GettingMenu();
					gm.finTotalPrice();
					break;
				case 5:
					SearchingMaxNum smn = new SearchingMaxNum();
					break;
				case 6:
					GenerateRandomNum grn = new GenerateRandomNum();
					grn.printTotalNum();
					break;
				case 7:
					ShowBeverageTotal sbt = new ShowBeverageTotal();
					sbt.printTotalSum();
					break;
			}
		}
	}
	private void printf(String s) {
		System.out.print(s);
	}
}
