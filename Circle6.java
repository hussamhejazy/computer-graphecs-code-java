import java.awt.*;
import javax.swing.*;
////////////////////////////////////////////////
public class Circle6 extends JFrame {
	int x, y, r =100, xc =200, yc =200;
	public Circle6(){
 		setSize(400,400);
		setVisible(true);
	}
	public void paint(Graphics g){
		super.paint(g);
		g.drawLine(0, yc, 399,yc);
		g.drawLine(xc, 0, xc, 399);
		for (int a = 0; a<= 45; a++){
			x = (int)Math.round(r * Math.cos(a * Math.PI / 180));
			y = (int)Math.round(r * Math.sin(a * Math.PI / 180));
			
			
			g.setColor(Color.red);
			g.drawLine(xc + x, yc + y, xc + x, yc + y);
			
			
			g.setColor(Color.black);
			g.drawLine(xc + x, yc - y, xc + x, yc - y);
			
			g.setColor(Color.green);
			g.drawLine(xc + y, yc + x, xc + y, yc + x);
			
			g.setColor(Color.cyan);
			g.drawLine(xc + y, yc - x, xc + y, yc - x);
			
			g.setColor(Color.yellow);
			g.drawLine(xc - y, yc - x, xc - y, yc - x);
			
			g.setColor(Color.blue);
			g.drawLine(xc - x, yc - y, xc - x, yc - y);
			
			g.setColor(Color.white);
			g.drawLine(xc - x, yc + y, xc - x, yc + y);
			
			g.setColor(Color.magenta);
			g.drawLine(xc - y, yc + x, xc - y, yc + x);
		
		}
	}
	public static void main(String args[]){
		new Circle6();
	}
}