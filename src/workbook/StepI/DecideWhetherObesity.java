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
			System.out.printf("%d��° ����� ����(cm)�� ü��(kg)�� �Է��ϼ���. ", i);			
			height = s.nextInt();
			weight = s.nextInt();
			askBiman(height, weight);
		}
	}
	private void askBiman(int height, int weight) {
		double bmi = (double)weight/Math.pow(((double)height*0.01), 2);
		if(bmi<18.5) System.out.print("��ü���Դϴ�\n");
		else if(bmi<23) System.out.print("����ü���Դϴ�\n");
		else if(bmi<25) System.out.print("��ü���Դϴ�\n");
		else if(bmi<30) System.out.print("�浵���Դϴ�\n");
		else System.out.print("���� �Դϴ�\n");
	}
}
