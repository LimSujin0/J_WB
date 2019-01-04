package workbook.StepK;

import java.util.Scanner;

public class MenuPan {
	int number;
	String name;
	String origin;
	int price;
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("메뉴의 번호, 메뉴명, 원산지, 가격을 입력하시오. ");
		number = s.nextInt();
		name = s.next();
		origin = s.next();
		price = s.nextInt();
	}
	void print_first() {
		System.out.print("==============================\n");
		System.out.printf("메뉴번호\t메뉴이름\t원산지\t1인분가격\n");
	}
	void print_menu() {
		System.out.printf("%d\t%s\t%s\t%d\n", number, name, origin, price);	
	}
	
}
