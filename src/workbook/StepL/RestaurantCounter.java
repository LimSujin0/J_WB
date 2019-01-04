package workbook.StepL;

import java.util.Scanner;

public class RestaurantCounter {
	public RestaurantCounter() {
		input();
	}
	private void input() {
		CounterSystem cs = new CounterSystem();
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("\n\n");
			System.out.print("-----------------------------------------\n");
			System.out.print("1)주문  2)결제  3)리스트  4)종료 ==> ");
			int number = s.nextInt();
			System.out.print("-----------------------------------------\n");
			if(number==4) {
				System.out.print("종료되었습니다.\n");
				break;
			}			
			else if(number==1) cs.order();
			else if(number==2) cs.payment();
			else if(number==3) cs.showList();
			else System.out.print("잘못된 번호를 입력하셨습니다.\n");
		}
	}
}
