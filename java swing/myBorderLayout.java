import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
public class myBorderLayout extends JFrame{
	JFrame frame;
	myBorderLayout()
	{
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("BORER LAYOUY");
		frame.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.red);		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.green);		
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.blue);		
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.orange);
		JPanel panel5 = new JPanel();
		panel5.setBackground(Color.cyan);
		
		frame.setLayout(new BorderLayout(10,10));
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.EAST);
		frame.add(panel3,BorderLayout.WEST);
		frame.add(panel4,BorderLayout.SOUTH);
		frame.add(panel5,BorderLayout.CENTER);
		
		panel5.setLayout(new BorderLayout());
		JPanel panel6 = new JPanel();
		panel1.setBackground(Color.gray);		
		JPanel panel7 = new JPanel();
		panel2.setBackground(Color.pink);
		panel5.add(panel6,BorderLayout.NORTH);
		panel5.add(panel7,BorderLayout.EAST);
	}
}
