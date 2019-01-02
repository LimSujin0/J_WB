package workbook.StepI;

import java.util.Scanner;

public class GettingMenu {
	private int total_price=0;
	private int menu_user;
	private String menu_list[] = {"����", "���İ�Ƽ", "������", "�����"};
	private int menu_price[] = {15000, 10000, 7000, 2000};
	public GettingMenu() {
		input();
	}
	private void input() {
		while(true) {
			showMenu();
			if(SelectMenu()==-1) break;
			printTotalUntilNow();
		}
	}
	private int SelectMenu() {
		Scanner s = new Scanner(System.in);
		System.out.print("�޴��� �������ּ���. (���� : 5) ");
		menu_user = s.nextInt();
		if(menu_user==5) menu_user=-1;
		return menu_user;
	}
	private void printTotalUntilNow() {
		getTotalUntilNow();
		System.out.printf("��������� �ֹ� �ݾ��� %d���Դϴ�.\n\n", total_price);
	}
	private void getTotalUntilNow() {
		int curr_menu_price = menu_price[menu_user-1];
		total_price = total_price + curr_menu_price;
	}
	private void showMenu() {
		for(int i=0; i<4; i++) {
			System.out.printf("%d. %s(%d��) ", i+1, menu_list[i], menu_price[i]);
		}
		System.out.println("");
	}
	
	public void finTotalPrice() {
		System.out.printf("\n\n�� �ֹ� �ݾ��� %d���Դϴ�.\n", total_price);
	}
}

