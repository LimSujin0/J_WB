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
		System.out.print("�л��̸�, �й�, ������ �Է��ϼ��� : ");
		name =s.next();
		student_number = s.next();
		sex = s.nextLine();
		
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		address = s.nextLine();
		System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
		phone_number = s.next();
		System.out.print("���л��Դϱ�?(Y/N) ");
		returning = s.next();
	}
	
	void print(int i) {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", i, name, student_number, sex, address, phone_number, returning);
	}
	
}
