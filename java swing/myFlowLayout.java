import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;
public class myFlowLayout extends JFrame{
	JFrame frame;
	myFlowLayout()
	{
		
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("FLOW LAYOUT");
		frame.setLayout(null);
		
		JButton label1 = new JButton("1");
		JButton label2 = new JButton("2");
		JButton label3 = new JButton("3");
		JButton label4 = new JButton("4");		
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.red);		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.green);		
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.blue);		
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.orange);
		
		panel1.add(label1);
		panel2.add(label2);
		panel3.add(label3);
		panel4.add(label4);
		
		frame.setLayout(new FlowLayout());
		//frame.add(label1,FlowLayout.LEFT);
		//frame.add(label2,FlowLayout.RIGHT);
		frame.add(label3,FlowLayout.CENTER);
		//frame.add(label4,FlowLayout.TRAILING);
	}
}
