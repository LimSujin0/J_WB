package workbook.StepI;

import java.util.Scanner;

public class StepIManager {
	private int menu;
	Scanner s = new Scanner(System.in);
	public StepIManager() {
		while(true) {
			printf("---------------------------\n");
			printf("1. 메뉴판 보여주는 메소드 만들기\n");
			printf("2. 빈칸과 함께 특정 문자를 개수만큼 찍는 메소드 만들기\n");
			printf("3. 비만 판정\n");
			printf("4. 메뉴 번호 받아오는 메소드 만들기\n");
			printf("5. 최댓값 리턴하는 메소드 만들기\n");
			printf("6. 임의의 숫자를 만들어 구간을 리턴하는 메소드 만들기\n");
			printf("7. 자판기에서 선택한 음료 가격을 리턴하는 메소드 만들기\n");
			printf("=>원하는 메뉴는? (0 : exit) : ");
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
