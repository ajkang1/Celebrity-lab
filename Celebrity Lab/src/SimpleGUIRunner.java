import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class SimpleGUIRunner
{
	public static void main(String[] args)
	{
		JFrame sample = new JFrame();
		sample.setSize(800, 600);
		sample.getContentPane().setBackground(new Color(250, 227, 227));
		
		//set a layout manager by default to try to add
		//components that are not on top of each other
		sample.setLayout(new FlowLayout());
		
		
		//connect x button to exiting program
		sample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//^^ without the line above, the program will run even if JFrame is closed
		
		//Celebrity Game Title
		JLabel title = new JLabel("Celebrity Game", SwingConstants.CENTER);
		title.setOpaque(true);
		title.setBackground(new Color(248, 192, 200));
		title.setPreferredSize(new Dimension(800, 20));
		sample.add(title);

		
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
		
		JButton addCeleb = new JButton("Add Celebrity");
		addCeleb.setBackground(new Color(235, 242, 250));
		addCeleb.setPreferredSize(new Dimension(600, 50));
		sample.add(addCeleb);
		
		//Start Button
		JButton start = new JButton("Start");
		start.setBackground(new Color(248, 192, 200));
		start.setPreferredSize(new Dimension(600, 100));
		
		//add  component to the JFrame
		sample.add(start);
		
		
		sample.setVisible(true);
		
	}

}
