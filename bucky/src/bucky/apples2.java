package bucky;

import java.io.File;

public class apples2 {
	
	public static void main(String[] args) {
		
		File x = new File("C:\\test\\greg.txt");
		if (x.exists()) {
			System.out.printf("%s exists.",x.getName());
		} else {
			System.out.printf("%s does not exists.",x.getName());
		}
	}
	
}
