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
		
		System.out.print("����Ʈ �о� ����(��������)�� �Է��Ͻÿ�. ");
		m2_area = s.nextDouble();
	}
	
	//print size decision
	public void printSizedecision(){
		System.out.printf("����Ʈ�� ������ %.1f �̰�,\n", getPyeong());
		System.out.printf(getSizedecision());
	}
	
	private double getPyeong() {
		pyeong_area = m2_area / 3.305;
		return pyeong_area;
	}
	
	private String getSizedecision() {
		String decision;
		if(pyeong_area < 30) {
			decision = "30�� �̸��̹Ƿ� ���� ����Ʈ�Դϴ�.";
		}else{
			decision = "30�� �̻����Ƿ� ū ����Ʈ�Դϴ�.";
		}
		return decision;
	}
}

