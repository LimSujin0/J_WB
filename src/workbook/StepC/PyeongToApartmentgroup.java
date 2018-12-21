package workbook.StepC;

import java.util.Scanner;

public class PyeongToApartmentgroup {
	//initialize
	private double m2_area, pyeong_area;
	
	//constructor
	public PyeongToApartmentgroup() {input();}

	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("����Ʈ�� �о� ����(��������)�� �Է��Ͻÿ�.");
		m2_area = s.nextDouble();
	}
	
	//print apartment decision
	public void printApartmentdecision(){
		System.out.printf("����Ʈ�� ������ %.1f�Դϴ�.\n", getPyeong());
		System.out.printf("%s ����Ʈ �Դϴ�.\n", getDecision());
	}

	private double getPyeong() {
		pyeong_area = m2_area / 3.305;
		return pyeong_area;
	}

	private String getDecision() {
		String decision;
		if(pyeong_area<15) decision = "����";
		else if(pyeong_area<30) decision = "�߼���";
		else if(pyeong_area<50) decision = "����";
		else decision = "����";
		
		return decision;
	}
}
