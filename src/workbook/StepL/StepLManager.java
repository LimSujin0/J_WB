package workbook.StepL;

import java.util.Scanner;

public class StepLManager {
	private int menu;
	Scanner s = new Scanner(System.in);
	public StepLManager() {
		while(true) {
			printf("---------------------------\n");
			printf("1. �޴��� �����ϱ� \n");
			printf("2. ������ ����� ����\n");
			printf("3. �Ĵ� �ֹ� ����\n");
			printf("4. �л� ���� ����\n");
			printf("=>���ϴ� �޴���? (0 : exit) : ");
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
