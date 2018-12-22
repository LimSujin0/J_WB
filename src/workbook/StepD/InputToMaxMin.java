package workbook.StepD;

import java.util.Scanner;

public class InputToMaxMin {
	//initialize
	private int number;
	private int max_num=0, min_num=101;
	//constructor
	public InputToMaxMin() {
		input();
	}
	private void input() {
		getNumber();
	}
	
	private void getNumber(){
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.print("0부터 100사이의 숫자를 입력하세요.");
			number = s.nextInt();
			if(0 > number || number > 100) break;
			testNum();
		}
	}
	
	private void testNum() {
		if(max_num < number) max_num = number;
		if(min_num > number) min_num = number;
	}
	
	//printMaxMin
	public void printMaxMin() {
		System.out.printf("입력된 숫자들 중 가장 큰 수는 %d이고, 가장 작은 수는 %d입니다.\n", 
				max_num, min_num);
	}
}
