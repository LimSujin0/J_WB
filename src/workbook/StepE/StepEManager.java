package workbook.StepE;

import java.util.Scanner;

public class StepEManager {
	public StepEManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("----------------------------\n");
			printf("1.�Է��� ���� ũ���� ���簢�� ����ϱ�\n");
			printf("2.�Է��� ���� ũ���� ���̸� ���� ������ �ﰢ�� ����ϱ�\n");
			printf("3.�Է��� ���� ũ���� ���̸� ���� �̵ �ﰢ�� ����ϱ�\n");
			printf("4.Ȧ���� �Ǵ� ¦������ ������ ����ϱ�\n");
			printf("5.Ȧ���� �Ǵ� ¦������ �������� ���� ������ ���߾� ����ϱ�.\n");
			printf("6.2���� ���� ����ϱ�\n");
			printf("���ϴ� �޴���? (0:exit) : ");
			menu = s.nextInt();
			if(menu==0) break;
			switch(menu) {
				case 1 :
					InputToSquare its = new InputToSquare();
					its.printSquare();
					break;
				case 2:
					InputToRighttriangle itr = new InputToRighttriangle();
					itr.printRighttriangle();
					break;
				case 3:
					InputToIsosceles iti = new InputToIsosceles();
					iti.printIsosceles();
					break;
				case 4:
					OddorEvenMultiplication oem = new OddorEvenMultiplication();
					oem.printMultiplication();
					break;
				case 5:
					OddEvenAndColumn oear = new OddEvenAndColumn();
					oear.printColumnMultiplication();
					break;
				case 6:
					InputToTwodimensional itt = new InputToTwodimensional();
					itt.printTwoDimensional();
					break;
			}
		}
	}

	private void printf(String s) {
		System.out.print(s);
	}
}
