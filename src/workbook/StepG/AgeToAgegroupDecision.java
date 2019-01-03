package workbook.StepG;

import java.util.Scanner;

public class AgeToAgegroupDecision {
	private int age[] = new int [100];
	private int count_person=-1;
	private int count_group[] = new int[6]; 
	private String group_name[] = {"유아", "어린이", "청소년", "청년", "중년", "노년"};
	public AgeToAgegroupDecision() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		while(true){
			count_person++;
			System.out.printf("%d번째  사람의 태어난 년도를 입력하시오.", count_person+1);	
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
		int group_num ;
		if(ages<7) group_num = 0;
		else if(ages<13) group_num=1;
		else if(ages<20) group_num=2;
		else if(ages<30) group_num=3;
		else if(ages<60) group_num=4;
		else group_num=5;
		count_group[group_num]++;
	}
	
	private int checkAge(int b_year) {
		int age;
		if(b_year>2018) age = -1;
		else age = 2018 - b_year + 1;
		return age;
	}
	
	public void printAgeGroup() {
		for(int i =0 ; i<=count_person ; i++ )
			System.out.printf("%d번째 태어난 사람의 나이는 %d입니다.\n", i+1, age[i]);
		for(int i=0;i<count_group.length;i++)
			System.out.printf("%s는 %d명입니다.\n", group_name[i], count_group[i]);
	}
}
