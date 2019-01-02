package workbook.StepI;

import java.util.Random;

public class GenerateRandomNum {
	private int arb_number;
	private int num_group[] = new int[3];
	private String group[] = {"�� (70 �̻�)", "�� (40 �̻�)", "�� (40 �̸�)"};
	public GenerateRandomNum(){
		input();
	}
	private void input() {
		System.out.print("������ ������ ���ڸ� �����մϴ�.\n");
		for(int i=0;i<10;i++)
			selectGroup(getRandom());
	}
	private void selectGroup(int belong_to) {
		num_group[belong_to]++;
	}
	private int getRandom() {
		Random generator = new Random();
		int belong_to=0;
		
		int arb_num = generator.nextInt(100)+1;
		System.out.printf("������ ������ ���ڴ� %d�Դϴ�.\n", arb_num);
		
		if(arb_num>=70) belong_to=0;
		else if(arb_num>=40) belong_to=1;
		else belong_to=2;
		
		return belong_to;
	}
	
	public void printTotalNum() {
		System.out.println("");
		for(int i=0;i<3;i++)
			System.out.printf("%d. %s : %dȸ ����\n", i+1, group[i], num_group[i]);
		System.out.println("");
	}
}
