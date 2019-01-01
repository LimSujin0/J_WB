package workbook.StepH;

import java.util.Scanner;

public class SquareNumCombination {
	private int number[] = new int[5];
	//private int pow_value[][] = new int[5][5];
	private int max, min, max_a, max_b, min_a, min_b;
	Scanner s = new Scanner(System.in);
	
	public SquareNumCombination() {
		input();
	}
	private void input() {
		System.out.print("2에서 9사이의 숫자 5개를 입력하세요. ");
		for(int i=0; i<5; i++) number[i]=s.nextInt();
	}
	
	public void printMinMaxSquareNum() {
		getAllSquareNum();
		System.out.print("\n입력하신 5개의 수로 제곱수를 만들면....\n");
		System.out.printf("가장 큰 수는 %d의 %d승인 %d입니다.\n", max_a, max_b, max);
		System.out.printf("가장 작은 수는 %d의 %d승인 %d입니다.\n", min_a, min_b, min);
	}
	private void getAllSquareNum() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				int pow_num = 0;
				if(i!=j) {
					pow_num = (int)Math.pow(number[i], number[j]);
					if(i==0 && j==1) {
						max = pow_num;
						min = pow_num;
						min_a =  max_a = number[i];
						min_b = max_b = number[j];
					}
					else if(min>pow_num && pow_num!=-1) {
						min_a = number[i];
						min_b = number[j];
						min=pow_num;
					}
					else if(max < pow_num && pow_num!=-1) {
						max_a = number[i];
						max_b = number[j];
						max=pow_num;
					}
				}
			}
		}
	}
	
}
