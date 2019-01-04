package workbook.StepL;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ParkingLot {
	Scanner s = new Scanner(System.in);
	int space;
	ArrayList<ParkingSpot> pss = new ArrayList<ParkingSpot>();
	SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-dd hh:mm", Locale.KOREA);
	SimpleDateFormat f1 = new SimpleDateFormat("YYYY�� MM�� dd�� hh�� mm��", Locale.KOREA);
	
	void start() {
		System.out.print("������ �� �ִ� ���� ������ �Է��ϼ��� : ");
		space = s.nextInt();
		System.out.printf("�� %d�븦 ������ �� �ֽ��ϴ�.\n", space);
	}
	
	void input(){
		if(checkAvailable()){
			String today1 = f1.format(new Date());
			pss.add(new ParkingSpot(getSpotNum()));
			System.out.printf("[%d��] %s ���� �Ǿ����ϴ�.\n", pss.get(pss.size()-1).spot_num, today1);			
		}else {
			System.out.println("�̿밡���� ���������� �����ϴ�.\n");
		}
	}
	private boolean checkAvailable() {
		if(pss.size()==space) return false;
		else return true;
	}
	private int getSpotNum() {
		for(int i=1;i<=space;i++) {
			for(int j=0;j<pss.size();j++) {
				if(pss.get(j).spot_num!=i && j==pss.size()-1) return i;				
				else if(pss.get(j).spot_num==i) break;
			}
		}
		return 1;
	}
	
	void output() throws ParseException {
		printList();
		System.out.print("==> ���� ��ȣ�� �Է��ϼ��� : ");
		int out = s.nextInt();
		
		int car_index = findCar(out); 
		if(car_index==-1) System.out.print("�ش� ��ġ�� ������ �������� �ʽ��ϴ�.\n");
		else {
			String end_parking = f.format(new Date());	
			String start_parking = pss.get(car_index).input_time;
			Date start = f.parse(start_parking);
			Date end = f.parse(end_parking);
			int between = getBetween(start, end);
			System.out.printf("==> ���� �ð��� [%s]�̹Ƿ� �����ݾ��� %d�Դϴ�.\n",end_parking, getCharge(between));
			System.out.print("==> ����Ǿ����ϴ�.\n");
			pss.remove(car_index);
		}
	}
	private int getCharge(int between) {
		int charge=0;
		int whole = between/10;
		
		if(whole<1) charge=0;
		else if(between%10==0) charge=(whole-1)*500;
		else charge=whole*500;
		
		return charge;
	}
	private int getBetween(Date start, Date end) {
		int between=0;
		int time=0, minute=0;
		
		time=end.getHours()-start.getHours();
		minute=end.getMinutes()-start.getMinutes();
		between = time*60 + minute;
		return between;
	}

	private int findCar(int out) {
		for(int i=0;i<pss.size();i++) {
			if(pss.get(i).spot_num == out) return i;
		}
		return -1;
	}

	void printCars() {
		printList();
		System.out.printf("%d�� ��������.\n", space-pss.size());
	}
	
	void printTotal() {
		System.out.printf("�� %d�밡 �����Ǿ� �ֽ��ϴ�.\n\n", pss.size());
		printList();
	}
	void printAvailabe() {
		System.out.printf("���� ������ �ڸ��� %d���Դϴ�.\n", space-pss.size());
	}
	
	private void printList() {
		for(int i=0;i<pss.size();i++) {
			ParkingSpot p = pss.get(i);
			p.print();
		}
	}
}
