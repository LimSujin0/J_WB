package workbook.StepJ;

import java.util.Scanner;

public class DayToCount {
	public DayToCount() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫번째 날짜를 입력하시오. (월 일) "); 
		int month1 = s.nextInt();
		int day1 = s.nextInt();
		System.out.print("두번째 날짜를 입력하시오. (월 일) "); 
		int month2 = s.nextInt();
		int day2 = s.nextInt();
		
		int day_b1=calcDate(month1,day1);
		int day_b2=calcDate(month2,day2);
		if(day_b1==-1 || day_b2==-1) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			int day_between = day_b1 - day_b2;
			System.out.printf("두 날짜의 간격은 %d일입니다.\n", Math.abs(day_between));			
		}
	}
	private int calcDate(int month, int day) {
		int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int day_count=0;
		
		if(month>12 || day>month_days[month]) return day_count=-1;
		
		day_count=day_count+day;
		for(int i=month-2;i>-1;i--) day_count=day_count+month_days[i];
		
		return day_count;
	}
	
}
