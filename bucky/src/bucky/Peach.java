package bucky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Peach extends JPanel {
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);	
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.BLUE);
		g.fillRect(25, 25, 100, 30);
		
		g.setColor(new Color(190, 70, 250));
		g.fillRect(25, 60, 100, 30);
		
		g.setColor(Color.RED);
		g.drawString("ROSEBUD", 25, 120);
	}

}
