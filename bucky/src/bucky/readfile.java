package bucky;

import java.io.File;
import java.util.Scanner;

public class readfile {

	private Scanner x;
	
	public void openFile() {
		try {
			x = new Scanner(new File("chinese.txt"));
			System.out.println("file opened");
		} catch (Exception e) {
			System.out.println("could not find file");
		}
	}
	
	public void readFile() {
		System.out.println("reading file");
		while (x.hasNext()) {
			String id = x.next();
			String firstname = x.next();
			String lastname = x.next();
			System.out.printf("%s %s %s\n", id, firstname, lastname);
		}
	}
	
	public void closeFile() {
		x.close();
		System.out.println("file closed");
	}
	
	
}
