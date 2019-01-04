package workbook.StepL;

import java.util.Scanner;

public class Student {
	String name;
	String student_number;
	String sex;
	String address;
	String phone_number;
	String returning;
	
	Scanner s = new Scanner(System.in);
	public Student() {
		input();
	}
	private void input() {
		System.out.print("학생이름, 학번, 성별을 입력하세요 : ");
		name =s.next();
		student_number = s.next();
		sex = s.nextLine();
		
		System.out.print("주소를 입력하세요 : ");
		address = s.nextLine();
		System.out.print("전화번호를 입력하세요 : ");
		phone_number = s.next();
		System.out.print("복학생입니까?(Y/N) ");
		returning = s.next();
	}
	
	void print(int i) {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", i, name, student_number, sex, address, phone_number, returning);
	}
	
}
