package workbook.StepB;

import java.util.Scanner;

public class PyeongToSizedecision {
	//initialize
	private double m2_area;
	private double pyeong_area;
	
	//constructor
	public PyeongToSizedecision() {input();}
	private void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("아파트 분양 면적(제곱미터)를 입력하시오. ");
		m2_area = s.nextDouble();
	}
	
	//print size decision
	public void printSizedecision(){
		System.out.printf("아파트의 평형은 %.1f 이고,\n", getPyeong());
		System.out.printf(getSizedecision());
	}
	
	private double getPyeong() {
		pyeong_area = m2_area / 3.305;
		return pyeong_area;
	}
	
	private String getSizedecision() {
		String decision;
		if(pyeong_area < 30) {
			decision = "30평 미만이므로 작은 아파트입니다.";
		}else{
			decision = "30평 이상으므로 큰 아파트입니다.";
		}
		return decision;
	}
}

