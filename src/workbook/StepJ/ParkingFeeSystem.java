package workbook.StepJ;

import java.util.Scanner;

public class ParkingFeeSystem {
	private int total_fee=0;
	private int count=0;
	public ParkingFeeSystem() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			count++;
			System.out.printf("%d번 차량 주차 시작 시각 (시 분) : ", count);
			int s_hur = s.nextInt();
			int s_min = s.nextInt();
			System.out.printf("%d번 차량 주차 종료 시각(시 분) : ", count);
			int e_hur = s.nextInt();
			int e_min = s.nextInt();
			System.out.printf("주차요금 : %d원 \n", calcParking(s_hur, e_hur, s_min, e_min));
			
			System.out.print("더 입력하시겠습니다?(Y/N) ");
			if(s.next().equalsIgnoreCase("n")) break; 
		}
	}
	private int calcParking(int s_hur, int e_hur, int s_min, int e_min) {
		int start = s_hur*60 + s_min;
		int end = e_hur*60 + e_min;
		
		int fee=0;
		int tally=(end-start)/10;
		double rest=(end-start)%10.f;
		
		if(rest==0) fee=tally*500;
		else  fee=(tally+1)*500;
		
		total_fee = total_fee+fee;
		
		return fee;
	}
	
	public void printTotalFee() {
		System.out.printf("주차차량 %d대의 총 주차 요금은  %d입니다.\n", count, total_fee);
	}
}
