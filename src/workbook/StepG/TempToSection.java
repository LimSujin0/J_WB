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
			System.out.printf("%d���� ���� �µ��� %.1f���Դϴ�. %s\n", i+1, degree, checkSection(degree));			
		}
		for(int i=0; i<4; i++) {
			System.out.printf("%s �Է� Ƚ�� : %d\n", degree_name[i], count[i]);
		}

	}

	private String checkSection(double degree) {
		if(degree<0)	return "�߸��Է�";
		else if(degree<25) {
			count[0]++;
			return degree_name[0];
		}else if(degree<40) {
			count[1]++;
			return degree_name[1];
		}else if(degree<80) {
			count[2]++;
			return degree_name[2];
		}else {
			count[3]++;
			return degree_name[3];
		}
	}
	
}
