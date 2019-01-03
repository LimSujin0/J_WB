package workbook.StepJ;

public class FibonacciToGoldenratio {
	public FibonacciToGoldenratio() {
		input();
	}
	private void input() {
		int n=1;
		double fib_curr_ratio=0;
		double fib_prev_ratio=0;
		while(true) {
			n++;
			fib_prev_ratio = fib_curr_ratio;
			
			double fib_curr1 = fibonacci(n+1);
			double fib_curr0 = fibonacci(n);
			fib_curr_ratio = fib_curr1/fib_curr0;
			double fib_cur_dif = Math.abs(fib_curr_ratio-fib_prev_ratio);
			if(fib_cur_dif < fib_prev_ratio*0.000001) break;
			
			System.out.printf("%d번째 비율 (%.0f/%.0f) : %.6f\n", n, fib_curr1, fib_curr0, fib_curr_ratio);		
		}

	}
	private double fibonacci(int n) {
		if(n==1 || n==2) return 1;
		else return fibonacci(n-1)+fibonacci(n-2);
	}
}
