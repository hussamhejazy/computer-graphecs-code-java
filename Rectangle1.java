import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
////////////////////////////////////////////////
public class Rectangle1 extends JFrame implements ActionListener{
	Color c = Color.red;
	Timer t;
	public Rectangle1(){
		t = new Timer (1000,this);
		t.start();
		setSize(300,300);
		setVisible(true);
	}
	 public void paint(Graphics g){
		super.paint(g);	
		g.setColor(c);
		g.fillRect(100,100,150,100);
	}
	
	public void actionPerformed(ActionEvent event){
		c = Color.blue;
		repaint();	
		t.stop();
	}
	public static void main(String args[]){
		new Rectangle1();
	}
}