package workbook.StepJ;

import java.util.Scanner;

public class ScoreToAverage {
	
	public ScoreToAverage() {
		input();
	}
	private void input() {
		double[] score = new double[10];
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			System.out.printf("%d번 심사점수를 입력하시오. ", i+1);
			score[i] = s.nextDouble();			
		}
		System.out.printf("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 %.1f입니다.\n", Average(score ,Max(score), Min(score)));
	}
	private double Average(double[] score, double max, double min) {
		double average=0;
		double total=0;
		for(int i=0;i<10;i++) {
			if(score[i]==min || score[i]==max) total=total+0;
			else total=total+score[i];
		}
		average = total/(score.length-2);
		return average;
	
	}
	private double Min(double[] score) {
		double max = 0;
		for(int i=0;i<10;i++) {
			if(i==0) max=score[i];
			else if(max<score[i]) max=score[i];
		}
		return max;
	}
	private double Max(double[] score) {
		double min=0;
		for(int i=0;i<10;i++) {
			if(i==0) min=score[i];
			else if(min>score[i]) min=score[i];
		}
		return min;
	}
}
