package workbook.StepL;

import java.util.*;

public class StudentInformation {
	ArrayList<Student> st = new ArrayList<Student>();
	Scanner s = new Scanner(System.in);
	void registeration() {
		st.add(new Student());
		System.out.printf("총 %d명이 등록되었습니다.\n", st.size());
	}
	void modifyInform() {
		printList();
		System.out.print("==> 수정하실 번호를 입력하세요 :  ");
		int num_modif = s.nextInt();
		st.set(num_modif-1,new Student());
		System.out.print("수정되었습니다.\n");
	}
	private void printList() {
		System.out.print("번호\t이름\t학번\t\t성별\t주소\t\t전화번호\t\t복학생\n");
		for(int i=0;i<st.size();i++) st.get(i).print(i+1);
	}
	
	void deletion() {
		System.out.print("==> 삭제하실 번호를 입력하세요 : ");
		int num_delete = s.nextInt();
		System.out.print("정말로 삭제하시겠습니까?(Y/N) ");
		String really = s.next();
		if(really.equalsIgnoreCase("y")) {
			st.remove(num_delete-1);
			System.out.print("삭제되었습니다.\n");
		}else {
			System.out.print("삭제가 취소되었습니다.\n");
		}
		
	}
	
	void show() {
		printList();
		System.out.printf("총 %d명이 등록되었습니다.\n", st.size());
	}
	void searchName() {
		System.out.print("검색하실 이름을 입력하세요 : ");
		String name_find = s.next();
		System.out.print("검색되었습니다.\n\n");
		System.out.print("번호\t이름\t학번\t\t성별\t주소\t\t전화번호\t\t복학생\n");
		for(int i=0;i<st.size();i++) {
			int index = st.get(i).name.indexOf(name_find);
			if(index>-1)	st.get(index).print(i+1);
		}
	}
	void searchReturning() {
		int returning_count=0;
		System.out.print("번호\t이름\t학번\t\t성별\t주소\t\t전화번호\t\t복학생\n");
		for(int i=0;i<st.size();i++) {
			int index = st.get(i).returning.indexOf("Y");
			if(index>-1) {
				returning_count++;
				st.get(index).print(i+1);
			}
		}
		System.out.printf("복학생은 %d명입니다.\n", returning_count);
	}
	void searchAddress() {
		int index=0;
		System.out.print("검색하실 이름을 입력하세요 : ");
		String address_find = s.next();
		System.out.println("");
		System.out.print("번호\t이름\t학번\t\t성별\t주소\t\t전화번호\t\t복학생\n");
		for(int i=0;i<st.size();i++) {
			index = st.get(i).address.indexOf(address_find);
			//System.out.println(st.get(index).address);		
			if(index>-1) st.get(index).print(i+1);
		}
	}
}
