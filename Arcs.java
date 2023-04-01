import java.awt.*;
import javax.swing.*;

////////////////////////////////////////////////
public class Arcs extends JFrame {
	public Arcs(){
		setSize(500,500);
		setVisible(true);
	}
	 public void paint(Graphics g){
	 	super.paint(g);
             //  drawRect(int x, int y, int width, int height)
             //drawArc(int x,int y,int width,int height,int startAngle,int arcAngle)
	 	g.drawRect(100,100,300,300);
	 	g.drawArc(50,50,100,100,270,90);
		g.drawArc(350,50,100,100,180,90);	
		g.drawArc(350,350,100,100,90,90);	
		g.drawArc(50,350,100,100,0,90);		
	}
	public static void main(String args[]){
		new Arcs();
	}
}