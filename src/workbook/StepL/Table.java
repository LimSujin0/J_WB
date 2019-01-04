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
	
	SimpleDateFormat f = new SimpleDateFormat("YYYY년 MM월 dd일  hh:mm", Locale.KOREA);
	public Table() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("손님 수를 입력하세요 : ");
		guest_num = s.nextInt();
		System.out.print("스테이크, 스파게티, 파스타의 개수를 입력하세요 : ");
		for(int i=0;i<3;i++) menu_count[i] = s.nextInt();
		System.out.print("멤버쉽 카드가 있습니까?(Y:있음) ");
		membership = s.next();
		
		entry_time = f.format(new Date());
		System.out.printf("들어오신 시간은 %s 입니다.\n", entry_time);
		System.out.printf("총 금액은 %d 원 입니다.", getCharge());
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

