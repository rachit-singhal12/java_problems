import java.awt.Color;

import javax.swing.*;
public class myPanel {
	myPanel()
	{

		//creation of java frame
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Jpanel practice");
		frame.setSize(500,500);
		frame.setLayout(null);

		//creating a label
		JLabel label = new JLabel();
		label.setText("Hello Rachit");
		label.setForeground(Color.white);
		//creation of java panels or containers
		JPanel rp = new JPanel();
		JPanel bp = new JPanel();
		JPanel gp = new JPanel();
		JPanel cp = new JPanel();
		rp.setBounds(0,0,250,250);
		rp.setBackground(Color.RED);
		bp.setBounds(250,0,250,250);
		bp.setBackground(Color.BLACK);
		gp.setBounds(0,250,250,250);
		gp.setBackground(Color.GREEN);
		cp.setBounds(250,250,250,250);
		cp.setBackground(Color.CYAN);
		bp.add(label);
		frame.add(cp);
		frame.add(gp);
		frame.add(bp);
		frame.add(rp);
	}
}
