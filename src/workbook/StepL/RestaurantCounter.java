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
			System.out.print("1)�ֹ�  2)����  3)����Ʈ  4)���� ==> ");
			int number = s.nextInt();
			System.out.print("-----------------------------------------\n");
			if(number==4) {
				System.out.print("����Ǿ����ϴ�.\n");
				break;
			}			
			else if(number==1) cs.order();
			else if(number==2) cs.payment();
			else if(number==3) cs.showList();
			else System.out.print("�߸��� ��ȣ�� �Է��ϼ̽��ϴ�.\n");
		}
	}
}
