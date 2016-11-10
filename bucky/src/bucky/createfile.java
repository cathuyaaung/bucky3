package bucky;

import java.util.Formatter;

public class createfile {

	private Formatter x;
	
	public void openFile(){
		try {
			x = new Formatter("chinese.txt");
			System.out.println("file opened");
		} catch (Exception e) {
			System.out.println("there's an error " + e.getStackTrace().toString());
		}
	}
	
	public void addRecords() {
		x.format("%s %s %s", "username", "firstname", "lastname");
		System.out.println("added records");
	}
	
	public void closeFile() {
		x.close();
		System.out.println("file closed");
	}
}
