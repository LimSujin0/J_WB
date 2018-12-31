package workbook.StepG;

import java.util.Scanner;

public class InternetCafeCharge {
	private int hour, minute;
	private int total_charge=0;
	
	public InternetCafeCharge() {
		input();
	}
	private void input() {
		Scanner s  = new Scanner(System.in);
		while(true) {
			System.out.print("사용한 시간을 시간과 분으로 입력하세요. : ");
			hour = s.nextInt();
			minute = s.nextInt();
			if(hour==0&&minute==0) break;
			System.out.printf("고객님의 이용료는 %d입니다.\n", getCharge());			
		}
	}
	
	private int getCharge() {
		int per_minute = 0;
		if(minute>0 && minute<30) per_minute = hour*2 + 1;
		else if(minute>=30 && minute<60) per_minute = hour*2 + 2;
		else per_minute = hour*2;
		
		int charge = per_minute*1000;
		if(hour>=2 && hour<3) charge=(int) (charge*0.95);
		else if(hour>=3 && hour<5) charge= (int) (charge*0.9);
		else if(hour>=5) charge=(int) (charge*0.8);
		
		total_charge = total_charge + charge;
		return charge;
	}
	
	public void printTotalCharge() {
		System.out.printf("\n지금까지의 이용료 총금액은 %d입니다.\n", total_charge);
	}
	
}
