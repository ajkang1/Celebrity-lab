import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextArea;

public class SimpleGUIRunner
{
	public static void main(String[] args)
	{
		JFrame sample = new JFrame();
		sample.setSize(800, 600);
		
		//set a layout manager by default to try to add
		//components that are not on top of each other
		sample.setLayout(new FlowLayout());
		
		
		//connect x button to exiting program
		sample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//^^ without the line above, the program will run even if JFrame is closed
		
		JButton myButton = new JButton("Start");
		myButton.setBackground(new Color(255, 215, 0));
		myButton.setPreferredSize(new Dimension(300, 100));
		
		//add  component to the JFrame
		sample.add(myButton);
		
		/*YOUR TURN
		 * Find another component "widget" to read up on and
		 * add the component to the GUI
		 */
		
		JCheckBox anotherButton = new JCheckBox("I'm mentally here");
		
		//try to add it
		sample.add(anotherButton);
		
		JRadioButton radioB = new JRadioButton("I'm mentally here");
		
		sample.add(radioB);
		
		JSlider slide = new JSlider(0, 100, 0);
		slide.setPreferredSize(new Dimension(500, 20));
		
		JTextArea input = new JTextArea(10, 20);
		sample.add(input);
		
		sample.add(slide);
		
		
		sample.setVisible(true);
		
	}

}
