package workbook.StepM;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuPan {
	ArrayList<Menu> m = new ArrayList<Menu>();
	Scanner s = new Scanner(System.in);
	void add() {
		System.out.print("�޴��� �޴���, ������, ������ �Է��Ͻÿ�.");
		m.add(new Menu());
		System.out.print("�ԷµǾ����ϴ�.\n");
	}
	void change() {
		menuShow();
		
		System.out.print("==> ������ ��ȣ�� �Է��ϼ��� : ");
		int change_num = s.nextInt();
		System.out.print("==> �޴��� �޴���, ������, ������ �Է��Ͻÿ�.");
		m.set(change_num-1, new Menu());	
		System.out.print("�����Ǿ����ϴ�. \n");
	}
	void delete() {
		menuShow();
		System.out.print("==> ������ ��ȣ�� �Է��ϼ��� : ");
		int delete_num = s.nextInt();
		m.remove(delete_num-1);
		System.out.print("�����Ǿ����ϴ�. \n");
	}
	void menuShow() {
		System.out.print("�޴���ȣ\t�޴��̸�\t������\t1�κа���\n");
		for(int i=0;i<m.size();i++) m.get(i).show(i);
	}
	void totalMenuNum() {
		System.out.printf("%d���� �޴��� ��ϵǾ� �ֽ��ϴ�.\n\n", m.size());
	}
	
	public void saveFile() throws IOException {
		PrintWriter fw = new PrintWriter("C:\\Users\\ssuda\\Desktop\\MyMenu.txt");
		fw.printf("�޴���ȣ\t�޴��̸�\t������\t1�κа���");
		fw.println("");
		for(int i=0;i<m.size();i++) m.get(i).printFile(i, fw);
		fw.close();
	}
}