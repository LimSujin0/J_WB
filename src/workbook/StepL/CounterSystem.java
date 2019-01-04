package workbook.StepL;

import java.util.*;

public class CounterSystem {
	ArrayList<Table> ps = new ArrayList<Table>();
	void order() {
		ps.add(new Table());
	}
	void payment() {
		Scanner s = new Scanner(System.in);
		printList();
		System.out.print("==> 결제하실 번호를 입력하세요 : ");
		int num = s.nextInt();
		System.out.print("==> 결제완료되었습니다.\n");
		ps.remove(num-1);
	}
	private void printList() {
		System.out.print("번호\t손님\t스테이크\t스파게티\t파스타\t멤버쉽\t입장시간\n");
		for(int i=0;i<ps.size();i++) ps.get(i).print(i+1);
	}
	void showList() {
		printList();
	}
	
}
