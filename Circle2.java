import java.awt.*;
import javax.swing.*;

////////////////////////////////////////////////
public class Circle2 extends JFrame {
	int xc = 250, yc =250; 
	public Circle2(){
		setSize(500,500);
		setVisible(true);
	}
	 public void paint(Graphics g){
	 	super.paint(g);
	 	for (int i=10;i<=150;i=i+10)
	 		g.drawOval(xc-i,yc-i,2*i,2*i); 
			
	}
	public static void main(String args[]){
		new Circle2();
	  
	}
}