import java.awt.*;
import javax.swing.*;

////////////////////////////////////////////////
public class Circle1 extends JFrame {
	public Circle1(){
		setSize(500,500);
		setVisible(true);
	}
	 public void paint(Graphics g){
	 	super.paint(g);
	 	g.drawRect(100,100,300,300);
//     drawOval(int x, int y, int width, int height)
	 	g.drawOval(100,100,100,100);
		g.drawOval(300,100,100,100);	
		g.drawOval(300,300,100,100);	
		g.drawOval(100,300,100,100);		
		g.drawOval(200,200,100,100);		
	
	}
	
	public static void main(String args[]){
		new Circle1();
	}
}