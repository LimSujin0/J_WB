package workbook.StepB;

import java.util.Scanner;

public class AgeToMinordecision {
	private int birth_year;
	private int age;
	private String decision;
	
	public AgeToMinordecision() { input(); }
	private void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�¾ �⵵�� �Է��ϼ���");
		this.birth_year = s.nextInt();
	}
	
	public void printMinordecision() {
		System.out.print(getMinordecision());
	}
	
	
	private String getMinordecision() {
		if(getAge()<20) {
			decision = "�̼������Դϴ�.\n";
		}else {
			decision = "�̼����ڰ� �ƴմϴ�.\n";
		}
		return this.decision;
	}
	
	private int getAge() {
		age = 2018 - birth_year + 1;
		return age;
	}
	
}
