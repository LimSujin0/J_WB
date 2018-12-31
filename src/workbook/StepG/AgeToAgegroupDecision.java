package workbook.StepG;

import java.util.Scanner;

public class AgeToAgegroupDecision {
	private int age[] = new int [100];
	private int count_person=-1;
	private int count_baby=0, count_child=0, count_youth=0, count_young=0; 
	private int count_adult=0, count_old=0;
	public AgeToAgegroupDecision() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		while(true){
			count_person++;
			System.out.printf("%d��°  ����� �¾ �⵵�� �Է��Ͻÿ�.", count_person+1);	
			int birth_year = s.nextInt();
			
			int ages = checkAge(birth_year);
			if(ages==-1) {
				count_person--;
				break;
			}
			else age[count_person] = ages;
			
			checkAgeGroup(ages);
		}
	}
	
	private void checkAgeGroup(int ages) {
		if(ages<7) count_baby++;
		else if(ages<13) count_child++;
		else if(ages<20) count_youth++;
		else if(ages<30) count_young++;
		else if(ages<60) count_adult++;
		else count_old++;
	}
	
	private int checkAge(int b_year) {
		int age;
		if(b_year>2018) age = -1;
		else age = 2018 - b_year + 1;
		return age;
	}
	
	public void printAgeGroup() {
		for(int i =0 ; i<=count_person ; i++ ) {
			System.out.printf("%d��° �¾ ����� ���̴� %d�Դϴ�.\n", i+1, age[i]);
		}
		System.out.printf("���ƴ� %d���Դϴ�.\n", count_baby);
		System.out.printf("��̴� %d���Դϴ�.\n", count_child);
		System.out.printf("û�ҳ��� %d���Դϴ�.\n", count_youth);
		System.out.printf("û���� %d���Դϴ�.\n", count_young);
		System.out.printf("�߳��� %d���Դϴ�.\n", count_adult);		
		System.out.printf("����� %d���Դϴ�.\n", count_old);
	}
}
