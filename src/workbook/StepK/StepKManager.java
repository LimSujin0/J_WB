package workbook.StepK;

import java.util.Scanner;

public class StepKManager {
	private int menu;
	Scanner s = new Scanner(System.in);
	public StepKManager() {
		while(true) {
			printf("---------------------------\n");
			printf("1. 메뉴판 저장하기 1\n");
			printf("2. 메뉴판 저장하기 2\n");
			printf("3. 좌표 저장하기 1\n");
			printf("4. 좌표 저장하기 2\n");
			printf("5. 사용자 목록 저장하기 1\n");
			printf("6. 사용자 목록 저장하기 2\n");
			printf("7. 학생 점수 결과 저장하기\n");
			printf("=>원하는 메뉴는? (0 : exit) : ");
			menu = s.nextInt();
			if(menu==0) break;
			switch(menu) {
				case 1:
					K01 kone = new K01();
					break;
				case 2:
					K02 ktwo = new K02();
					break;
				case 3:
					K03 kthree = new K03();
					break;
				case 4:
					K04 kfour = new K04();
					break;
				case 5:
					K05 kfive = new K05();
					break;
				case 6:
					K06 ksix = new K06();
					break;
				case 7:
					K07 ksever = new K07();
					break;
			}
		}
	}
	private void printf(String s) {
		System.out.print(s);
	}
}
