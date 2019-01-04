package workbook.StepL;

import java.text.ParseException;
import java.util.Scanner;

public class ParkingInOut {
	public ParkingInOut() {
		Scanner s = new Scanner(System.in);
		ParkingLot pl = new ParkingLot();
		pl.start();
		while(true) {
			System.out.println("");
			System.out.print("----------------------------------------\n");
			System.out.print("1)����  2)����  3)����Ʈ  4)���� �Ѱ���  5)�����ܿ�����  6)����  ==>");
			int menu = s.nextInt();
			System.out.print("----------------------------------------\n");
			
			if(menu==6) {
				System.out.print("����Ǿ����ϴ�.\n\n");
				break;
			}			
			else if(menu==1) pl.input();
			else if(menu==2)
				try {
					pl.output();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			else if(menu==3) pl.printCars();
			else if(menu==4) pl.printTotal();
			else if(menu==5) pl.printAvailabe();
		}

	}
}
