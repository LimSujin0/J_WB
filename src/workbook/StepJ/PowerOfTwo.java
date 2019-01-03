package workbook.StepJ;

import java.util.Scanner;

public class PowerOfTwo {
	public PowerOfTwo() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("숫자를 입력하시오. (0.종료) : ");
			int number = s.nextInt();
			if(number==0) break;
			
			System.out.printf("2승의 %d승은 : %d\n", number, powerOfTwo(number));			
		}

	}
	private int powerOfTwo(int number) {
		if(number==0) return 1;
		else return 2*powerOfTwo(number-1);
	}
}
