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
			System.out.print("=> ���ڿ��� �Է��ϼ��� (x:����) : ");
			input = s.next();
			if(input.equalsIgnoreCase("x")) break;
			printCharacters();
		}
	}
	
	private void printCharacters() {
		int count = input.length();
		System.out.printf("=> �� ������ ������ %d�� �Դϴ�.\n", count);
		for(int i=0;i<count;i++) System.out.printf("=> %s\n", input.charAt(i));
	}
}
