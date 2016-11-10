package bucky;

import javax.swing.JFrame;

public class bucky {

	public static void main3(String[] args) {
		
//		Layout l = new Layout();
//		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		l.setSize(300,100);
//		l.setVisible(true);
		
//		JFrame f = new JFrame("title");
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		Peach p = new Peach();
//		Peach2 p = new Peach2();
//		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f.add(p);
//		f.setSize(400, 250);
//		f.setVisible(true);
		
//		Peach2 p = new Peach2();
//		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		p.setVisible(true);
		
		JFrame f = new JFrame("title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		Peach3 p = new Peach3();
		f.add(p);
		f.setSize(400, 250);
		f.setVisible(true);		
		
		
	}
}
