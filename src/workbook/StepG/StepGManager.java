package workbook.StepG;

import java.util.Scanner;

import workbook.StepF.��;

public class StepGManager {
	int menu = 0;
	Scanner s = new Scanner(System.in);
	public StepGManager() {
		while(true){
			printf("-------------------------\n");
			printf("1.���� ��� �� ���ɴ� ����\n");
			printf("2.���� �µ� ���� ����\n");
			printf("3.���� ���\n");
			printf("4.�ε��� �߰� ������ ���\n");
			printf("5.PC�� �̿�� ����\n");
			printf("6.���θ� ���� ����\n");
			printf("7.���̰��� ��ǥ��\n");
			printf("=>���ϴ� �޴���? (0:exit) : ");
			menu = s.nextInt();
			if(menu==0) break;
			switch(menu){
			case 1:
				AgeToAgegroupDecision atad = new AgeToAgegroupDecision();
				
			}
		}
	}

	private void printf(String s) {
		System.out.print(s);
	}
}
