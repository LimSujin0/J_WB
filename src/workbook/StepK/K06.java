package workbook.StepK;

import java.util.Scanner;

public class K06 {
	public K06() {
		Scanner s = new Scanner(System.in);
		System.out.print("등록할 학생의 명수는? ");
		int total = s.nextInt();
		
		UserInfo[] ui = new UserInfo[total];
		for(int i=0;i<total;i++) {
			ui[i] = new UserInfo();
			ui[i].input();
		}
		
		ui[0].printFirst();
		for(int i=0;i<total;i++) ui[i].print(i+1);
	}
}
