package workbook.StepK;

import java.util.Scanner;

public class UserInfo {
	String id;
	String password;
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("학생의 아이디, 비밀번호를 입력하시오 --> ");
		id = s.next();
		password = s.next();
	}
	void printFirst() {
		System.out.print("=======================\n");
		System.out.print("등록된 학생 목록은 다음과 같습니다.\n");
		System.out.print("-----------------------\n");
		System.out.print("번호\t아이디\t비밀번호\n");
	}
	void print(int index) {
		System.out.printf("%d\t%s\t%s\n",index,id,password);
	}
}
