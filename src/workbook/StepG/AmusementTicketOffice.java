package workbook.StepG;

import java.util.Scanner;

public class AmusementTicketOffice {
	private int[] charge = {5000, 10000, 15000, 3000};
	private int[] count= new int[4];
	private int[] v_count = new int[4];
	private String[] group = {"초등학생", "청소년", "일반인", "경로대상"};
	private int total_count=0;
	private int total_sum=0;
	public AmusementTicketOffice() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("오늘 방문한 팀 수를 입력하세요. ");
		int team_count = s.nextInt();
		for(int i =0; i<team_count; i++) {
			System.out.printf("%d번팀 인원수(초등학생, 청소년, 일반, 경로대상)을 입력하세요.", i+1);
			for(int j=0; j<4; j++) {
				int count_n = s.nextInt();
				count[j] = count_n;
				v_count[j] = v_count[j] + count_n;
				total_count = total_count + count_n;
			}
			
			System.out.printf("%d번팀 할인카드 종류(카드없음:0, 일반등급:1, VIP등급:2)를 입력하세요.", i+1);
			int membership = s.nextInt();
			
			System.out.printf("%d번팀 입장료는 %d입니다.\n",
					i+1, getFinalFare(getRealFare(), membership));
		}
	}
	private int getFinalFare(int real_fare, int membership) {
		if(membership == 1) real_fare = (int) (real_fare*0.9);
		else if(membership==2) real_fare = (int) (real_fare*0.8);
		total_sum = total_sum + real_fare;
		return real_fare;
	}
	private int getRealFare() {
		int real_fare = 0;
		for(int i=0; i<4 ; i++) {
			real_fare = real_fare + charge[i]*count[i];
		}
		return real_fare;
	}
	
	public void printVisitorFee() {
		System.out.printf("\n오늘 총 방문자 수는 %d명입니다.\n", total_count);
		for(int i=0;i<4;i++) {
			System.out.printf("%s 수는 %d명입니다.\n", group[i], v_count[i]);
		}
		System.out.printf("\n총 입장료는 %d원입니다.\n", total_sum);
	}
}
