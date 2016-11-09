package bucky;

import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui2 extends JFrame {
	private JComboBox box;
	private JLabel picture;
	
	private static String[] filenames = {"check.png", "cross.png"};	
	private Icon[] pics = {new ImageIcon(getClass().getResource(filenames[0])),new ImageIcon(getClass().getResource(filenames[1]))};
	
	public Gui2(){
		super("title");
		setLayout(new FlowLayout());
		
		box = new JComboBox(filenames);
		box.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange()==ItemEvent.SELECTED) {
					picture.setIcon(pics[box.getSelectedIndex()]);
				}
			}
		});
		
		add(box);
		picture = new JLabel(pics[0]);
		add(picture);
	}
}
