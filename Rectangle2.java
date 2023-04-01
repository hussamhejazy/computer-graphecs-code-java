import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
////////////////////////////////////////////////
public class Rectangle2 extends JFrame implements ActionListener{
	Timer t;
	public Rectangle2(){
		t = new Timer (1000,this);
		t.start();
		setSize(300,300);
		setVisible(true);
	}
	 public void paint(Graphics g){
		super.paint(g);
		System.out.println("paint");
		g.setColor(Color.red);
		g.fillRect(100,100,150,100);
	
	}
	public void draw(Graphics g){
		g.setColor(Color.blue);
		g.fillRect(100,100,150,100);
		
	}
	public void actionPerformed(ActionEvent event){
		draw(getGraphics());
		t.stop();
	}
	public static void main(String args[]){
		new Rectangle2();
	}
}