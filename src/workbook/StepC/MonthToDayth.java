package workbook.StepC;

import java.util.Scanner;

public class MonthToDayth {
	//initialize
	private int month, day, day_count;
	
	//constructor
	public MonthToDayth() { input();}
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�. ");
		month = s.nextInt();
		System.out.print("���� �Է��Ͻÿ�. ");
		day = s.nextInt();
	}
	
	//print Dayth
	public void printDayth() {
		if(!checkValid()) 
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		else
			System.out.printf("�� ��¥�� 1�� �� %d ��° ���� �ش�˴ϴ�.\n", getDath());
	}
	
	private boolean checkValid() {
		if(month>12) return false;
		else if(month==2 && day>28) return false;
		else if((month==1||month==3||month==5||month==7||month==8||month==10||month==12) 
				&& day>31) return false;
		else if((month==4||month==6||month==9||month==11)
				&& day>30) return false;
		
		return true;
	}
	
	private int getDath() {
		int odd=0, even=0, second=0;
		while(month>1) {
			month--;
			if(month==2) second++;
			else if(month<8 && month%2==0) even++;
			else if(month<8 && month%2!=0) odd++;
			else if(month>=8 && month%2==0) odd++;
			else even++;
		}
		System.out.printf("%d, %d, %d\n",second, even, odd);
		day_count = second*28 + even*30 + odd*31 + day;
		
		return day_count;
	}
	
}
