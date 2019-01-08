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
			System.out.print("1)추가 2)수정 3)삭제 4)리스트 5)총개수 6)종료 ==> ");
			int num = s.nextInt();
			System.out.print("-------------------------------------------\n");
			if(num==6) {
				System.out.print("종료되었습니다.\n");
				System.out.print("저장된 내역을 파일로 저장하였습니다.\n");
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
