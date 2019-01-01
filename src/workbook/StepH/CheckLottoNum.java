package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class CheckLottoNum {	
	private int[] lotto_com = new int[6];
	private int[] lotto_user = new int[6];
	private int count=0;
	private int match_count=0;
	
	Random generator = new Random();
	
	public CheckLottoNum() {
		input();
	}
	private void input() {
		//System.out.print("������ �ζ� ��ȣ��  %d %d %d %d %d %d �Դϴ�.\n");
		getLottoNumberFromCom();
		getLottoNumberFromUser();
	}
	
	private void getLottoNumberFromUser() {
		Scanner s = new Scanner(System.in);
		int arbitrary_number;
		count = 0;
		for(int i=0;i<6;i++) {
			while(true) {
				System.out.printf("���ϴ� %d��° �ζ� ���ڸ� �Է��ϼ���. ", i+1);
				arbitrary_number = s.nextInt();
				if (checkRedundancy(arbitrary_number, 2)) break;				
			}
			lotto_user[i] = arbitrary_number;
			count++;
		}
	}
	
	private void getLottoNumberFromCom() {
		int arbitrary_number;
		count = 0;
		for(int i=0; i<6 ; i++) {
			while(true) {
				arbitrary_number = generator.nextInt(45)+1;
				if( checkRedundancy(arbitrary_number, 1) ) break;				
			}
			lotto_com[i] = arbitrary_number;
			count++;
		}
	}
	private boolean checkRedundancy(int arb_num, int version) {
		if(version==1) {
			for(int i=0;i<count;i++) 
				if(lotto_com[i] == arb_num) return false;			
		}else {
			for(int i=0;i<count;i++) 
				if(lotto_user[i] == arb_num) {
					System.out.print("=> �߸� �Է��ϼ̽��ϴ�.\n");
					return false;
				}
		}
		return true;
	}
	
	public void printCoincidecetLottoNumber() {
		System.out.print("\n�̹� ���� �ζ� ��÷ ��ȣ�� ");
		for(int i=0; i<6; i++)
			System.out.printf(" %d", lotto_com[i]);
		System.out.print(" �Դϴ�.\n");
		
		System.out.printf("\n��ġ�ϴ� �ζ� ��ȣ�� %d�� �Դϴ�.\n", checkConsistent());
	}
	private int checkConsistent() {
		int match_count=0;
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(lotto_com[i]==lotto_user[j]) {
					match_count++;
					break;
				}
			}
		}
		return match_count;
	}
}
