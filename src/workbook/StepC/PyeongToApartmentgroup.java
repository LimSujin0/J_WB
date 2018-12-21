package workbook.StepC;

import java.util.Scanner;

public class PyeongToApartmentgroup {
	//initialize
	private double m2_area, pyeong_area;
	
	//constructor
	public PyeongToApartmentgroup() {input();}

	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("아파트의 분양 면적(제곱미터)를 입력하시오.");
		m2_area = s.nextDouble();
	}
	
	//print apartment decision
	public void printApartmentdecision(){
		System.out.printf("아파트의 평형은 %.1f입니다.\n", getPyeong());
		System.out.printf("%s 아파트 입니다.\n", getDecision());
	}

	private double getPyeong() {
		pyeong_area = m2_area / 3.305;
		return pyeong_area;
	}

	private String getDecision() {
		String decision;
		if(pyeong_area<15) decision = "소형";
		else if(pyeong_area<30) decision = "중소형";
		else if(pyeong_area<50) decision = "중형";
		else decision = "대형";
		
		return decision;
	}
}
