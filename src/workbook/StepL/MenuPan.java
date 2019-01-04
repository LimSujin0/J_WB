package workbook.StepL;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPan {
	ArrayList<Menu> m = new ArrayList<Menu>();
	Scanner s = new Scanner(System.in);
	void add() {
		System.out.print("메뉴의 메뉴명, 원산지, 가격을 입력하시오.");
		m.add(new Menu());
		System.out.print("입력되었습니다.\n");
	}
	void change() {
		menuShow();
		
		System.out.print("==> 수정할 번호를 입력하세요 : ");
		int change_num = s.nextInt();
		System.out.print("==> 메뉴의 메뉴명, 원산지, 가격을 입력하시오.");
		m.set(change_num-1, new Menu());	
		System.out.print("수정되었습니다. \n");
	}
	void delete() {
		menuShow();
		System.out.print("==> 삭제할 번호를 입력하세요 : ");
		int delete_num = s.nextInt();
		m.remove(delete_num-1);
		System.out.print("삭제되었습니다. \n");
	}
	void menuShow() {
		System.out.print("메뉴번호\t메뉴이름\t원산지\t1인분가격\n");
		for(int i=0;i<m.size();i++) m.get(i).show(i);
	}
	void totalMenuNum() {
		System.out.printf("%d개의 메뉴가 등록되어 있습니다.\n\n", m.size());
	}
}