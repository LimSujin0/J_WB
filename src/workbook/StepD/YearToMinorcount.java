package workbook.StepD;

import java.util.Scanner;

public class YearToMinorcount {
	//initialize
	private int count_all, count_young;
	private int birth_year, age;
	private int i;
	//constructor
	public YearToMinorcount() {input();}
	private void input() {
		getAllnum();
		getYear();
	}
	private void getAllnum() {
		Scanner s = new Scanner(System.in);
		System.out.print("������ �� ������ �Է��ϼ���.");
		count_all = s.nextInt();
	}
	private void getYear() {
		Scanner s = new Scanner(System.in);
		for(i=0; i<count_all; i++) {
			System.out.print("�¾ �絵�� �Է��ϼ���. ");
			birth_year = s.nextInt();
			countYoung();
		}
	}
	private void countYoung() {
		age = 2018 - birth_year + 1;
		if(age<20)  count_young++;
	}
	
	//print counting minor
	public void printMinorcount() {
		System.out.printf("������ �߿� �̼����ڴ� ��� %d���Դϴ�.\n", count_young);
	}
	
}
