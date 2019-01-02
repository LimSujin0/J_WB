package workbook.StepI;

import java.util.Scanner;

public class ShowBeverageTotal {
	private String beverage_list[] = {"�ݶ�", "����Ŀ��", "�����ֽ�", "ȫ��", "���ھ�"};
	private int beverage_cost[] = {700, 300, 1000, 500, 600};
	private int total_sum=0, beverage_num=0;;
	public ShowBeverageTotal() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			beverage_num++;
			getTotalSum(selectCan());			
			System.out.print("�� �ʿ��Ͻʴϱ�?(Y/N) ");
			if(s.next().equalsIgnoreCase("n")) break;
		}
	}
	private void getTotalSum(int b_cost) {
		total_sum = total_sum+b_cost;
	}
	private int selectCan() {
		Scanner s = new Scanner(System.in);
		
		showMenu();
		System.out.print("�޴��� �������ּ���: ");
		int menu = s.nextInt();
		int b_cost = beverage_cost[menu-1];
		
		return b_cost;
	}
	private void showMenu() {
		for(int i=0;i<5;i++)
			System.out.printf("%d. %s(%d��) ", i+1, beverage_list[i], beverage_cost[i]);
		System.out.println("");
	}
	
	public void printTotalSum() {
		System.out.printf("%d���� ����� �����Ͽ� �� %d���Դϴ�.\n", beverage_num, total_sum);
	}
}
