package bucky;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui6 extends JFrame {
	private String details;
	private JLabel statusbar;
	
	public Gui6(){
		super("hiya");
		
		statusbar = new JLabel("");
		add(statusbar, BorderLayout.SOUTH);
		
		addMouseListener(new MouseListenerClass());
	}
	
	private class MouseListenerClass extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			details = String.format("You clicked %d times", e.getClickCount());			
			if (e.isMetaDown()) {
				details += " with right mouse button";
			} else if (e.isAltDown()) {
				details += " with middle mouse button";
			} else {
				details += " with left mouse button";
			}			
			statusbar.setText(details);
		}
	}
}
