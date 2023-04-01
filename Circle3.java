import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
////////////////////////////////////////////////
public class Circle3 extends JFrame implements ActionListener{
	int xc =250, yc =250, i =10; 
	Timer timer;
	public Circle3(){
		timer = new Timer(700,this);
	    timer.start();	
		setSize(500,500);
		setVisible(true);
		
	}
	 public void paint(Graphics g){
	    super.paint(g);
	 	g.drawOval(xc-i,yc-i,2*i,2*i); 
			
	}
	public void actionPerformed(ActionEvent event){
		i +=10;
		if (i<=150)
			getGraphics().drawOval(xc-i,yc-i,2*i,2*i); 
			
		else
			timer.stop();
	}
	public static void main(String args[]){
		new Circle3();
	}
}