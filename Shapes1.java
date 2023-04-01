import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
class MyPanel_1 extends JPanel {
	int shape = 0;
	public void paint(Graphics g){
		super.paint(g);
		if (shape==1) 
			g.drawLine(50,50,100,100);
		else if (shape==2) 
			g.drawRect(50,50,100,50);
 		else if (shape==3) 
 			g.drawOval(50,10,60,60);
 	}	
}
public class Shapes1 extends JFrame  implements ActionListener{
	Container container;       
	JMenuBar menubar;
	JMenu shapesmenu; 
	JRadioButtonMenuItem line, rectangle,circle;
	ButtonGroup g; 
	MyPanel_1 p;
	Shapes1(){
		super("Simple Shapes");
		container =getContentPane();
		menubar = new JMenuBar();
		menubar.add(shapesmenu=new JMenu("Shapes"));
		g = new ButtonGroup();
		shapesmenu.add(line = new JRadioButtonMenuItem("Line"));
		g.add(line);
	
		shapesmenu.add(rectangle = new JRadioButtonMenuItem("Rectangle"));
		g.add(rectangle);
		shapesmenu.add(circle = new JRadioButtonMenuItem("Circle"));
		g.add(circle);
	
		container.add(menubar,BorderLayout.NORTH);
		container.add(p = new MyPanel_1());
		line.addActionListener(this);
		rectangle.addActionListener(this);
		circle.addActionListener(this);
		setSize(300,300);
		setVisible(true);
	}
   	public void actionPerformed(ActionEvent event){
   		if (event.getSource()==line)
   			p.shape = 1;
   		else if (event.getSource()==rectangle)
   			p.shape = 2;
   		else if (event.getSource()==circle)
   			p.shape = 3;
		p.repaint();
   	}
   	public static void main(String args[]){
		new Shapes1();	
	}
}
