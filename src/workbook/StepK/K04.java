package workbook.StepK;

import java.util.Scanner;

public class K04 {
	public K04(){
		Scanner s = new Scanner(System.in);
		int[] quadrant_count = new int[5];
		
		System.out.print("몇 개의 좌표를 입력하겠습니까? ");
		int total = s.nextInt();
		
		Point[] ps = new Point[total];		
		for(int i=0;i<total;i++) {
			ps[i]=new Point();
			ps[i].input();
		}

		ps[0].printFirst();
		for(int i=0;i<total;i++) {
			ps[i].count=i+1;
			ps[i].printQuadrant();
			quadrant_count[ps[i].quadrant]++;
		}
		for(int i=1;i<total;i++) {
			System.out.printf("%d사분면의 좌표는 모두 %d개 입니다.\n", i, quadrant_count[i]);
		}
	}

	
}
