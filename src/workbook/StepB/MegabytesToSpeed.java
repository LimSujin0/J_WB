package workbook.StepB;

import java.util.Scanner;

public class MegabytesToSpeed {
	//initialize
	private int megabytes;
	private long bytes;
	private String usb2;
	private int time;
	
	//constructor
	public MegabytesToSpeed(){ input(); }
	private void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("파일 용량을 메가바이트 단위로 입력하세요. ");
		megabytes = s.nextInt();
		System.out.print("USB 포트가 2.0이면 Y, 아니면 N을 입력하세요. ");
		usb2 = s.next();
	}
	
	//print transfer time
	public void printTransferTime() {
		System.out.printf("파일 전송 시간은 %d 초입니다.\n", getTransferTime());
	}
	
	private int getTransferTime() {
		calculateBytes();
		if(usb2.equalsIgnoreCase("Y")) calculateTransferTime2();
		else if(usb2.equalsIgnoreCase("N")) calculateTransferTime1();
		return time;
	}
	
	private void calculateBytes() {
		bytes = (long)megabytes	* 1024 * 1024;
	}
	
	private void calculateTransferTime1() {
		time = (int)(bytes / 1500000);
	}
	
	private void calculateTransferTime2() {
		time = (int)(bytes / 60000000);
	}
	
}