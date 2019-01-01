package workbook.StepH;

import java.util.Scanner;

public class ExtractUserInfo {
	private String userList[];
	private String userInfo[];
	private String input;
	
	public ExtractUserInfo(){
		input();
	}
	private void input() {
		while(true) {
			Scanner s = new Scanner(System.in);
			System.out.print("\n=====================\n");			
			System.out.print("=> 문자열을 입력하세요 (x:종료) : ");
			input = s.next();
			if(input.equalsIgnoreCase("x")) {
				System.out.println("* 종료되었습니다.");
				break;
			}
			printUserInfo();
		}
	}
	
	private void printUserInfo() {
		getUerInfo();
		System.out.printf("\n\n=> 총 %d명이 등록되었습니다.\n", userList.length);
		for(int i=0; i<userList.length;i++) {
			userInfo = userList[i].split("\\|");
			System.out.printf("%d %s %s\n", i+1, userInfo[0], userInfo[1]);
		}
	}
	private void getUerInfo() {
		userList = input.split("###");
	}
}
