package bucky;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class Gui4 extends JFrame {

	private JList<String> listLeft;
	private JList listRight;
	private JButton moveButton;
	
	private static String[] foodlist = {"bacon", "pork", "beef", "cheese", "sausage", "egg", "noodles"};
	
	public Gui4(){
		super("Title");
		setLayout(new FlowLayout());
		
		listLeft = new JList(foodlist);
		listLeft.setVisibleRowCount(5);
		listLeft.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(listLeft));
		
		add(listLeft);

		
		moveButton = new JButton(">>");
		moveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listRight.setListData(listLeft.getSelectedValuesList().toArray());
			}
		});
		add(moveButton);		
		listRight = new JList();
		listRight.setVisibleRowCount(5);
		listRight.setFixedCellHeight(15);
		listRight.setFixedCellWidth(50);
		listRight.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(listRight));
		add(listRight);
	}
}
