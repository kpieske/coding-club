
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Customized_Colors extends JPanel{
  JFrame frame;
  Graphics2D g2;
  
 public Customized_Colors() {
 repaint();


 }

 public void paintComponent(Graphics g){
 super.paintComponent(g);
        g2=(Graphics2D) g; 
        
        g2.setPaint(Color.white);
        g2.drawRect(0,0,600,600);
        g2.fillRect(0,0,600,600);
        
        int R=151;
        int G=0;
        int B=151;
   //Creates the color and changes the pen to the new color.
        Color myColor=new Color(R,G,B);
        g2.setPaint(myColor);
        
       // g2.setPaint(Color.black);  //sets color to black
        g2.setStroke(new BasicStroke(2));  //sets stroke to 2 fuck dude
        Line2D myLine=new Line2D.Double(300,0,300,300);
        
        g2.setStroke(new BasicStroke(3));
    	for(int i=0; i<=10; i++){
        myLine=new Line2D.Double(300,0+i*30,300+i*30,300); //(start-x, start-y, end-x, end-y)
         g2.draw(myLine); }
 }

       
 
 public static void main(String[] args) {
 
	 Customized_Colors panel=new Customized_Colors();
        JFrame frame= new JFrame();
        frame.setVisible(true);
        frame.setSize (700,700);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Basic Frame");
        frame.add(panel);  
        
 }
}
