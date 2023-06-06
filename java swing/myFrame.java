import java.awt.Color;

import javax.swing.*;
public class myFrame extends JFrame{
	
	myFrame(String str,int size1,int size2)
	{
		this.setVisible(true);
		this.setSize(size1,size2);
		this.setResizable(false);
		this.setTitle(str);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.green);
		this.setLayout(null);
	}
}
