package workbook.StepJ;

import java.util.Scanner;

public class WatertempToSection {
	private String[] group_name = {"냉수", "미온수", "온수", "끓는 물"};
	private int[] group_count = new int[4];
	private double[] temperature = new double[10];
	
	public WatertempToSection() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			System.out.printf("%d번째 물의 온도를 입력하시오. ", 
					i+1);
			double temp = s.nextDouble();
			temperature[i] = temp;
			group_count[askWater(temp)]++;
		}
	}
	private int askWater(double temp) {
		int group_num=0;
		
		if(temp<25) group_num=0;
		else if(temp<40) group_num=1;
		else if(temp<80) group_num=2;
		else group_num=3;
		
		return group_num;
	}
	
	public void printResult() {
		for(int i=0;i<10;i++)
			System.out.printf("%d번 물의 온도는 %.1f도 입니다.\n", i+1, temperature[i]);
		for(int i=0;i<4;i++)
			System.out.printf("%s 입력 횟수는 %d입니다.\n", group_name[i], group_count[i]);
	}
}
