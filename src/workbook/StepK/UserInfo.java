package workbook.StepK;

import java.util.Scanner;

public class UserInfo {
	String id;
	String password;
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("�л��� ���̵�, ��й�ȣ�� �Է��Ͻÿ� --> ");
		id = s.next();
		password = s.next();
	}
	void printFirst() {
		System.out.print("=======================\n");
		System.out.print("��ϵ� �л� ����� ������ �����ϴ�.\n");
		System.out.print("-----------------------\n");
		System.out.print("��ȣ\t���̵�\t��й�ȣ\n");
	}
	void print(int index) {
		System.out.printf("%d\t%s\t%s\n",index,id,password);
	}
}
