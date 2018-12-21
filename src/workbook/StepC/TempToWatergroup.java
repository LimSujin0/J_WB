package workbook.StepC;

import java.util.Scanner;

public class TempToWatergroup {
	//initialize
	private double input_degree;
	
	//constructor
	public TempToWatergroup() { input(); }
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���� �µ��� �Է��ϼ���. ");
		input_degree = s.nextDouble();
	}
	
	//print water group
	public void printWatergroup() {
		System.out.println(getWatergroup());
	}
	
	private String getWatergroup() {
		String water_group;
		if(input_degree < 0) water_group = "�߸��Է��ϼ̽��ϴ�.";
		else if(input_degree < 25) water_group = "�ü��Դϴ�.";
		else if(input_degree < 40) water_group = "�̿¼��Դϴ�.";
		else if(input_degree < 80) water_group = "�¼��Դϴ�.";
		else water_group = "���� ���Դϴ�.";
		
		return water_group;
	}

}
