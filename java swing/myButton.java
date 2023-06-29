import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class myButton extends JFrame implements ActionListener {
	JFrame frame;
	JButton button;
	myButton()
	{
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setTitle("MY BUTTON");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setResizable(false);
		
		button = new JButton();
		button.setBounds(170,170,100,100);
		button.addActionListener(this);
		button.setText("Click me");
		frame.add(button);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button)
		{
			//button.setEnabled(false);
			System.out.println("hello Rachit");
		}
	}
	
}
