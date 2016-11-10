package bucky;

import java.util.*;


public class sample {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int x = 1;
		do {

			try {
				System.out.print("enter first number:");
				int n1 = input.nextInt();
				
				System.out.print("enter second number:");
				int n2 = input.nextInt();
				int result = 0;

				result = n1/n2;
				System.out.println(result);
				x=2;
				
			} catch (Exception e) {
				System.out.println("numbers no good. enter again.");
			}

			
		} while (x==1);

		
	}
	
}
