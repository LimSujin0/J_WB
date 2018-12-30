package workbook.StepF;

import java.util.Scanner;

public class SecondLargestNum {
	//initialize
	private int num[] = new int[10];
	private int first, second;
	private int second_max_index;
	//constructor
	public SecondLargestNum() {
		input();
	}
	private void input() {
		getInpuToSecondLargest();
		getSecondMaxIndex();
	}
	
	private void getInpuToSecondLargest() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.printf("%d��° ���� �Է��Ͻÿ�. ", i+1);
			int newnum = s.nextInt();
			num[i] = newnum;
			if(i==0) {
				int first=newnum; 
				int second=newnum;
			}
			getSecondLargest(i);
		}		
	}

	private void getSecondLargest(int i) {
		if(first < num[i]) {
			second = first;
			first = num[i];
		}
	}
	
	private void getSecondMaxIndex() {
		for(i=0;i<10;i++) {
			if(second==num[i]) {
				second_max_index = i;
				break;
			}
		}
	}
	
	//print second largest number
	public void printSecondLargestNumber() {
		System.out.printf("�� ��°�� ū ���� %d��° �� %d�Դϴ�.\n", second_max_index+1, second);
	}

}
