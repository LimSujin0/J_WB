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
		
		System.out.print("���� �뷮�� �Ⱑ����Ʈ ������ �Է��ϼ���.");
		this.gigabytes = s.nextInt();
	}
	
	public void printBytes() {
		getBytes();
		System.out.printf("�Է��Ͻ� ���� �뷮��\n %d �ް�����Ʈ,\n %dų�ι���Ʈ,\n %d����Ʈ�Դϴ�.\n"
				,megabytes, kilobytes, bytes);
	}
	
	private void getBytes() {
		megabytes = gigabytes * 1024;
		kilobytes = megabytes * 1024;
		bytes = (long)	kilobytes * 1024;
	}
	
}
