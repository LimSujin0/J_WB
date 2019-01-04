package workbook.StepL;

import java.util.Scanner;

public class StepLManager {
	private int menu;
	Scanner s = new Scanner(System.in);
	public StepLManager() {
		while(true) {
			printf("---------------------------\n");
			printf("1. 메뉴판 저장하기 \n");
			printf("2. 주차장 입출력 관리\n");
			printf("3. 식당 주문 관리\n");
			printf("4. 학생 정보 관리\n");
			printf("=>원하는 메뉴는? (0 : exit) : ");
			menu = s.nextInt();
			if(menu==0) break;
			switch(menu) {
				case 1:
					SaveMenu sm = new SaveMenu();
					break;
				case 2:
					ParkingInOut pio = new ParkingInOut();
					break;
				case 3:
					RestaurantCounter rc = new RestaurantCounter();
					break;
				case 4:
					StudentInformAdmin sif = new StudentInformAdmin();
					
			}
		}
	}
	private void printf(String s) {
		System.out.print(s);
	}
	
	
}
