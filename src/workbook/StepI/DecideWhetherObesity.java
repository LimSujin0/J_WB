package workbook.StepI;

import java.util.Scanner;

public class DecideWhetherObesity {
	public DecideWhetherObesity() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		int height, weight;
		for(int i=1;i<=10;i++) {
			System.out.printf("%d번째 사람의 신장(cm)과 체중(kg)을 입력하세요. ", i);			
			height = s.nextInt();
			weight = s.nextInt();
			askBiman(height, weight);
		}
	}
	private void askBiman(int height, int weight) {
		double bmi = (double)weight/Math.pow(((double)height*0.01), 2);
		if(bmi<18.5) System.out.print("저체중입니다\n");
		else if(bmi<23) System.out.print("정상체중입니다\n");
		else if(bmi<25) System.out.print("과체중입니다\n");
		else if(bmi<30) System.out.print("경도비만입니다\n");
		else System.out.print("고도비만 입니다\n");
	}
}
