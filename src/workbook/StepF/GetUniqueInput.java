package workbook.StepF;

import java.util.Scanner;

public class GetUniqueInput {
	private int number[] = new int[10];
	private int count;
	//constructor
	public GetUniqueInput() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("1부터 100까지의 숫자를 입력하시오.");
		for(int i=0;i<10;i++) {
			System.out.printf("%d번째 숫자를 입력하시오.", i+1);
			number[i] = s.nextInt();
			while(true) {
				if(!checkOverlap(i)) {
					System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
					System.out.printf("%d번째 숫자를 입력하시오.", i+1);
					number[i] = s.nextInt();
				}
				else break;
			}
		}
	}
	private boolean checkOverlap(int c_index) {
		for(int i=0;i<c_index;i++)
			if(number[i]==number[c_index]) return false;
		return true;
	}
	//print number array
	public void printNumberArray() {
		for(int i=0;i<10;i++)
			System.out.printf("%d번째 숫자는 %d입니다.\n", i+1, number[i]);
	}
}
