package workbook.StepC;

import java.util.Scanner; 

public class StepCManager {
		public StepCManager() {
			int menu;
			Scanner s = new Scanner(System.in);
			while(true) {
				printf("------------------------\n");
				printf("1. ���� ��� �� ���ɴ� ����\n");
				printf("2. ���� �µ� ���� ����\n");
				printf("3. ���簢�� ���� ����\n");
				printf("4. ����Ʈ ���� ��� �� ���� ����\n");
				printf("5. ���� ��¥ ���\n");
				printf("6. ���� ���\n");
				printf("7. ���� ���� �ð� ���\n");
				printf("8. 3���� �� �� �ִ񰪰� �ּڰ� ���ϱ�\n");
				printf("9. �ҵ漼 ���\n");
				printf("10. ������ ��Ģ���� ����\n");
				printf("11. ���� �����ϱ�\n");
				printf("=>���ϴ� �޴���? (0:exit) :");
				menu = s.nextInt();
				if(menu==0) break;
				switch(menu) {
					case 1:
						YearToAgegroup ytg = new YearToAgegroup();
						ytg.printAgegroup();
						break;
					case 2:
						TempToWatergroup ttw = new TempToWatergroup();
						ttw.printWatergroup();
						break;
					case 3:
						SquareToShapedecision sts = new SquareToShapedecision();
						sts.printShaperdecision();
						break;
					case 4:
						PyeongToApartmentgroup pta = new PyeongToApartmentgroup();
						pta.printApartmentdecision();
						break;
					case 5:
						MonthToDayth mtd = new MonthToDayth();
						mtd.printDayth();
						break;
					case 6:
						ScoreToGrade stg = new ScoreToGrade();
						stg.printGrade();
						break;
					case 7:
						FileToTransfertime ftt = new FileToTransfertime();
						ftt.printTransfertime();
						break;
					case 8:
						ThreenumToMaxMin ttmm = new ThreenumToMaxMin();
						ttmm.printMaxMin();
						break;
					case 9:
						AnnualincomeToTax att = new AnnualincomeToTax();
						att.printTax();
						break;
					case 10:
						SimpleFourarithmetic sf = new SimpleFourarithmetic();
						sf.printResult();
						break;
					case 11:
						CheckLeapyear cl = new CheckLeapyear();
						cl.printLeapyear();
						break;
				}
			}
		}
		
		
		private void printf(String s){
			System.out.print(s);
		}
	
}
