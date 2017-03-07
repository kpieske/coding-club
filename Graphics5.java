
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphics5 extends JPanel{
  JFrame frame;
  Graphics2D g2;	
  Line2D myLine;
 
  public void paintComponent(Graphics g){
	 	super.paintComponent(g);
	 	g2=(Graphics2D) g; 
	    
	    for(int i=0; i<=20; i++){
        	int R=100+i*7;
            int G=0;
            int B=0;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);  	
	    int xPoints4[]={0+i*10,600-i*10,600-i*10,0+i*10};
	    int yPoints4[]={0+i*10,0+i*10,600-i*10,600-i*10};
	    g2.fillPolygon(xPoints4,yPoints4,4);
	    }
	    for(int i=0; i<=13; i++){
        	int R=215+i*3;
            int G=120+i*5;
            int B=0;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
	 	int xPoints1[]={0+i*10,0+i*10,600-i*10,600-i*10};
	    int yPoints1[]={0+i*10,600-i*10,0+i*10,600-i*10};
	    g2.fillPolygon(xPoints1,yPoints1,4);
	    }
	    for(int i=0; i<=15; i++){
        	int R=200+i*3;
            int G=190+i*3;
            int B=0;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
	    int xPoints2[]={0+i*10,300,600-i*10,300};
	    int yPoints2[]={300,600-i*10,300,0+i*10};
	    g2.fillPolygon(xPoints2,yPoints2,4);
	    }
	    for(int i=0; i<=10; i++){
        	int R=50+i*10;
            int G=200+i*5;
            int B=0;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
	    int xPoints3[]={150+i*10,150+i*10,450-i*10,450-i*10};
	    int yPoints3[]={150+i*10,450-i*10,450-i*10,150+i*10};
	    g2.fillPolygon(xPoints3,yPoints3,4);
	    }
	    for(int i=0; i<=8; i++){
        	int R=0;
            int G=153+i*10;
            int B=153+i*10;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
   	    int xPoints5[]={150+i*10,300,450-i*10,300};
   	    int yPoints5[]={300,150+i*10,300,450-i*10};
   	    g2.fillPolygon(xPoints5,yPoints5,4);
        	}
	    for(int  i=0; i<=8; i++){
	    	int R=76+i*10;
        	int G=0;
        	int B=153;
        Color myColor=new Color(R,G,B);
        g2.setPaint(myColor);
        int xPoints6[]={225+i*10,375-i*10,375-i*10,225+i*10};
   	  int yPoints6[]={225+i*10,225+i*10,375-i*10,375-i*10};
   	  g2.fillPolygon(xPoints6,yPoints6,4);
	    }
	    
  }
	    
	    public static void main(String[] args) {
 
 Graphics5 panel=new Graphics5();
        JFrame frame= new JFrame();
        frame.setVisible(true);
        frame.setSize (600,625);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Basic Frame");
        frame.add(panel);  
        
 }
}
