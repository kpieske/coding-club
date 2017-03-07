import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphic6 extends JPanel{
  JFrame frame;
  Graphics2D g2;	
  Line2D myLine;
 
  public void paintComponent(Graphics g){
	 	super.paintComponent(g);
	 	g2=(Graphics2D) g; 
	    
  g2.setPaint(Color.black); 	
  g2.drawRect(0,0,600,600);
  g2.fillRect(0, 0, 600, 600);
  
  for(int  i=0; i<=20; i++){
	  for(int j=0; j<=5; j++){
		  for(int k=0; k<=5; k++){
  	int R=0;
  	int G=0;
  	int B=227-i*10;
  Color myColor=new Color(R,G,B);
  g2.setPaint(myColor);
  int xPoints6[]={(50+i*1)+j*100,(100-i*1)+j*100,(50-i*1)+j*100,(0+i*1)+j*100};
	  int yPoints6[]={(0+i*1)+k*100,(50+i*1)+k*100,(100-i*1)+k*100,(50-i*1)+k*100};
	  g2.fillPolygon(xPoints6,yPoints6,4);
  }}}
  for(int  i=0; i<=10; i++){
	  for(int j=0; j<=12; j++){
		  for(int k=0; k<=4; k++){
  	int R=76+i*10;
  	int G=0;
  	int B=153;
  Color myColor=new Color(R,G,B);
  g2.setPaint(myColor);
  int xPoints6[]={(25+i*1)+j*50,(50-i*1)+j*50,(25-i*1)+j*50,(0+i*1)+j*50};
	  int yPoints6[]={(75+i*1)+k*100,(100+i*1)+k*100,(125-i*1)+k*100,(100-i*1)+k*100};
	  g2.fillPolygon(xPoints6,yPoints6,4);
  }}}
  g2.setPaint(Color.black);
  g2.fillRect(0, 0, 50, 600);
  g2.fillRect(0, 0, 600, 50);
  g2.fillRect(0, 550, 600, 50);
  g2.fillRect(550, 0, 50, 600);
  
  for(int  i=0; i<=17; i++){
	  for(int  j=0; j<=17; j++){
	  	int R=76+i*10;
	  	int G=0;
	  	int B=153;
	  Color myColor=new Color(R,G,B);
	  g2.setPaint(myColor);
	  int xPoints6[]={(50+i*1)+j*100,(100-i*1)+j*100,(50-i*1)+j*100,(0+i*1)+j*100};
		  int yPoints6[]={(0+i*1),(25+i*1),(50-i*1),(25-i*1)};
		  g2.fillPolygon(xPoints6,yPoints6,4);
  }}
  for(int  i=0; i<=17; i++){
	  for(int  j=0; j<=17; j++){
	  	int R=76+i*10;
	  	int G=0;
	  	int B=153;
	  Color myColor=new Color(R,G,B);
	  g2.setPaint(myColor);
	  int xPoints6[]={(50+i*1)+j*100,(100-i*1)+j*100,(50-i*1)+j*100,(0+i*1)+j*100};
	  int yPoints6[]={550+i*1,575+i*1,600-i*1,575-i*1};
		  g2.fillPolygon(xPoints6,yPoints6,4);
  }}
  
  for(int  i=0; i<=17; i++){
	  for(int  j=0; j<=4; j++){
	  	int R=76+i*10;
	  	int G=0;
	  	int B=153;
	  Color myColor=new Color(R,G,B);
	  g2.setPaint(myColor);
	  int xPoints6[]={(25+i*1),(50-i*1),(25-i*1),(0+i*1)};
	  int yPoints6[]={(50+i*1)+j*100,(100+i*1)+j*100,(150-i*1)+j*100,(100-i*1)+j*100};
		  g2.fillPolygon(xPoints6,yPoints6,4);
  }}
  for(int  i=0; i<=17; i++){
	  for(int  j=0; j<=4; j++){
	  	int R=76+i*10;
	  	int G=0;
	  	int B=153;
	  Color myColor=new Color(R,G,B);
	  g2.setPaint(myColor);
	  int xPoints6[]={(575+i*1),(600-i*1),(575-i*1),(550+i*1)};
	  int yPoints6[]={(50+i*1)+j*100,(100+i*1)+j*100,(150-i*1)+j*100,(100-i*1)+j*100};
		  g2.fillPolygon(xPoints6,yPoints6,4);
  }}
 
  }
	    
	    public static void main(String[] args) {
 
 Graphic6 panel=new Graphic6();
        JFrame frame= new JFrame();
        frame.setVisible(true);
        frame.setSize (600,625);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Basic Frame");
        frame.add(panel);  
        
 }
} 
