package workbook.StepF;

import java.util.Scanner;

public class CountResident {
	//initialize
	private int number[][] = new int [5][3];
	private int newnum;
	private int total=0;
	private int ho;
	private int i, j;
	//constructor
	public CountResident() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		for(i=0;i<5;i++) {
			for(j=0;j<3;j++) {
				ho = (i+1)*100 + j+1;
				System.out.printf("%dȣ�� ��� �ִ� ����� ���ڸ� �Է��Ͻÿ�.", ho);
				newnum = s.nextInt();
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
		for(i=0;i<5;i++)
			for(j=0;j<3;j++)
				total =  total + number[i][j];
	}
	
}
