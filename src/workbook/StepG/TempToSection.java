package workbook.StepG;

import java.util.Scanner;

public class TempToSection {
	private double degrees[] = new double[10];
	private String degree_name[] = {"냉수", "미온수", "온수", "끓는물"};
	private int[] count = {0, 0, 0, 0};
	
	public TempToSection() {
		input();
	}

	private void input() {
		Scanner s = new Scanner(System.in);
		for(int i = 0; i<10; i++) {
			System.out.printf("%d번 물의 온도를 입력하시오.", i+1);
			degrees[i] = s.nextDouble();
		}
	}
	
	public void printTempSection() {
		for(int i=0; i<10; i++) {
			double degree = degrees[i];
			count[checkSection(degree)]++;
			System.out.printf("%d번의 물의 온도는 %.1f도입니다. %s\n", i+1, degree, degree_name[checkSection(degree)]);			
		}
		for(int i=0; i<4; i++) {
			System.out.printf("%s 입력 횟수 : %d\n", degree_name[i], count[i]);
		}

	}

	private int checkSection(double degree) {
		if(degree<0)	return -1;
		else if(degree<25) return 0;
		else if(degree<40) return 1;
		else if(degree<80) return 2;
		else return 3;
	}
	
}
