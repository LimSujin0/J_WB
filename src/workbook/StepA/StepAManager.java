package workbook.StepA;

import java.util.Scanner;

public class StepAManager {
	public StepAManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이계산\n");
			printf("2. 온도변환\n");
			printf("3. 직사각형 넓이계산\n");
			printf("4. 아파트 평형 계산\n");
			printf("5. 날짜계산\n");
			printf("6. 점수계산\n");
			printf("7. 파일 용량 계산\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				YearToAge yta = new YearToAge();
				yta.printAge();
				break;
			case 2:
				CelsiusToFahrenheit ctf = new CelsiusToFahrenheit();
				ctf.printTemprature();
				break;
			case 3:
				SquareToArea sta = new SquareToArea();
				sta.printArea();
				break;
			case 4:
				AreaToPyeong atp = new AreaToPyeong();
				atp.printPyeong();
				break;
			case 5:
				DayToSeconds dts = new DayToSeconds();
				dts.printSeconds();
				break;
			case 6:
				ScoreToMean stm = new ScoreToMean();
				stm.printAvareage();
				break;
			case 7:
				GigabyteToBytes gtb = new GigabyteToBytes();
				gtb.printBytes();
				break;
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}
