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
		
		System.out.print("���� �뷮�� �ް�����Ʈ ������ �Է��ϼ���. ");
		megabytes = s.nextInt();
		System.out.print("USB ��Ʈ�� 2.0�̸� Y, �ƴϸ� N�� �Է��ϼ���. ");
		usb2 = s.next();
	}
	
	//print transfer time
	public void printTransferTime() {
		System.out.printf("���� ���� �ð��� %d ���Դϴ�.\n", getTransferTime());
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