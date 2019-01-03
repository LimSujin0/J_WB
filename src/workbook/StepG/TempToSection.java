package workbook.StepG;

import java.util.Scanner;

public class TempToSection {
	private double degrees[] = new double[10];
	private String degree_name[] = {"�ü�", "�̿¼�", "�¼�", "���¹�"};
	private int[] count = {0, 0, 0, 0};
	
	public TempToSection() {
		input();
	}

	private void input() {
		Scanner s = new Scanner(System.in);
		for(int i = 0; i<10; i++) {
			System.out.printf("%d�� ���� �µ��� �Է��Ͻÿ�.", i+1);
			degrees[i] = s.nextDouble();
		}
	}
	
	public void printTempSection() {
		for(int i=0; i<10; i++) {
			double degree = degrees[i];
			count[checkSection(degree)]++;
			System.out.printf("%d���� ���� �µ��� %.1f���Դϴ�. %s\n", i+1, degree, degree_name[checkSection(degree)]);			
		}
		for(int i=0; i<4; i++) {
			System.out.printf("%s �Է� Ƚ�� : %d\n", degree_name[i], count[i]);
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
