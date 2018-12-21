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
		
		System.out.print("���� �뷮�� �ް�����Ʈ ������ �Է��ϼ���. ");
		megabytes = s.nextInt();
		System.out.print("���۹���� 1:Wi-Fi, 2:BlueTooth, 3:LTE, 4:USB���� �����Ͽ� �Է��ϼ���. ");
		kind = s.nextInt();
	}
	
	//print transfer time
	public void printTransfertime() {
		time = getTransfertime(getBytes());
		if(time==-1) System.out.print("�߸� �Է��ϼ̽��ϴ�.\n");
		else System.out.printf("���� ���� �ð��� %.1f ���Դϴ�.\n", time);
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
