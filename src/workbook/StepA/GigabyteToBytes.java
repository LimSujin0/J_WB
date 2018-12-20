package workbook.StepA;

import java.util.Scanner;

public class GigabyteToBytes {
	private int gigabytes;
	private int megabytes;
	private int kilobytes;
	private long bytes;
	
	public GigabyteToBytes(){
		input();
	}
	
	private void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("파일 용량을 기가파이트 단위로 입력하세요.");
		this.gigabytes = s.nextInt();
	}
	
	public void printBytes() {
		getBytes();
		System.out.printf("입력하신 파일 용량은\n %d 메가바이트,\n %d킬로바이트,\n %d바이트입니다.\n"
				,megabytes, kilobytes, bytes);
	}
	
	private void getBytes() {
		megabytes = gigabytes * 1024;
		kilobytes = megabytes * 1024;
		bytes = (long)	kilobytes * 1024;
	}
	
}
