package Calc;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class LearnGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*JFrame frame=new JFrame();// creating the frame
		frame.setTitle("Fame Title goes here TicTakToe");/// sets the title of the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// this will set the window to close on closing the x
		frame.setSize(420, 420);// setting up the size
		frame.setResizable(false);// prevent frame from being resized
		frame.setVisible(true);// setting the voisibility


		ImageIcon image=new ImageIcon("logo2.png");// create an ImageIcon

		frame.setIconImage(image.getImage());// chnage the frame icon image
//		frame.getContentPane().setBackground(Color.CYAN);
//		frame.getContentPane().setBackground(new Color(123,50,250));
		frame.getContentPane().setBackground(new Color(0xFF00FF));

		 */
		JLabel label=new JLabel();
		label.setText("Bro do you even code !!");
		Border border=BorderFactory.createLineBorder(Color.GREEN, 10, false);


		//		MyFrame myframe=new MyFrame();
		//		myframe.add(label);
		ImageIcon image=new ImageIcon("logo2.png");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); // sets text center , left right
		label.setVerticalTextPosition(JLabel.TOP);// sets text top  bottom , center of image icon
		label.setForeground(Color.green);
		label.setFont(new Font("MV Boli",Font.PLAIN,50));// set font of text
		label.setIconTextGap(-5);// gap between thetext and the immage icon
		
		label.setBackground(Color.black);// set the backgroud colour
		label.setOpaque(true);// display background color
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0, 0, 420, 420);

		JFrame frame=new JFrame();// creating the frame
		frame.setTitle("Fame Title goes here TicTakToe");/// sets the title of the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// this will set the window to close on closing the x
		frame.setSize(500, 500);// setting up the size
		frame.setResizable(false);// prevent frame from being resized
		frame.setVisible(true);// setting the voisibility
		frame.setLayout(null);
		frame.add(label);
//		frame.pack();

		// Jlabel = a GUI display area for a string or a text , image or both

	}

}
