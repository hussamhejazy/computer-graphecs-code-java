import java.awt.*;
import javax.swing.*;
////////////////////////////////////////////////
public class Circle5 extends JFrame {
	int x, y, r = 100, xc = 250, yc = 250;
	public Circle5(){
 		setSize(500,500);
		setVisible(true);
	}
	public void paint(Graphics g){
		super.paint(g);
//    drawLine(int x1, int y1, int x2, int y2)
		g.drawLine(0, yc, 499,yc);
		g.drawLine(xc, 0, xc, 499);
		for (int a = 0;a <= 360;a++){
			x = (int)Math.round(r * Math.cos(a * Math.PI / 180));
			y = (int)Math.round(r * Math.sin(a * Math.PI /180));
			g.drawLine(xc + x, yc - y, xc + x, yc - y);
		}
	}
	public static void main(String args[]){
		new Circle5();
	}
}