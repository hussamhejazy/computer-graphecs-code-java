import java.awt.*;
import javax.swing.*;
 import java.util.*;      
public class Line extends JFrame{
	public Line(){
		super("Line Drawing");
		setSize(400,300);
		setVisible(true);
    }
  	
	
    public void paint(Graphics g){
		super.paint(g);
    	g.drawLine(50,50,200,200);
    	g.setFont(new Font("serif",Font.BOLD,30));
    	g.drawString("Hello",200,100);
    }
    
    	
    
    public static void main(String args[]){
    	Line l =new Line();
   		
    }
}