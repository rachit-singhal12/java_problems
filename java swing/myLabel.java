import java.awt.Color;

import javax.swing.*;
public class myLabel extends JFrame {
	myLabel()
	{
		//create frame
				JFrame frame = new JFrame();
				frame.setVisible(true);
				frame.setTitle("Labels practice");
				//frame.setSize(500,500);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//frame.setResizable(false);
				
				//Add JLabels in frame
				JLabel label =new JLabel();
				label.setText("Hello Rachit here ");
				label.setIcon(new ImageIcon("src/download.jpg"));
				label.setHorizontalTextPosition(JLabel.CENTER);
				label.setVerticalTextPosition(JLabel.TOP);
				label.setForeground(Color.white);
				label.setBackground(Color.BLACK);
				label.setOpaque(true);
				label.setVerticalAlignment(JLabel.CENTER);
				label.setHorizontalAlignment(JLabel.CENTER);
				
				//set border of an label
				// border = BorderFactory.createLineBorder(Color.green);
				label.setBorder(BorderFactory.createLineBorder(Color.green,4));
				frame.add(label);
				frame.pack();
	}
}
