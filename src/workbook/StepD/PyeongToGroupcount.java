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
			System.out.print("아파트의 분양 면적(제곱미터)을 입력하시오. ");
			m2_area= s.nextDouble();
			pyeong_area = m2_area/3.305;
			System.out.printf("-->이 아파트의 평형은 %.1f입니다.\n", pyeong_area);
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
		System.out.printf("\"소형 아파트\"의 개수는 %d입니다.\n", count1);
		System.out.printf("\"중소형 아파트\"의 개수는 %d입니다.\n", count2);
		System.out.printf("\"중형 아파트\"의 개수는 %d입니다.\n", count3);
		System.out.printf("\"대형 아파트\"의 개수는 %d입니다.\n", count4);
	}
}
