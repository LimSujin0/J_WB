package workbook.StepF;

import java.util.Scanner;

public class ScoreToPerPerson {
	//initialize
	private int jumsu[][] = new int[5][3];
	private int sum[] = new int[5];
	private double average[] = new double[5];
	//constructor
	public ScoreToPerPerson() {
		input();
	}
	private void input() {
		int total;
		Scanner s = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			total = 0;
			System.out.printf("%d�� �л� ����, ����, ���� ������ �Է��Ͻÿ�.", i+1);
			for(int j = 0; j<4 ; j++) {	
				int newnum = s.nextInt();
				total = total +newnum;
				jumsu[i][j] = newnum;
			}
			sum[i] = total;
			average[i] = (double)total/3.0f;
		}
	}

	//print average and total per person
	public void printPerPerson() {
		for(int i=0;i<5;i++)
			System.out.printf("%d�� �л��� ������ %d�̰�, ����� %.1f �Դϴ�.\n", i+1, sum[i], average[i]);
	}
	
}
