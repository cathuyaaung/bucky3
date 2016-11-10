package bucky;

import java.util.Formatter;

public class apple3 {

	public static void main3(String[] args) {
	
//		final Formatter x;
//		
//		try {
//			x = new Formatter("newgreg.txt");
//			System.out.print("file created");
//		} catch (Exception e) {
//			System.out.print("there's an error");
//		}
//
		
//		createfile c = new createfile();
//		c.openFile();
//		c.addRecords();
//		c.addRecords();
//		c.addRecords();
//		c.closeFile();

		readfile r = new readfile();
		r.openFile();
		r.readFile();
		r.closeFile();		
		
	}
	
}
