package workbook.StepK;

import java.util.Scanner;

public class MenuPan {
	int number;
	String name;
	String origin;
	int price;
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("�޴��� ��ȣ, �޴���, ������, ������ �Է��Ͻÿ�. ");
		number = s.nextInt();
		name = s.next();
		origin = s.next();
		price = s.nextInt();
	}
	void print_first() {
		System.out.print("==============================\n");
		System.out.printf("�޴���ȣ\t�޴��̸�\t������\t1�κа���\n");
	}
	void print_menu() {
		System.out.printf("%d\t%s\t%s\t%d\n", number, name, origin, price);	
	}
	
}
