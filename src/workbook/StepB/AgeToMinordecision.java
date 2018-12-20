package workbook.StepB;

import java.util.Scanner;

public class AgeToMinordecision {
	private int birth_year;
	private int age;
	private String decision;
	
	public AgeToMinordecision() { input(); }
	private void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("태어난 년도를 입력하세요");
		this.birth_year = s.nextInt();
	}
	
	public void printMinordecision() {
		System.out.print(getMinordecision());
	}
	
	
	private String getMinordecision() {
		if(getAge()<20) {
			decision = "미성년자입니다.\n";
		}else {
			decision = "미성년자가 아닙니다.\n";
		}
		return this.decision;
	}
	
	private int getAge() {
		age = 2018 - birth_year + 1;
		return age;
	}
	
}
