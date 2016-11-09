package bucky;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Gui3 extends JFrame {
	
	private JList list;
	private static String[] colornames = {"red", "green", "blue", "black", "yellow", "purple", "cyan"};
	private static Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.BLACK, Color.YELLOW, Color.MAGENTA, Color.CYAN};
	
	public Gui3(){
		super("Title");
		setLayout(new FlowLayout());
		
		list = new JList<String>(colornames);
		list.setVisibleRowCount(7);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(list);
		
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				getContentPane().setBackground(colors[list.getSelectedIndex()]);
			}
		});
	}
	
}
