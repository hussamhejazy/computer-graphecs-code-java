import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//////////////////////////////////////////
public class Balls extends JFrame implements ActionListener{
   Timer timer ;
	public Balls(){
		super ("Simple Animation");
		timer = new Timer(700,this);
	    timer.start();
		setSize(400,400);
		setVisible(true);	
	}
	public void paint(Graphics g){
	 	super.paint(g);
              //  fillOval(int x, int y, int width, int height)
	  	g.setColor(Color.red);
	  	g.fillOval((int)(Math.random()*400),(int)(Math.random()*400),30,30);
	  	
	  	g.setColor(Color.yellow);
	  	g.fillOval((int)(Math.random()*400),(int)(Math.random()*400),30,30);
	 
	}
	public void actionPerformed(ActionEvent event){
		 repaint();
	}
 	public static void main(String args[]){
 		new Balls();
 	}
 }