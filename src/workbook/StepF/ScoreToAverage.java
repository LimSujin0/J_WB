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
			System.out.printf("%d번 심사점수를 입력하시오.",i+1);
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
		System.out.printf("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 %.1f입니다.\n",average);
	}
	private void getAverage() {
		total = total - maxscore - minscore;
		average = total/8.0f;
	}
}
