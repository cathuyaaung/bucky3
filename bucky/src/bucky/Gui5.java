package bucky;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gui5 extends JFrame {
	
	private JPanel mousepanel;
	private JLabel statusbar;
	
	public Gui5(){
		super("title");
		
		mousepanel = new JPanel();
		mousepanel.setBackground(Color.WHITE);
		add(mousepanel, BorderLayout.CENTER);
		
		statusbar = new JLabel("Status text");
		add(statusbar, BorderLayout.SOUTH);
		
		HandlerClass handler = new HandlerClass();
		mousepanel.addMouseListener(handler);
		mousepanel.addMouseMotionListener(handler);
	}
	
	private class HandlerClass implements MouseListener, MouseMotionListener{
		public void mouseDragged(MouseEvent e) {
			statusbar.setText(String.format("mouseDragged at %d,%d", e.getX(), e.getY()));
		}
		public void mouseMoved(MouseEvent e) {
			statusbar.setText(String.format("mouseMoved at %d,%d", e.getX(), e.getY()));
		}
		public void mouseClicked(MouseEvent e) {
			statusbar.setText(String.format("mouseClicked at %d,%d", e.getX(), e.getY()));
		}
		public void mouseEntered(MouseEvent e) {
			statusbar.setText(String.format("mouseEntered at %d,%d", e.getX(), e.getY()));
			mousepanel.setBackground(Color.RED);
		}
		public void mouseExited(MouseEvent e) {
			statusbar.setText(String.format("mouseExited at %d,%d", e.getX(), e.getY()));
			mousepanel.setBackground(Color.WHITE);
		}
		public void mousePressed(MouseEvent e) {
			statusbar.setText(String.format("mousePressed at %d,%d", e.getX(), e.getY()));
		}
		public void mouseReleased(MouseEvent e) {
			statusbar.setText(String.format("mouseReleased at %d,%d", e.getX(), e.getY()));
		}
		
	}
}
