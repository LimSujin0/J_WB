package workbook.StepF;

import java.util.Scanner;

public class GetAnnualDays {
	private int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	private int month, day;
	private int day_count=0;
	private int i;
	//constructor
	public GetAnnualDays() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("월을 입력하시오. ");
		month = s.nextInt();
		System.out.print("일을 입력하시오. ");
		day = s.nextInt();
	}
	//print day
	public void printDayCount() {
		if(checkAvailaleDay()) {
			getDayCount();
			System.out.printf("이 날짜는 1년 중 %d번째 날에 해당됩니다.\n", day_count);
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}
	private boolean checkAvailaleDay() {
		if(month>12) return false;
		else if(month==2 && day>28) return false;
		else if((month==1||month==3||month==5||month==7||month==8||month==10||month==12) 
				&& day>31) return false;
		else if((month==4||month==6||month==9||month==11)
				&& day>30) return false;
		return true;
	}
	private void getDayCount() {
		for(i=month; i>0; i--) {
			if(i==month)	day_count = day_count + day;
			else	day_count  = day_count + monthdays[i-1];
		}
	}
}
