package workbook.StepK;

public class K03 {
	int[] quadrant_count = new int[5];
	public K03(){	
		Point p0 = new Point();
		
		p0.input();
		p0.count=1;
		
		p0.printFirst();
		p0.printQuadrant();
		quadrant_count[p0.quadrant]++;
		
		for(int i=1;i<5;i++) System.out.printf("%d��и��� ��ǥ�� ��� %d���Դϴ�.\n", i, quadrant_count[i]);
	}
}
