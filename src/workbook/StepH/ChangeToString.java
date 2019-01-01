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
			System.out.print("=>���ڿ��� �Է��ϼ��� (x: ����) : ");
			input = s.nextLine();
			if(input.equalsIgnoreCase("x")) break;
			
			System.out.print("=>ã�� ���ڿ��� �Է��ϼ��� : ");
			findStr = s.nextLine();
			
			System.out.print("=>�ٲ� ���ڿ��� �Է��ϼ��� : ");
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
		
		System.out.printf("\n=> �� %d�� �ٲ�����ϴ�.\n", replace_count);
		System.out.printf("=> %s\n", input);
	}
}
