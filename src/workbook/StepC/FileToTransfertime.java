package workbook.StepC;

import java.util.Scanner;

public class FileToTransfertime {
	//initialize
	private int megabytes;
	private int kind;
	private long bytes;
	private double time;
	
	//constructor
	public FileToTransfertime() { input();}
	private void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("파일 용량을 메가바이트 단위로 입력하세요. ");
		megabytes = s.nextInt();
		System.out.print("전송방식을 1:Wi-Fi, 2:BlueTooth, 3:LTE, 4:USB에서 선택하여 입력하세요. ");
		kind = s.nextInt();
	}
	
	//print transfer time
	public void printTransfertime() {
		time = getTransfertime(getBytes());
		if(time==-1) System.out.print("잘못 입력하셨습니다.\n");
		else System.out.printf("파일 전송 시간은 %.1f 초입니다.\n", time);
	}
	
	private long getBytes() {
		bytes = megabytes*1024*1024;
		return bytes;
	}
	
	private double getTransfertime(long b) {
		if(kind==1) time=(double)b/1500000;
		else if(kind==2) time=(double)b/300000;
		else if(kind==3) time=(double)b/1000000;
		else if(kind==4) time=(double)b/60000000;
		else time=-1;
		
		return time;
	}
	
	
}
