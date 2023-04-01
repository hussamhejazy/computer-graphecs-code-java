import java.awt.*;
import javax.swing.*;

////////////////////////////////////////////////
public class Polygon2 extends JFrame {
	public Polygon2(){
		setSize(500,500);
		setVisible(true);
	}
	 public void paint(Graphics g){
		super.paint(g);
		//int x1[] = {100, 150,200};
		//int y1[] = {100, 150,100};
		g.setColor(Color.red);
		g.fillPolygon(new int[]{100, 150,200},new int[]{100, 150,100},3);
		
		/*
		int x2[] = {200, 150,200};
		int y2[] = {100, 150,200};
		g.setColor(Color.green);
		g.fillPolygon(x2,y2,3);
		*/
		g.setColor(Color.green);
		g.fillPolygon(new int[]{200,150,200},new int[]{100,150,200},3);
		
		
		//int x3[] = {200, 150,100};
		//int y3[] = {200, 150,200};
		g.setColor(Color.magenta);
		g.fillPolygon(new int []{200, 150,100}, new int[]{200, 150,200},3);
		
		//int x4[] = {100, 150,100};
		//int y4[] = {200, 150,100};
		g.setColor(Color.yellow);
		g.fillPolygon(new int[]{100, 150,100}, new int[]{200, 150,100},3);
	
		
	}
	
	public static void main(String args[]){
		new Polygon2();
	}
}