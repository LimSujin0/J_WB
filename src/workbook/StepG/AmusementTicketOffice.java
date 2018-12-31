package workbook.StepG;

import java.util.Scanner;

public class AmusementTicketOffice {
	private int[] charge = {5000, 10000, 15000, 3000};
	private int[] count= new int[4];
	private int[] v_count = new int[4];
	private String[] group = {"�ʵ��л�", "û�ҳ�", "�Ϲ���", "��δ��"};
	private int total_count=0;
	private int total_sum=0;
	public AmusementTicketOffice() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���� �湮�� �� ���� �Է��ϼ���. ");
		int team_count = s.nextInt();
		for(int i =0; i<team_count; i++) {
			System.out.printf("%d���� �ο���(�ʵ��л�, û�ҳ�, �Ϲ�, ��δ��)�� �Է��ϼ���.", i+1);
			for(int j=0; j<4; j++) {
				int count_n = s.nextInt();
				count[j] = count_n;
				v_count[j] = v_count[j] + count_n;
				total_count = total_count + count_n;
			}
			
			System.out.printf("%d���� ����ī�� ����(ī�����:0, �Ϲݵ��:1, VIP���:2)�� �Է��ϼ���.", i+1);
			int membership = s.nextInt();
			
			System.out.printf("%d���� ������ %d�Դϴ�.\n",
					i+1, getFinalFare(getRealFare(), membership));
		}
	}
	private int getFinalFare(int real_fare, int membership) {
		if(membership == 1) real_fare = (int) (real_fare*0.9);
		else if(membership==2) real_fare = (int) (real_fare*0.8);
		total_sum = total_sum + real_fare;
		return real_fare;
	}
	private int getRealFare() {
		int real_fare = 0;
		for(int i=0; i<4 ; i++) {
			real_fare = real_fare + charge[i]*count[i];
		}
		return real_fare;
	}
	
	public void printVisitorFee() {
		System.out.printf("\n���� �� �湮�� ���� %d���Դϴ�.\n", total_count);
		for(int i=0;i<4;i++) {
			System.out.printf("%s ���� %d���Դϴ�.\n", group[i], v_count[i]);
		}
		System.out.printf("\n�� ������ %d���Դϴ�.\n", total_sum);
	}
}
