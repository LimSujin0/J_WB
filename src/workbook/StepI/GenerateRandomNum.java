package workbook.StepI;

import java.util.Random;

public class GenerateRandomNum {
	private int arb_number;
	private int num_group[] = new int[3];
	private String group[] = {"대 (70 이상)", "중 (40 이상)", "소 (40 미만)"};
	public GenerateRandomNum(){
		input();
	}
	private void input() {
		System.out.print("생성된 임의의 숫자를 생성합니다.\n");
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
		System.out.printf("생성된 임의의 숫자는 %d입니다.\n", arb_num);
		
		if(arb_num>=70) belong_to=0;
		else if(arb_num>=40) belong_to=1;
		else belong_to=2;
		
		return belong_to;
	}
	
	public void printTotalNum() {
		System.out.println("");
		for(int i=0;i<3;i++)
			System.out.printf("%d. %s : %d회 생성\n", i+1, group[i], num_group[i]);
		System.out.println("");
	}
}
