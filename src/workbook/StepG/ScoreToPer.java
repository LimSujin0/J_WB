package workbook.StepG;

import java.util.Scanner;

public class ScoreToPer {
	private int jumsu[][] = new int[5][4];
	private int c_total[] = new int[3];
	private String[] class_name = {"����", "����", "����"};

	public ScoreToPer() {
		input();
	}

	private void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0; i<jumsu.length; i++) {
			int total = 0;
			System.out.printf("%d�� �л��� ����, ����, ���� ������?", i+1);
			for(int j =0; j<c_total.length; j++) {
				jumsu[i][j] = s.nextInt();
			}
		}
	}
	
	public void printScorePerSubStd() {
		getTotal();
		System.out.print("\n1) �� ���� ������ ��� ����\n");
		for(int i=0; i<3; i++) {
			int total = c_total[i];
			System.out.printf("%s ���� ������ %d ����� %.1f�Դϴ�.\n", class_name[i], total, calcSubAverage(total));
		}
		System.out.print("\n2) �� �л��� ������ ��� ����\n");
		for(int i=0; i<5; i++) {
			int total = jumsu[i][3];
			double average = calcStdAverage(total);
			System.out.printf("%d�� �л� ����  : ����  %d, ���  %.1f, ���%s\n", i+1, total, average, calcRank(average));
		}
	}

	private String calcRank(double average) {
		if(average>=90) return "A";
		else if(average>=80) return "B";
		else if(average>=70) return "C";
		else if(average>=60) return "D";
		else  return "F";
	}

	private double calcStdAverage(int total) {
		return total/3.0f;
	}

	private double calcSubAverage(int total) {
		return total/5.0f;
	}

	private void getTotal() {
		for(int i=0;i<5;i++) {
			int total = 0;
			for(int j=0;j<3;j++) {
				total = total + jumsu[i][j];
			}
			jumsu[i][3] = total;
		}
		for(int i=0; i<3; i++) {
			int total = 0;
			for(int j=0; j<5; j++) {
				total = total +jumsu[j][i];
			}
			c_total[i] = total;
		}
	}
	
}
