package Calc;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	MyFrame(){
		
		this.setTitle("Fame Title goes here TicTakToe");/// sets the title of the window
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// this will set the window to close on closing the x
		this.setSize(420, 420);// setting up the size
		this.setResizable(false);// prevent this from being resized
		this.setVisible(true);// setting the voisibility
		
		
		ImageIcon image=new ImageIcon("logo2.png");// create an ImageIcon

		this.setIconImage(image.getImage());// chnage the this icon image
//		this.getContentPane().setBackground(Color.CYAN);
		this.getContentPane().setBackground(new Color(123,50,250));
//		this.getContentPane().setBackground(new Color(0xFF00FF));
	}

}
