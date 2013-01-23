import javax.swing.*;
import java.awt.*;
import javax.swing.JComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Window extends JFrame implements ActionListener {
  JLabel label6;
	JButton button1, button2, button3, button4, button5, button6;
	int pressed = 0, count;
	Timer timer = new Timer(100, this);
	boolean on = false;
	
	public Window() {
		// Creates the jFrame window
		super("shiFTP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setSize(600,600);
		
		// Formats the JFrame
		Container c = getContentPane();
		c.setBackground(Color.green);
		FlowLayout layout = new FlowLayout();
		c.setLayout(layout);
		
		
		label6 = new JLabel("This can say whatever we want it to say.");
		button1 = new JButton("Button 1");
		button1.addActionListener(this);
		button2 = new JButton("Button 2");
		button2.addActionListener(this);
		button3 = new JButton("Button 3");
		button3.addActionListener(this);
		button4 = new JButton("Button 4");
		button4.addActionListener(this);
		button5 = new JButton("Button 5");
		button5.addActionListener(this);
		button6 = new JButton("Button 6");
		button6.addActionListener(this);
		
		c.add(button1);
		c.add(button2);
		c.add(button3);
		c.add(button4);
		c.add(button5);
		c.add(label6);
		c.add(button6);
		
		setVisible(true);
	}
	
	public void makeLine() {
	
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			label6.setText("You pressed Button 1.");
		}
		else if (e.getSource() == button2) {
			label6.setText("You pressed Button 2.");
		}
		else if (e.getSource() == button3) {
			label6.setText("You pressed Button 3.");
		}
		else if (e.getSource() == button4) {
			label6.setText("You pressed Button 4.");
		}
		else if (e.getSource() == button5) {
			label6.setText("You pressed Button 5.");
		}
		else if (e.getSource() == button6) {
			if (on == true) {
				timer.stop();
				on = false;
			}
			else {
				timer.start();
				on = true;
			}
		}
		else {
			count++;
			System.out.println(count);
		}
	}
	
	
	public static void main(String[] args) {
		new Window();
	}
}
