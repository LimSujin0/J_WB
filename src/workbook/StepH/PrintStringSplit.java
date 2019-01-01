package workbook.StepH;

import java.util.Scanner;


public class PrintStringSplit {
	private String input;
	
	public PrintStringSplit() {
		input();
	}
	private void input() {
		while(true) {
			Scanner s = new Scanner(System.in);
			System.out.print("\n======================\n");
			System.out.print("=> 문자열을 입력하세요 (x:종료) : ");
			input = s.next();
			if(input.equalsIgnoreCase("x")) break;
			printCharacters();
		}
	}
	
	private void printCharacters() {
		int count = input.length();
		System.out.printf("=> 총 문자의 개수는 %d개 입니다.\n", count);
		for(int i=0;i<count;i++) System.out.printf("=> %s\n", input.charAt(i));
	}
}
