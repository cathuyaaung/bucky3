package bucky;

public class bucky2 {

	public static void main(String[] args) {
		
		String a = "apples";
		String b = "oranges";
		String c = "ORANGES";
		System.out.println(a.length());
	
		if (a.equals("apples")) {
			System.out.println("it's apples");
		}

		if (b.equalsIgnoreCase(c)) {
			System.out.println("bucky match");
		}

		
	}
	
}
