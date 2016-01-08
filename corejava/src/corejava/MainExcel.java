package corejava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainExcel 
{
	public static void main(String[] args) throws IOException 
	{
		File file = new File("D:/app/ce/excel/report/Book2.xlsx");

		FileReader in = null;
	      FileWriter out = null;

	      try {
	         in = new FileReader(file);
	         out = new FileWriter("output.txt");
	         
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	         }
	      }finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	   }
}
