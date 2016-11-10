package bucky;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Peach3 extends JPanel {

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.BLUE);
		g.drawLine(25, 25, 75, 75);
		
		g.setColor(Color.RED);
		g.drawRect(10, 55, 100, 30);
		
		g.setColor(Color.GREEN);
		g.fillOval(10, 89, 100, 30);
		
		g.setColor(Color.ORANGE);
		g.fill3DRect(10, 160, 100, 50, true);
		
	}
	
}
