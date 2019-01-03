package workbook.StepJ;

import java.util.Scanner;

public class FibonacciToTwenty {
	public FibonacciToTwenty() {
		input();
		
	}
	private void input() {
		int n=20;
		for(int i=1;i<21;i++)
			System.out.printf("%d¹øÂ° : %d\n", i, fibonacci(i));
	}
	private int fibonacci(int n) {
		if(n==1 || n==2) return 1;
		else return fibonacci(n-1)+fibonacci(n-2);
	}
}
