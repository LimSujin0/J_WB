package workbook.StepE;

import java.util.Scanner;

public class StepEManager {
	public StepEManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("----------------------------\n");
			printf("1.입력한 숫자 크기의 정사각형 출력하기\n");
			printf("2.입력한 숫자 크기의 높이를 갖는 우직각 삼각현 출력하기\n");
			printf("3.입력한 숫자 크기의 높이를 갖는 이등변 삼각형 출력하기\n");
			printf("4.홀수단 또는 짝수단의 구구단 출력하기\n");
			printf("5.홀수단 또는 짝수단의 구구단의 열의 개수를 맞추어 출력하기.\n");
			printf("6.2차원 숫자 출력하기\n");
			printf("원하는 메뉴는? (0:exit) : ");
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
