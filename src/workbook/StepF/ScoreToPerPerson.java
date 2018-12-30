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
		Scanner s = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.printf("%d�� �л� ����, ����, ���� ������ �Է��Ͻÿ�.", i+1);
			int kor = s.nextInt();
			int eng = s.nextInt();
			int mat = s.nextInt();
			jumsu[i][0]=kor;
			jumsu[i][1]=eng;
			jumsu[i][2]=mat;
			sum[i] = kor + eng + mat;
			average[i] = (double)sum[i]/3.0f;
		}
	}

	//print average and total per person
	public void printPerPerson() {
		for(int i=0;i<5;i++)
			System.out.printf("%d�� �л��� ������ %d�̰�, ����� %.1f �Դϴ�.\n", i+1, sum[i], average[i]);
	}
	
}
