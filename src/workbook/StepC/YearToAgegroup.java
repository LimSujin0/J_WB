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
		System.out.print("�¾ �⵵�� �Է��ϼ���. ");
		birth_year = s.nextInt();
	}
	
	//print age group
	public void printAgegroup() {
		System.out.print(getAgegroup(getAge()));
	}
	
	private String getAgegroup(int age) {
		String age_group;
		if(age<7) age_group = "�����Դϴ�.\n";
		else if(age<13) age_group = "����Դϴ�.\n";
		else if(age<20) age_group = "û�ҳ��Դϴ�.\n";
		else if(age<30) age_group = "û���Դϴ�.\n";
		else if(age<60) age_group = "�߳��Դϴ�.\n";
		else age_group = "����Դϴ�.\n";
		
		return age_group;
	}
	
	private int getAge() {
		age = 2018 - birth_year + 1;
		return age;
	}
}
