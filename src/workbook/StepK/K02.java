package workbook.StepK;

import java.util.Scanner;

public class K02 {
	public K02(){
		Scanner s = new Scanner(System.in);

		System.out.print("등록하실 메뉴의 개수를 입력하세요 : ");
		int total = s.nextInt();
		
		MenuPan[] mp = new MenuPan[total];
		for(int i=0;i<total;i++) {
			mp[i] = new MenuPan();
			mp[i].input();
		}
		 
		System.out.print("==============================\n");
		System.out.printf("메뉴번호\t메뉴이름\t원산지\t1인분가격\n");
		for(int i=0;i<total;i++) mp[i].print_menu();
	}
	
}
