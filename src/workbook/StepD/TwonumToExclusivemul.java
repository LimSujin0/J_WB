package workbook.StepD;
import java.util.Scanner;
public class TwonumToExclusivemul {
	//initialize
	private int num1, num2;
	private int i;
	//private int j, k;
	//constructor
	public TwonumToExclusivemul() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("2���� ���ڸ� �Է��Ͻÿ�. ");
		num1 = s.nextInt();
		num2 = s.nextInt();
	}
	
	//print
	public void printExclusivemul() {
		//1��(3�� ���� �ʿ�, O(n^2))
//		for(i=1; i*num1<=100; i++) {
//			for(j=1; j*num2<=100; j++) {
//				if(num1*i==num2*j) 
//					break;
//				else if((j+1)*num2>100 && num1*i!=num2*j)
//					System.out.printf("%d ",num1*i);
//			}
//		}
//		for(i=1; i*num2<=100; i++) {
//			for(j=1; j*num1<=100; j++) {
//				if(num2*i==num1*j) 
//					break;
//				else if((j+1)*num1>100 && num2*i!=num1*j)
//					System.out.printf("%d ",num2*i);
//			}
//		}
		
		//2��(1�� ���� �ʿ�, O(n), ���� �� ������� �ȳ��Ȥ̤�)
//		for(i=1; num1*i<=100 ; i++) {
//			if(num1*i%num2!=0) System.out.printf("%d ", num1*i);
//		}
//		for(i=1; num2*i<=100 ; i++) {
//			if(num2*i%num1!=0) System.out.printf("%d ", num2*i);
//		}
//		System.out.println("");
		
		//3��(�����)
		for(i=1; i<=100; i++) {
			if(i%num1==0&&i%num2!=0) System.out.printf("%d ", i);
			if(i%num2==0&&i%num1!=0) System.out.printf("%d ", i);
		}
		System.out.println("");
	}
}
