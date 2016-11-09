package bucky;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Gui extends JFrame {

	private JTextField tf;
	private Font pf;
	private Font bf;
	private Font itf;
	private Font bif;
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton itb;
	private JRadioButton bib;
	
	public ButtonGroup group;
	
	public Gui () {
		super("title");
		setLayout(new FlowLayout());
		
		tf = new JTextField("Bucky is awesome");
		add(tf);
		
		pb = new JRadioButton("Plan", true);
		bb = new JRadioButton("Bold", false);
		itb = new JRadioButton("Italic", false);
		bib = new JRadioButton("Bold Italic", false);		
		add(pb);
		add(bb);
		add(itb);
		add(bib);
		
		group = new ButtonGroup();		
		group.add(pb);
		group.add(bb);
		group.add(itb);
		group.add(bib);
		
		pf = new Font("Serif", Font.PLAIN, 14);
		bf = new Font("Serif", Font.BOLD, 14);
		itf = new Font("Serif", Font.ITALIC, 14);
		bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		tf.setFont(pf);
		
		pb.addItemListener(new Handler(pf));
		bb.addItemListener(new Handler(bf));
		itb.addItemListener(new Handler(itf));
		bib.addItemListener(new Handler(bif));
		
	}
	
	private class Handler implements ItemListener {
		private Font font;
		public Handler(Font f){
			font = f;
		}
		public void itemStateChanged(ItemEvent e) {
			tf.setFont(font);
		}
	};	
	
	
	
}
