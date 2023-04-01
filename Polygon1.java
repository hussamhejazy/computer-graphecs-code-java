import java.awt.*;
import javax.swing.*;

////////////////////////////////////////////////
public class Polygon1 extends JFrame {
	public Polygon1(){
		setSize(500,500);
		setVisible(true);
	}
	 public void paint(Graphics g){
		super.paint(g);
		
		int x[] = {100, 200,200,100 };
		int y[] = {100, 100,150,150 };
		g.drawPolygon(x,y,4);
		/*
		Polygon p = new Polygon();
		p.addPoint(100,100);
		p.addPoint(200,100);
		p.addPoint(200,150);
		p.addPoint(100,150);
		g.drawPolygon(p);
		*/
	}
	
	public static void main(String args[]){
		new Polygon1();
	}
}