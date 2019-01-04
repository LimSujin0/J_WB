package workbook.StepJ;

import java.util.Scanner;

public class StepJManager {
	private int menu;
	Scanner s = new Scanner(System.in);
	public StepJManager() {
		while(true) {
			printf("---------------------------\n");
			printf("1. 나이 계산 및 연령대 판정\n");
			printf("2. 심사점수 계산\n");
			printf("3. 물의 온도 구간 개수 판정\n");
			printf("4. 연중 날짜 계산 메소드를 이용한 날짜 간격 세기\n");
			printf("5. 주차 관리 시스템\n");
			printf("6. 피보나치 수 구하기\n");
			printf("7. 2의 제곱수 구하기\n");
			printf("8. Ackermann 수 구하기\n");
			printf("9. pow() 메소드 만들기\n");
			printf("10. 피보나치 수열로 황금비율 구하기\n");
			printf("=>원하는 메뉴는? (0 : exit) : ");
			menu = s.nextInt();
			if(menu==0) break;
			switch(menu) {
				case 1:
					AgeToAgegroup ata = new AgeToAgegroup();
					ata.printGroupNum();
					break;
				case 2:
					ScoreToAverage sta = new ScoreToAverage();
					break;
				case 3:
					WatertempToSection wts = new WatertempToSection();
					wts.printResult();
					break;
				case 4:
					DayToCount dtc = new DayToCount();
					break;
				case 5:
					ParkingFeeSystem pfs = new ParkingFeeSystem();
					pfs.printTotalFee();
					break;
				case 6:
					FibonacciToTwenty ftt = new FibonacciToTwenty();
					break;
				case 7:
					PowerOfTwo pof = new PowerOfTwo();
					break;
				case 8:
					AckermannFunctionA afa = new AckermannFunctionA();
					break;
				case 9:
					PowerOfN pon = new PowerOfN();
					break;
				case 10:
					FibonacciToGoldenratio ftg = new FibonacciToGoldenratio();
					break;
			}
		}
	}
	private void printf(String s) {
		System.out.print(s);
	}
}
