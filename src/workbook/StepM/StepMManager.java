package workbook.StepM;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class StepMManager {
	private int menu;
	Scanner s = new Scanner(System.in);
	public StepMManager() throws IOException {
		while(true) {
			printf("---------------------------\n");
			printf("1. �޴��� �����ϱ� \n");
			printf("=>���ϴ� �޴���? (0 : exit) : ");
			menu = s.nextInt();
			if(menu==0) break;
			switch(menu) {
				case 1:
					SaveMenu ms = new SaveMenu();
					break;
			}
		}
	}
	private void printf(String s) {
		System.out.print(s);
	}
	
	
}
