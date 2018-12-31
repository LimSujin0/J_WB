package workbook.StepG;

import java.util.Scanner;

public class RealestateComission {
	private int kind, money, charge, total_charge;
	
	public RealestateComission() {
			input();			
	}
	private void input() {
		Scanner s  = new Scanner(System.in);
		while(true){
			System.out.print("부동산 거래종류(1:매매, 2:임대, 0:계산종료)를 입력하세요 : ");
			kind = s.nextInt();
			if(kind==0) break;
			
			System.out.print("부동산 거래금액(원)을 입력하세요 : ");
			money = s.nextInt();
			
			System.out.printf("이에 대한 중개 수수료는 %d원입니다.\n", calcComission());
			
			total_charge = total_charge + charge;
		}
	}
	
	private int calcComission() {
		if(kind==1) {
			if(money<50000000) {
				charge=(int)(0.006*money);
				if(charge>250000) charge=250000;
			}else if(money<200000000) {
				charge=(int)(0.005*money);
				if(charge>800000) charge=800000;
			}
			else charge=(int)(0.004*money);
		}else {
			if(money<20000000) {
				charge=(int)(0.005*money);
				if(charge>70000) charge=70000;
			}else if(money<50000000) {
				charge=(int)(0.005*money);
				if(charge>200000) charge=200000;
			}else if(money<100000000){
				charge=(int)(0.004*money);
				if(charge>300000) charge=300000;
			}else{
				charge=(int)(0.003*money);
			}
		}
		return charge;
	}
	
	public void printTotalCharge() {
		System.out.printf("지금까지의 수수료 총액은 %d원입니다.\n", total_charge);
	}
}
