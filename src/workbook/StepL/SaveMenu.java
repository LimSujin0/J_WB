package workbook.StepL;

import java.util.Scanner;

public class SaveMenu {
	
	public SaveMenu() {
		Scanner s = new Scanner(System.in);
		MenuPan mp = new MenuPan();
		while(true) {
			System.out.println("");
			System.out.print("1)�߰� 2)���� 3)���� 4)����Ʈ 5)�Ѱ��� 6)���� ==> ");
			int num = s.nextInt();
			System.out.print("-------------------------------------------\n");
			if(num==6) {
				System.out.print("����Ǿ����ϴ�.\n");
				break;
			}
			else if(num==1) mp.add();
			else if(num==2) mp.change();
			else if(num==3) mp.delete();
			else if(num==4) mp.menuShow();
			else if(num==5) mp.totalMenuNum();
		}
	}
}
