package workbook.StepL;

import java.util.Scanner;

public class StudentInformAdmin {
	StudentInformation si = new StudentInformation();
	Scanner s = new Scanner(System.in);
	public StudentInformAdmin() {
		input();
		
	}
	private void input() {
		while(true) {
			System.out.println("");
			System.out.print("-------------------------------------------------------------------\n");
			System.out.print("1)�л����  2)��������  3)����   4)����Ʈ   5)�̸��˻�   6)���л�����Ʈ  7)�ּҰ˻�  8)���� ==>");
			int menu = s.nextInt();
			System.out.print("-------------------------------------------------------------------\n");
			if(menu==8) {
				System.out.print("����Ǿ����ϴ�.\n");
				break;
			}
			else if(menu==1) si.registeration();
			else if(menu==2) si.modifyInform();
			else if(menu==3) si.deletion();
			else if(menu==4) si.show();
			else if(menu==5) si.searchName();
			else if(menu==6) si.searchReturning();
			else if(menu==7) si.searchAddress();
		}
	}
}
