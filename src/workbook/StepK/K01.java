package workbook.StepK;

public class K01 {
	public K01(){
		MenuPan mp = new MenuPan();
		mp.input();
		System.out.print("==============================\n");
		System.out.printf("메뉴번호\t메뉴이름\t원산지\t1인분가격\n");
		mp.print_menu();
	}
}
