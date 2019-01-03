package workbook.StepJ;

import java.util.Scanner;

public class AckermannFunctionA {
	public AckermannFunctionA() {
		input();
	}
	private void input() {
		int l,r;
		l=r=3;
		for(int i=0;i<=l;i++) {
			for(int j=0;j<=r;j++) {
				System.out.printf("Ackermann(%d,%d) = %d\n", i, j, ackermannFuntionA(i,j));
			}
		}
	}
	private int ackermannFuntionA(int i, int j) {
		if(i==0 && 0<=j) return j+1;
		else if(i>0 && j==0) return ackermannFuntionA(i-1, 1);
		else return ackermannFuntionA(i-1, ackermannFuntionA(i, j-1));
	}

}
