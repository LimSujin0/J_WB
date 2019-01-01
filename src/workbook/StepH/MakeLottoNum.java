package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class MakeLottoNum {
	private int[] lotto = new int[6];
	private int count=0;	
	Random generator = new Random();
	
	public MakeLottoNum() {
		input();
	}
	private void input() {
		while(true) {
			getLottoNumberFromCom();			
			printLottoNumber();
			if(getMoreLottoNumber()) break;
		}
	}
	
	private boolean getMoreLottoNumber() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("�� ����ðڽ��ϱ�? (Y/N) ");
			String onemore = s.next();
			if(onemore.equalsIgnoreCase("y")) return false;
			else if(onemore.equalsIgnoreCase("n")) return true;
			else {
				System.out.print("�߸� �Է��ϼ̽��ϴ�.");
				onemore = s.next();
			}
		}
	}
	private void getLottoNumberFromCom() {
		int arbitrary_number;
		count = 0;
		for(int i=0; i<6 ; i++) {
			while(true) {
				arbitrary_number = generator.nextInt(45)+1;
				if( checkRedundancy(arbitrary_number) ) break;				
			}
			lotto[i] = arbitrary_number;
			count++;
		}
	}
	private boolean checkRedundancy(int arb_num) {
			for(int i=0;i<count;i++) 
				if(lotto[i] == arb_num) return false;
			return true;
	}
	
	private void printLottoNumber() {
		System.out.print("������ �ζ� ��ȣ��  ");
		for(int i=0; i<6; i++)
			System.out.printf(" %d", lotto[i]);
		System.out.print(" �Դϴ�.\n");
	}
	
}
