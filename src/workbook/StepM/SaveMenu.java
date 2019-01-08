package workbook.StepM;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SaveMenu {
	
	public SaveMenu() throws IOException {
		Scanner s = new Scanner(System.in);
		MenuPan mp = new MenuPan();
		while(true) {
			System.out.println("");
			System.out.print("1)�߰� 2)���� 3)���� 4)����Ʈ 5)�Ѱ��� 6)���� ==> ");
			int num = s.nextInt();
			System.out.print("-------------------------------------------\n");
			if(num==6) {
				System.out.print("����Ǿ����ϴ�.\n");
				System.out.print("����� ������ ���Ϸ� �����Ͽ����ϴ�.\n");
				mp.saveFile();
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
