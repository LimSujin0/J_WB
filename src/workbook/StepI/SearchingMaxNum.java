package workbook.StepI;

import java.util.Scanner;

public class SearchingMaxNum {
	private int[] number_list = new int[10];
	public SearchingMaxNum() {
		input();
	}

	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("10���� ���� �� �ִ��� ���մϴ�.\n");
		for(int i=0;i<10;i++) {
			System.out.printf("%d�� ���� �Է��Ͻÿ�. ", i+1);
			number_list[i] = s.nextInt();
		}
		System.out.printf("�ִ��� %d�Դϴ�.\n", maxOfTen());
	}
	
	public int maxOfTen() {
		int max_num = 0;
		for(int i=0;i<10;i++) {
			if(i==0) max_num=number_list[i];
			else if(max_num<number_list[i]) max_num=number_list[i];
		}
		return max_num;
	}
}
