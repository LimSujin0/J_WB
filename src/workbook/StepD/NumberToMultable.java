package workbook.StepD;
import java.util.Scanner;

public class NumberToMultable {
	//initialize
	private int dan;
	private int i;
	
	//constructor
	public NumberToMultable() {
		input();
	}

	private void input() {
		getDan();
	}

	private void getDan() {
		Scanner s = new Scanner(System.in);
		while(true) {
		System.out.print("출력하고 싶은 구구단의 단 수를 입력하시오(2~9)");
		dan= s.nextInt();
		if(1<dan && dan<10) break;
		System.out.print("잘못 입력하셨습니다.\n");
		}
	}
	
	//print multiplication table
	public void printMultable() {
		for(i=1; i<10; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan*i);
		}
	}
}
