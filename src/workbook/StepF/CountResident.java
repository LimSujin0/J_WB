package workbook.StepF;

import java.util.Scanner;

public class CountResident {
	//initialize
	private int number[][] = new int [5][3];
	private int total = 0;
	//constructor
	public CountResident() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				int ho = (i+1)*100 + j+1;
				System.out.printf("%dȣ�� ��� �ִ� ����� ���ڸ� �Է��Ͻÿ�.", ho);
				int newnum = s.nextInt();
				number[i][j] = newnum;
			}
		}
	}
	//print total resident
	public void printTotal() {
		getTotal();
		System.out.printf("�� ����Ʈ�� ��� �����ڴ� ��� %d�� �Դϴ�.\n", total);
	}
	private void getTotal() {
		int i, j;
		for(i=0;i<5;i++)
			for(j=0;j<3;j++)
				total = total + number[i][j];
	}
	
}
