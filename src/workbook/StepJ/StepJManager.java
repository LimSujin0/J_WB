package workbook.StepJ;

import java.util.Scanner;

public class StepJManager {
	private int menu;
	Scanner s = new Scanner(System.in);
	public StepJManager() {
		while(true) {
			printf("---------------------------\n");
			printf("1. ���� ��� �� ���ɴ� ����\n");
			printf("2. �ɻ����� ���\n");
			printf("3. ���� �µ� ���� ���� ����\n");
			printf("4. ���� ��¥ ��� �޼ҵ带 �̿��� ��¥ ���� ����\n");
			printf("5. ���� ���� �ý���\n");
			printf("6. �Ǻ���ġ �� ���ϱ�\n");
			printf("7. 2�� ������ ���ϱ�\n");
			printf("8. Ackermann �� ���ϱ�\n");
			printf("9. pow() �޼ҵ� �����\n");
			printf("10. �Ǻ���ġ ������ Ȳ�ݺ��� ���ϱ�\n");
			printf("=>���ϴ� �޴���? (0 : exit) : ");
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
