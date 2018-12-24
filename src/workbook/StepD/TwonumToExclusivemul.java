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
		System.out.print("2개의 숫자를 입력하시오. ");
		num1 = s.nextInt();
		num2 = s.nextInt();
	}
	
	//print
	public void printExclusivemul() {
		//1안(3개 변수 필요, O(n^2))
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
		
		//2안(1개 변수 필요, O(n), 작은 수 순서대로 안나옴ㅜㅜ)
//		for(i=1; num1*i<=100 ; i++) {
//			if(num1*i%num2!=0) System.out.printf("%d ", num1*i);
//		}
//		for(i=1; num2*i<=100 ; i++) {
//			if(num2*i%num1!=0) System.out.printf("%d ", num2*i);
//		}
//		System.out.println("");
		
		//3안(깔끔쓰)
		for(i=1; i<=100; i++) {
			if(i%num1==0&&i%num2!=0) System.out.printf("%d ", i);
			if(i%num2==0&&i%num1!=0) System.out.printf("%d ", i);
		}
		System.out.println("");
	}
}
