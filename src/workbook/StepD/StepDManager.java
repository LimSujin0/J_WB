package workbook.StepD;

import java.util.Scanner;

public class StepDManager {
	public StepDManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("------------------------\n");
			printf("1. 1���� ���� ���ϱ�\n");
			printf("2. �Է� ���� ���ڵ� �߿��� ���� ū ���� ���� ���� �� ���ϱ�\n");
			printf("3. �Է� ���� ���ڵ��� ���հ�� ��� �� ���ϱ�\n");
			printf("4. �̼����� ���� ����\n");
			printf("5. ���簢�� ���� ���� ����\n");
			printf("6. ����Ʈ ���� ��� �� ���� ����\n");
			printf("7. 1�� �޼ҵ��� ��ǥ ���ϱ�\n");
			printf("8. 2�� �޼ҵ��� ��ǥ ���ϱ�\n");
			printf("9. ���ϴ� �������� �� ����ϱ�\n");
			printf("10. �� ����  ��Ÿ�� ��� ����ϱ�\n");
			printf("=>���ϴ� �޴���? (0:exit) :");
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
