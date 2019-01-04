package workbook.StepL;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ParkingSpot {
	Scanner s = new Scanner(System.in);
	int car_num;
	String car_sort;
	int spot_num;
	String input_time;
	
	SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-dd hh:mm", Locale.KOREA);	
	public ParkingSpot(int spot_num) {
		this.spot_num = spot_num;
		input();
	}
	void input() {
		System.out.print("������ ���� ��ȣ�� ������ �Է��ϼ���. ");
		car_num = s.nextInt();
		car_sort = s.next();
		input_time = f.format(new Date());
		System.out.print(input_time);
	}
	void print() {
		System.out.printf("[%d��] %d  %s  %s\n", spot_num, car_num, car_sort, input_time);
	}
}
