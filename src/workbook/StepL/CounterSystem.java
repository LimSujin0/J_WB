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
		System.out.print("==> �����Ͻ� ��ȣ�� �Է��ϼ��� : ");
		int num = s.nextInt();
		System.out.print("==> �����Ϸ�Ǿ����ϴ�.\n");
		ps.remove(num-1);
	}
	private void printList() {
		System.out.print("��ȣ\t�մ�\t������ũ\t���İ�Ƽ\t�Ľ�Ÿ\t�����\t����ð�\n");
		for(int i=0;i<ps.size();i++) ps.get(i).print(i+1);
	}
	void showList() {
		printList();
	}
	
}
