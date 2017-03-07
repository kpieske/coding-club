
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Color_Fade extends JPanel{
  JFrame frame;
  Graphics2D g2;
  Line2D myLine;
 
  public void paintComponent(Graphics g){
	 	super.paintComponent(g);
	 	g2=(Graphics2D) g; 
	   
	    for(int i=0; i<=10; i++){
        	int R=130+i*5;
            int G=0;
            int B=0;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor); 
           g2.fillRect(0+i*10,0+i*10,600,600);
	    }
	    for(int i=0; i<=10; i++){
        	int R=215+i*3;
            int G=120+i*5;
            int B=0;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
           g2.fillRect(100+i*10,100+i*10,600,600);
	    }
	    for(int i=0; i<=15; i++){
        	int R=200+i*3;
            int G=190+i*3;
            int B=0;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
           g2.fillRect(200+i*10,200+i*10,600,600);
           }
	    for(int i=0; i<=10; i++){
        	int R=50+i*5;
            int G=200+i*3;
            int B=0;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
           g2.fillRect(300+i*10,300+i*10,600,600);
	    }
	    for(int i=0; i<=20; i++){
        	int R=0;
            int G=153+i*5;
            int B=153+i*5;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
           g2.fillRect(400+i*10,400+i*10,600,600);
   	    }
	    for(int  i=0; i<=20; i++){
	    	int R=150+i*5;
        	int G=0;
        	int B=255;
        Color myColor=new Color(R,G,B);
        g2.setPaint(myColor);
        g2.fillRect(500+i*10,500+i*10,600,600);
       }
  }
	    
	    public static void main(String[] args) {
 
	    Color_Fade panel=new Color_Fade();
        JFrame frame= new JFrame();
        frame.setVisible(true);
        frame.setSize (600,625);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Basic Frame");
        frame.add(panel);  
        
 }
}

