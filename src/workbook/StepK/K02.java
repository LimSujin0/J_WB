package workbook.StepK;

import java.util.Scanner;

public class K02 {
	public K02(){
		Scanner s = new Scanner(System.in);

		System.out.print("����Ͻ� �޴��� ������ �Է��ϼ��� : ");
		int total = s.nextInt();
		
		MenuPan[] mp = new MenuPan[total];
		for(int i=0;i<total;i++) {
			mp[i] = new MenuPan();
			mp[i].input();
		}
		 
		System.out.print("==============================\n");
		System.out.printf("�޴���ȣ\t�޴��̸�\t������\t1�κа���\n");
		for(int i=0;i<total;i++) mp[i].print_menu();
	}
	
}