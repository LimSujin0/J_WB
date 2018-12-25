package workbook.StepF;

import java.util.Scanner;

public class ScoreToPerSubject {
	private int jumsu[][] = new int[5][3];
	private int sum[] = new int[3];
	private double average[] = new double[3];
	private int kor, eng, mat;
	private int i,j;
	//constructor
	public ScoreToPerSubject() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		for(i=0;i<5;i++) {
			System.out.printf("%d�� �л� ����, ����, ����, ������ �Է��Ͻÿ�.", i+1);
			kor = s.nextInt();
			eng = s.nextInt();
			mat = s.nextInt();
			jumsu[i][0] = kor;
			jumsu[i][1] = eng;
			jumsu[i][2] = mat;
		}
	}
	//print total and average per subject
	public void printPerSubject() {
		getTotal();
		getAverage();
		System.out.printf("������ ������ %d�̰�, ����� %.1f �Դϴ�.\n", sum[0], average[0]);
		System.out.printf("������ ������ %d�̰�, ����� %.1f �Դϴ�.\n", sum[1], average[1]);
		System.out.printf("������ ������ %d�̰�, ����� %.1f �Դϴ�.\n", sum[2], average[2]);
	}
	private void getAverage() {
		for(i=0;i<3;i++)
				average[i] = (double)sum[i]/5.0f;
	}
	private void getTotal() {
		for(i=0;i<5;i++)
			for(j=0;j<3;j++)
				sum[j] = sum[j] + jumsu[i][j]; 
	}
}
