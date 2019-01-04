package workbook.StepL;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Table {
	int guest_num=0;
	int charge=0;
	int[] menu_count= new int[3];
	int[] menu_price= {25000, 15000, 17000};
	String membership="N";
	String entry_time;
	
	SimpleDateFormat f = new SimpleDateFormat("YYYY�� MM�� dd��  hh:mm", Locale.KOREA);
	public Table() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("�մ� ���� �Է��ϼ��� : ");
		guest_num = s.nextInt();
		System.out.print("������ũ, ���İ�Ƽ, �Ľ�Ÿ�� ������ �Է��ϼ��� : ");
		for(int i=0;i<3;i++) menu_count[i] = s.nextInt();
		System.out.print("����� ī�尡 �ֽ��ϱ�?(Y:����) ");
		membership = s.next();
		
		entry_time = f.format(new Date());
		System.out.printf("������ �ð��� %s �Դϴ�.\n", entry_time);
		System.out.printf("�� �ݾ��� %d �� �Դϴ�.", getCharge());
	}
	private int getCharge() {
		for(int i=0;i<3;i++) charge = charge + menu_price[i]*menu_count[i];
		
		if(membership.equalsIgnoreCase("y")) charge = (int) (charge*0.9);
		
		if(charge<100000) charge = (int)(charge*1.07);
		else charge = (int)(charge*1.1);
		
		charge = (int) (charge*1.1);
		
		return charge;
	}
	
	public void print(int i) {
		System.out.printf("[%d]\t%d\t%d\t%d\t%d\t%s\t%s\n",i, guest_num,menu_count[0],menu_count[1],menu_count[2],membership,entry_time);
	}
}

