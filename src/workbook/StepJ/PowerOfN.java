package workbook.StepJ;

import java.util.Scanner;

public class PowerOfN {
	public PowerOfN() {
		input();
	}
	private void input() {
		int n=0, a=0;
		Scanner s = new Scanner(System.in);
		System.out.print("���� 2���� �Է��Ͻÿ�. ");
		n = s.nextInt();
		a = s.nextInt();
		System.out.printf("%d�� %d���� %d�Դϴ�.\n", n, a, power(n, a));
	}
	private int power(int n, int a) {
		if(a==0) return 1;
		else if(a==1) return n;
		else if(a%2==0) return power(n,a/2)*power(n,a/2);
		else return power(n,a/2)*power(n,a/2)*n;
	}
}
