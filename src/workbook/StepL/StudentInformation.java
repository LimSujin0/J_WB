package workbook.StepL;

import java.util.*;

public class StudentInformation {
	ArrayList<Student> st = new ArrayList<Student>();
	Scanner s = new Scanner(System.in);
	void registeration() {
		st.add(new Student());
		System.out.printf("�� %d���� ��ϵǾ����ϴ�.\n", st.size());
	}
	void modifyInform() {
		printList();
		System.out.print("==> �����Ͻ� ��ȣ�� �Է��ϼ��� :  ");
		int num_modif = s.nextInt();
		st.set(num_modif-1,new Student());
		System.out.print("�����Ǿ����ϴ�.\n");
	}
	private void printList() {
		System.out.print("��ȣ\t�̸�\t�й�\t\t����\t�ּ�\t\t��ȭ��ȣ\t\t���л�\n");
		for(int i=0;i<st.size();i++) st.get(i).print(i+1);
	}
	
	void deletion() {
		System.out.print("==> �����Ͻ� ��ȣ�� �Է��ϼ��� : ");
		int num_delete = s.nextInt();
		System.out.print("������ �����Ͻðڽ��ϱ�?(Y/N) ");
		String really = s.next();
		if(really.equalsIgnoreCase("y")) {
			st.remove(num_delete-1);
			System.out.print("�����Ǿ����ϴ�.\n");
		}else {
			System.out.print("������ ��ҵǾ����ϴ�.\n");
		}
		
	}
	
	void show() {
		printList();
		System.out.printf("�� %d���� ��ϵǾ����ϴ�.\n", st.size());
	}
	void searchName() {
		System.out.print("�˻��Ͻ� �̸��� �Է��ϼ��� : ");
		String name_find = s.next();
		System.out.print("�˻��Ǿ����ϴ�.\n\n");
		System.out.print("��ȣ\t�̸�\t�й�\t\t����\t�ּ�\t\t��ȭ��ȣ\t\t���л�\n");
		for(int i=0;i<st.size();i++) {
			int index = st.get(i).name.indexOf(name_find);
			if(index>-1)	st.get(index).print(i+1);
		}
	}
	void searchReturning() {
		int returning_count=0;
		System.out.print("��ȣ\t�̸�\t�й�\t\t����\t�ּ�\t\t��ȭ��ȣ\t\t���л�\n");
		for(int i=0;i<st.size();i++) {
			int index = st.get(i).returning.indexOf("Y");
			if(index>-1) {
				returning_count++;
				st.get(index).print(i+1);
			}
		}
		System.out.printf("���л��� %d���Դϴ�.\n", returning_count);
	}
	void searchAddress() {
		int index=0;
		System.out.print("�˻��Ͻ� �̸��� �Է��ϼ��� : ");
		String address_find = s.next();
		System.out.println("");
		System.out.print("��ȣ\t�̸�\t�й�\t\t����\t�ּ�\t\t��ȭ��ȣ\t\t���л�\n");
		for(int i=0;i<st.size();i++) {
			index = st.get(i).address.indexOf(address_find);
			//System.out.println(st.get(index).address);		
			if(index>-1) st.get(index).print(i+1);
		}
	}
}
