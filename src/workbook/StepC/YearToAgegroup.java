package workbook.StepC;

import java.util.Scanner;

public class YearToAgegroup {
	//initialize
	private int birth_year;
	private int age;
	
	//constructor
	public YearToAgegroup() { input();}
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하세요. ");
		birth_year = s.nextInt();
	}
	
	//print age group
	public void printAgegroup() {
		System.out.print(getAgegroup(getAge()));
	}
	
	private String getAgegroup(int age) {
		String age_group;
		if(age<7) age_group = "유아입니다.\n";
		else if(age<13) age_group = "어린이입니다.\n";
		else if(age<20) age_group = "청소년입니다.\n";
		else if(age<30) age_group = "청년입니다.\n";
		else if(age<60) age_group = "중년입니다.\n";
		else age_group = "노년입니다.\n";
		
		return age_group;
	}
	
	private int getAge() {
		age = 2018 - birth_year + 1;
		return age;
	}
}
