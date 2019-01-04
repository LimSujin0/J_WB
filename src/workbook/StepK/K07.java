package workbook.StepK;

import java.util.Scanner;

public class K07 {
	public K07() {
		Scanner s = new Scanner(System.in);
		System.out.print("등록할 학생의 명수는? ");
		int total = s.nextInt();
		
		Student[] st = new Student[total];
		for(int i=0;i<total;i++) {
			st[i] = new Student();
			st[i].count = i+1;
			st[i].input();
		}
		st[0].printFirst();
		for(int i=0;i<total;i++) st[i].print();		
	}
}
