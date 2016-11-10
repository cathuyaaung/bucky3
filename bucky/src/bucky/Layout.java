package bucky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Layout extends JFrame {

		private JButton lb;
		private JButton cb;
		private JButton rb;
		private FlowLayout layout;
		private Container container;
		
		public Layout() {
			super("title");
			layout = new FlowLayout();
			container = getContentPane();
			setLayout(layout);
			
			lb = new JButton("Left");
			cb = new JButton("Center");
			rb = new JButton("Right");
			add(lb);
			add(cb);
			add(rb);
			
			lb.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					layout.setAlignment(FlowLayout.LEFT);
					layout.layoutContainer(container);
				}
			});
			cb.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					layout.setAlignment(FlowLayout.CENTER);
					layout.layoutContainer(container);
				}
			});
			rb.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					layout.setAlignment(FlowLayout.RIGHT);
					layout.layoutContainer(container);
				}
			});
			
			
			
		}
		
}
