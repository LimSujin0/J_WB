package workbook.StepM;


import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Menu {
	String name;
	String origin;
	int price;
	Scanner s = new Scanner(System.in);
	public Menu() {
		input();
	}
	void input() {
		name=s.next();
		origin=s.next();
		price=s.nextInt();
	}
	void show(int index) {
		System.out.printf("%d\t%s\t%s\t%d\n", index+1, name, origin, price);
	}
	void printFile(int index, PrintWriter fw) throws IOException {
		fw.printf("%d\t%s\t%s\t%d\n", index+1, name, origin, price);
		fw.println("");
	}
}
