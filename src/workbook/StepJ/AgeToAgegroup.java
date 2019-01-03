package workbook.StepJ;

import java.util.Scanner;

public class AgeToAgegroup {
	private int count_group[] = new int[6];
	private String group_name[] = {"����", "���", "û�ҳ�", "û��", "�߳�", "���"};
	public AgeToAgegroup() {
		input();
	}
	private void input() {
		Scanner s = new Scanner(System.in);
		int birth_year;
		int i=0;
		while(true){
			i++;
			System.out.printf("%d��° ����� �¾ �⵵�� �Է��Ͻÿ�.",i);
			birth_year = s.nextInt();
			
			int group_num = askAge(birth_year); 
			if(group_num==-1) break;
			else 	count_group[group_num]++;
		}
	}
	private int askAge(int birth_year) {
		int group_num;
		int age = 2012-birth_year+1;
		
		if(age<1) return group_num=-1;
		else if(age<7) group_num=0;
		else if(age<13) group_num=1;
		else if(age<20) group_num=2;
		else if(age<30) group_num=3;
		else if(age<60) group_num=4;
		else group_num=5;
		System.out.printf("���̴� %d �Դϴ�.\n", age);
		
		return group_num;
	}
	
	public void printGroupNum(){
		for(int i=0; i<count_group.length; i++)
			System.out.printf("%s�� %d�� �Դϴ�.\n", group_name[i], count_group[i]);
	}
	
	
}
