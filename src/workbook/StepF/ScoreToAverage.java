package workbook.StepF;

import java.util.Scanner;

public class ScoreToAverage {
	private double score[] = new double[10];
	private double maxscore, minscore;
	private double average, total=0;
	//constructor
	public ScoreToAverage() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.printf("%d�� �ɻ������� �Է��Ͻÿ�.",i+1);
			double newnum = s.nextDouble();
			score[i] = newnum;
			total = total + newnum;
			if(i==0) {
				maxscore = newnum;
				minscore= newnum;
			}
			getMinMax(newnum);
		}
	}
	private void getMinMax(double newnum) {
		if(maxscore < newnum) maxscore=newnum;
		if(minscore > newnum) minscore=newnum;
	}
	//print average
	public void printAverage() {
		getAverage();
		System.out.printf("���� ū ������ ���� ���� ������ ������ 8���� ������ ���� ����� %.1f�Դϴ�.\n",average);
	}
	private void getAverage() {
		total = total - maxscore - minscore;
		average = total/8.0f;
	}
}
