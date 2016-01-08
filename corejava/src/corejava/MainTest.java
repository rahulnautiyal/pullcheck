package corejava;

import java.io.File;

public class MainTest 
{
	public static void main(String[] args) {
		String s = "reportData.xlsx"  ; // attachment; filename="reportData.xlsx"
		System.out.println("attachment; filename=\"reportData.xlsx\"");
		System.out.println("attachment; filename=\"" +s +"\"");
		
		File file = new File("/app/ce/excel/report/Report20160107_0445.xlsx11");
		boolean val= file.delete();
		System.out.println(val); 
		// yews i have added it.
	}
}
