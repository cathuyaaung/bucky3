package bucky;

import java.util.Formatter;

public class apple3 {

	public static void main(String[] args) {
	
		final Formatter x;
		
		try {
			x = new Formatter("newgreg.txt");
			System.out.print("file created");
		} catch (Exception e) {
			System.out.print("there's an error");
		}
		
	}
	
}
