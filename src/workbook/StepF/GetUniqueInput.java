package workbook.StepF;

import java.util.Scanner;

public class GetUniqueInput {
	private int number[] = new int[10];
	private int count;
	//constructor
	public GetUniqueInput() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("1���� 100������ ���ڸ� �Է��Ͻÿ�.");
		for(int i=0;i<10;i++) {
			System.out.printf("%d��° ���ڸ� �Է��Ͻÿ�.", i+1);
			number[i] = s.nextInt();
			while(true) {
				if(!checkOverlap(i)) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
					System.out.printf("%d��° ���ڸ� �Է��Ͻÿ�.", i+1);
					number[i] = s.nextInt();
				}
				else break;
			}
		}
	}
	private boolean checkOverlap(int c_index) {
		for(int i=0;i<c_index;i++)
			if(number[i]==number[c_index]) return false;
		return true;
	}
	//print number array
	public void printNumberArray() {
		for(int i=0;i<10;i++)
			System.out.printf("%d��° ���ڴ� %d�Դϴ�.\n", i+1, number[i]);
	}
}
