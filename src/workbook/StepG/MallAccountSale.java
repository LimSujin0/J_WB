package workbook.StepG;

import java.util.Scanner;

public class MallAccountSale {
	private int[] order = {0, 0, 0};
	private int[] total_order = {0,0,0};
	private int[] price = {10000, 6000, 3000};
	private int total_sale =0 ;
	
	public MallAccountSale() {
		input();
	}

	private void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			int count_zero = 0;
			for(int i=0;i<3;i++) {
				System.out.printf("%d번 제품은 몇개를 구입하실래요? ", i+1);
				int order_n = s.nextInt();
				if(order_n==0) count_zero++;
				order[i] = order_n; 
				total_order[i] = total_order[i] + order_n;
			}
			if(count_zero==3) break;
			System.out.printf("판매 금액은 %d원입니다.\n\n", getPrice());
		}
	}

	private int getPrice() {
		int sale=0;
		for(int i=0;i<3;i++) {
			sale = sale + order[i]*price[i];
		}
		total_sale = total_sale + sale;
		return sale;
	}
	
	public void printTotalSale() {
		System.out.printf("지금까지의 총 매출금액은 %d원 입니다.\n", total_sale);
	}
	
}
