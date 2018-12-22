package workbook.StepD;

import java.util.Scanner;

public class StepDManager {
	public StepDManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("------------------------\n");
			printf("1. 1부터 숫자 더하기\n");
			printf("2. 입력 받은 숫자들 중에서 가장 큰 수와 가장 작은 수 구하기\n");
			printf("3. 입력 받은 숫자들의 총합계와 평균 값 구하기\n");
			printf("4. 미성년자 숫자 세기\n");
			printf("5. 직사각형 형태 개수 세기\n");
			printf("6. 아파트 평형 계산 및 종류 판정\n");
			printf("7. 1차 메소드의 좌표 구하기\n");
			printf("8. 2차 메소드의 좌표 구하기\n");
			printf("9. 원하는 구구단의 단 출력하기\n");
			printf("10. 두 수의  배타적 배수 출력하기\n");
			printf("=>원하는 메뉴는? (0:exit) :");
			menu = s.nextInt();
			if(menu==0) break;
			switch(menu) {
				case 1:
					AddFromOne afo = new AddFromOne();
					afo.printTotal();
					break;
				case 2:
					InputToMaxMin itmm = new InputToMaxMin();
					itmm.printMaxMin();
					break;
				case 3:
					InputToTotalAverage itta = new InputToTotalAverage();
					itta.printTotalAverage();
					break;
				case 4:
					YearToMinorcount ytm = new YearToMinorcount(); 
					ytm.printMinorcount();
					break;
				case 5:
					SquareToGroupcount stg = new SquareToGroupcount();
					stg.printSquareGroupcount();
					break;
				case 6:
					PyeongToGroupcount ptg = new PyeongToGroupcount();
					ptg.printApartGroupcount();
					break;
				case 7:
					SimpleEquationToCoordinate setc = new SimpleEquationToCoordinate();
					setc.printSimpleCoordinate();
					break;
				case 8:
					QuadraticEquationToCoordinate qetc = new QuadraticEquationToCoordinate();
					qetc.printQuadraticCoordinate();
					break;
				case 9:
					NumberToMultable ntm = new NumberToMultable();
					ntm.printMultable();
					break;
				case 10:
					TwonumToExclusivemul tte = new TwonumToExclusivemul();
					tte.printExclusivemul();
					break;
			}
		}
	}
		
	private void printf(String s){
		System.out.print(s);
	}
}
