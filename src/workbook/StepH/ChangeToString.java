package workbook.StepH;

import java.util.Scanner;

public class ChangeToString {
	private String input;
	private String findStr;
	private String replaceStr;
	
	public ChangeToString() {
		input();
	}

	private void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("===================\n");
			System.out.print("=>문자열을 입력하세요 (x: 종료) : ");
			input = s.nextLine();
			if(input.equalsIgnoreCase("x")) break;
			
			System.out.print("=>찾을 문자열을 입력하세요 : ");
			findStr = s.nextLine();
			
			System.out.print("=>바꿀 문자열을 입력하세요 : ");
			replaceStr = s.nextLine();
			
			printChangedString();
		}
	}

	private void printChangedString() {
		int replace_count = -1;
		int index = 0;
		String input2 = input;
		
		while(index!=-1) {
			index = input2.indexOf(findStr);
			input2 = input2.substring(index+1);
			replace_count++;
		}
		input = input.replace(findStr, replaceStr);	
		
		System.out.printf("\n=> 총 %d번 바뀌었습니다.\n", replace_count);
		System.out.printf("=> %s\n", input);
	}
}
