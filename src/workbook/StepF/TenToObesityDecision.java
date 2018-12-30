package workbook.StepF;

import java.util.Scanner;

public class TenToObesityDecision {
	//initialize
	private int height, weight, bmi;
	private int bmlist[][] = new int[10][3];
	private int count=0;
	private int i;
	//constructor
	public TenToObesityDecision() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		for(i=0;i<10;i++) {
			System.out.printf("%d��° ����� ����(cm)�� ü��(kg)�� �Է��ϼ���.", i+1);
			height = s.nextInt();
			weight = s.nextInt();
			bmi = (int) (weight/(((double)height/100f)*((double)height/100f)));
			bmlist[i][0] = height;
			bmlist[i][1] = weight;
			bmlist[i][2] = bmi;
		}
	}
	//print obesity decision
	public void printObesityDecision() {
		for(i=0;i<10;i++) {
			if(bmlist[i][2] >= 25) {
				System.out.printf("%d��° ����� ���Դϴ�.\n", i+1);
				count++;
			}
		}
		System.out.printf("\n�� %d���� ����� ���Դϴ�.\n", count);
	}
}