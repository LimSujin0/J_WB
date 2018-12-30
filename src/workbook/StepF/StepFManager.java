package workbook.StepF;

import java.util.Scanner;

public class StepFManager {
	int menu;
	Scanner s = new Scanner(System.in);
	public StepFManager() {
		while(true) {
			printf("-------------------------\n");
			printf("1.두 번째로 큰 수의 순서 찾기\n");
			printf("2.심사점수 계산\n");
			printf("3.5명의 국, 영, 수 3과목 점수의 과목별 총점, 평균값 구하기.\n");
			printf("4.5명의 국, 영, 수 3과목 점수의 학생별 총점, 평균값 구하기.\n");
			printf("5.비만 판정\n");
			printf("6.5층 아파트의 거주자 숫자 구하기\n");
			printf("7.5층 아파트의 층별, 호수별 거주자 숫자 구하기\n");
			printf("8.겹치지 않는 숫자 10개 입력받기\n");
			printf("9.배열을 이용한 연중 날짜 계산\n");
			printf("=>원하는 메뉴는? (0:exit) : ");
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
