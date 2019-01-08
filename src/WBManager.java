import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import workbook.StepA.StepAManager;
import workbook.StepB.StepBManager;
import workbook.StepC.StepCManager;
import workbook.StepD.StepDManager;
import workbook.StepE.StepEManager;
import workbook.StepF.StepFManager;
import workbook.StepG.StepGManager;
import workbook.StepH.StepHManager;
import workbook.StepI.StepIManager;
import workbook.StepJ.StepJManager;
import workbook.StepK.StepKManager;
import workbook.StepL.StepLManager;
import workbook.StepM.StepMManager;
public class WBManager {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("원하는 Step은?");
		String step = s.next();
		if(step.equalsIgnoreCase("A")) 
			new StepAManager();
		if(step.equalsIgnoreCase("B"))
			new StepBManager();
		if(step.equalsIgnoreCase("C"))
			new StepCManager();
		if(step.equalsIgnoreCase("D"))
			new StepDManager();
		if(step.equalsIgnoreCase("E"))
			new StepEManager();
		if(step.equalsIgnoreCase("F"))
			new StepFManager();
		if(step.equalsIgnoreCase("G"))
			new StepGManager();
		if(step.equalsIgnoreCase("H"))
			new StepHManager();
		if(step.equalsIgnoreCase("I"))
			new StepIManager();
		if(step.equalsIgnoreCase("J"))
			new StepJManager();
		if(step.equalsIgnoreCase("K"))
			new StepKManager();
		if(step.equalsIgnoreCase("L"))
			new StepLManager();
		if(step.equalsIgnoreCase("M"))
			new StepMManager();
		System.out.printf("종료되었습니다.\n");
	}	
}