package workbook.StepD;

import java.util.Scanner;

public class PyeongToGroupcount {
	//initialize
	private double m2_area, pyeong_area;
	private int count1=0, count2=0, count3=0, count4=0;
	private int i;
	
	//constructor
	public PyeongToGroupcount() {
		input();
	}

	private void input() {
		getPyeong();
	}

	private void getPyeong() {
		Scanner s = new Scanner(System.in);
		for(i=0;i<10;i++) {
			System.out.print("����Ʈ�� �о� ����(��������)�� �Է��Ͻÿ�. ");
			m2_area= s.nextDouble();
			pyeong_area = m2_area/3.305;
			System.out.printf("-->�� ����Ʈ�� ������ %.1f�Դϴ�.\n", pyeong_area);
			getGrouptcount();
		}
	}

	private void getGrouptcount() {
		if(pyeong_area<15) count1++;
		else if(pyeong_area<30) count2++;
		else if(pyeong_area<50) count3++;
		else count4++;
	}
	
	//print group count
	public void printApartGroupcount() {
		System.out.printf("\"���� ����Ʈ\"�� ������ %d�Դϴ�.\n", count1);
		System.out.printf("\"�߼��� ����Ʈ\"�� ������ %d�Դϴ�.\n", count2);
		System.out.printf("\"���� ����Ʈ\"�� ������ %d�Դϴ�.\n", count3);
		System.out.printf("\"���� ����Ʈ\"�� ������ %d�Դϴ�.\n", count4);
	}
}
