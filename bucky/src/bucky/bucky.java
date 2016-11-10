package bucky;

import javax.swing.JFrame;

public class bucky {

	public static void main(String[] args) {
		
//		Layout l = new Layout();
//		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		l.setSize(300,100);
//		l.setVisible(true);
		
		JFrame f = new JFrame("title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Peach p = new Peach();
		f.add(p);
		f.setSize(400, 250);
		f.setVisible(true);
	}
}
