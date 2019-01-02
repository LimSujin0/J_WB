package workbook.StepI;

import java.util.Scanner;

public class ShowingMenu {
	private int total_price=0;
	private int menu_user;
	private String menu_list[] = {"피자", "스파게티", "샐러드", "음료수"};
	private int menu_price[] = {15000, 10000, 7000, 2000};
	public ShowingMenu() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			showMenu();
			System.out.print("메뉴를 선택해주세요. (종류 : 5) ");
			menu_user = s.nextInt();
			if(menu_user==5) break;
			printTotalUntilNow();
		}
	}
	private void printTotalUntilNow() {
		getTotalUntilNow();
		System.out.printf("현재까지의 주문 금액은 %d원입니다.\n\n", total_price);
	}
	private void getTotalUntilNow() {
		int curr_menu_price = menu_price[menu_user-1];
		total_price = total_price + curr_menu_price;
	}
	private void showMenu() {
		for(int i=0; i<4; i++) {
			System.out.printf("%d. %s(%d원) ", i+1, menu_list[i], menu_price[i]);
		}
		System.out.println("");
	}
	
	public void finTotalPrice() {
		System.out.printf("\n\n총 주문 금액은 %d원입니다.\n", total_price);
	}
}
