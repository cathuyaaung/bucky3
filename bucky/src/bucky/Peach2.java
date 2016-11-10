package bucky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Peach2 extends JFrame{

	private JButton b;
	private Color color = Color.WHITE;
	private JPanel panel;
	
	public Peach2() {
		super("title");
		panel = new JPanel();
		panel.setBackground(color);
		
		b = new JButton("Choose color");		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color color2 = JColorChooser.showDialog(null, "Choose color", color);
				if (color2!=null) {
					color = color2;
				}
				panel.setBackground(color);
			}
		});
		
		add(panel, BorderLayout.CENTER);
		add(b, BorderLayout.SOUTH);
		setSize(425,150);
		
	}
}
