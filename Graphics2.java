
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphics2 extends JPanel{
  JFrame frame;
  Graphics2D g2;
  
 public Graphics2() {
 repaint();


 }

 public void paintComponent(Graphics g){
 super.paintComponent(g);
        g2=(Graphics2D) g; 
        
        
        g2.setPaint(Color.black);
        g2.drawRect(0,0,600,600);
        g2.fillRect(0,0,600,600);
        
        g2.setPaint(Color.red);
        g2.drawRect(575,0,25,25);
        
        g2.setPaint(Color.orange);
        g2.drawRect(550,0,25,25);
        g2.drawRect(575,25,25,25);
        
        for(int i=0; i<=2; i++){
        	g2.setPaint(Color.yellow);
        	g2.drawRect(525+i*25,0+i*25,25,25);
        }
        
        for(int i=0; i<=3; i++){
        	g2.setPaint(Color.green);
            g2.drawRect(500+i*25,0+i*25,25,25);
        }
        for(int i=0; i<=4; i++){
        	int R=153;
            int G=255;
            int B=255;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        	g2.drawRect(475+i*25,0+i*25,25,25);
        }
        for(int i=0; i<=5; i++){
            	int R=153;
                int G=51;
                int B=255;
                Color myColor=new Color(R,G,B);
               g2.setPaint(myColor);
        	g2.drawRect(450+i*25,0+i*25,25,25);
        }
        for(int i=0; i<=6; i++){
        	int R=255;
            int G=0;
            int B=0;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        	g2.drawRect(425+i*25,0+i*25,25,25);
        }
        for(int i=0; i<=7; i++){
        	int R=255;
            int G=128;
            int B=0;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        	g2.drawRect(400+i*25,0+i*25,25,25);
        }
        for(int i=0; i<=8; i++){
        	int R=255;
            int G=255;
            int B=0;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        	g2.drawRect(375+i*25,0+i*25,25,25);
        }
        for(int i=0; i<=9; i++){
        	int R=0;
            int G=255;
            int B=0;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        	g2.drawRect(350+i*25,0+i*25,25,25);
        }
        for(int i=0; i<=10; i++){
        	int R=153;
            int G=255;
            int B=255;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        	g2.drawRect(325+i*25,0+i*25,25,25);
        }
        for(int i=0; i<=11; i++){
        	int R=153;
            int G=51;
            int B=255;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        	g2.drawRect(300+i*25,0+i*25,25,25);
        }
        for(int i=0; i<=12; i++){
        	int R=255;
            int G=0;
            int B=0;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        	g2.drawRect(275+i*25,0+i*25,25,25);
        }
        for(int i=0; i<=13; i++){
        	g2.setPaint(Color.orange);
        	g2.drawRect(250+i*25, 0+i*25, 25, 25);
        }
        for(int i=0; i<=14; i++){
        	g2.setPaint(Color.yellow);
        	g2.drawRect(225+i*25, 0+i*25, 25, 25);
        }
        for(int i=0; i<=15; i++){
        	g2.setPaint(Color.green);
        	g2.drawRect(200+i*25, 0+i*25, 25, 25);
        }
        for(int i=0; i<=16; i++){
        	int R=153;
            int G=255;
            int B=255;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        	g2.drawRect(175+i*25, 0+i*25, 25, 25);
        }
        for(int i=0; i<=17; i++){
        	int R=153;
            int G=51;
            int B=255;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        	g2.drawRect(150+i*25, 0+i*25, 25, 25);
        }
        for(int i=0; i<=18; i++){
        	g2.setPaint(Color.red);
        	g2.drawRect(125+i*25, 0+i*25, 25, 25);
        }
        for(int i=0; i<=19; i++){
        	g2.setPaint(Color.orange);
        	g2.drawRect(100+i*25, 0+i*25, 25, 25);
        }
        for(int i=0; i<=20; i++){
        	g2.setPaint(Color.yellow);
        	g2.drawRect(75+i*25, 0+i*25, 25, 25);
        }
        for(int i=0; i<=21; i++){
        	g2.setPaint(Color.green);
        	g2.drawRect(50+i*25, 0+i*25, 25, 25);
        }
        for(int i=0; i<=22; i++){
        	int R=153;
            int G=255;
            int B=255;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        	g2.drawRect(25+i*25, 0+i*25, 25, 25);
        }
        for(int i=0; i<=23; i++){
        	int R=153;
            int G=51;
            int B=255;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
            g2.drawRect(0+i*25,0+i*25,25,25);	
        }
        for(int i=0; i<=22; i++){
        	int R=153;
            int G=51;
            int B=255;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        	g2.drawRect(0+i*25, 25+i*25, 25, 25);
        }
        for(int i=0; i<=21; i++){
        	int R=153;
            int G=255;
            int B=255;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        	g2.drawRect(0+i*25, 50+i*25, 25, 25);
        }
        for(int i=0; i<=20; i++){
        	g2.setPaint(Color.green);
        	g2.drawRect(0+i*25, 75+i*25, 25, 25);
        }
        for(int i=0; i<=19; i++){
        	g2.setPaint(Color.yellow);
        	g2.drawRect(0+i*25, 100+i*25, 25, 25);
        }
        for(int i=0; i<=18; i++){
        	g2.setPaint(Color.orange);
        	g2.drawRect(0+i*25, 125+i*25, 25, 25);
        }
        for(int i=0; i<=17; i++){
        	g2.setPaint(Color.red);
        	g2.drawRect(0+i*25, 150+i*25, 25, 25);
        }
        for(int i=0; i<=16; i++){
        	int R=153;
            int G=51;
            int B=255;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        	g2.drawRect(0+i*25, 175+i*25, 25, 25);
        }
        for(int i=0; i<=15; i++){
        	int R=153;
            int G=255;
            int B=255;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        	g2.drawRect(0+i*25, 200+i*25, 25, 25);
        }
        for(int i=0; i<=14; i++){
        	g2.setPaint(Color.green);
        	g2.drawRect(0+i*25, 225+i*25, 25, 25);
        }
        for(int i=0; i<=13; i++){
        	g2.setPaint(Color.yellow);
        	g2.drawRect(0+i*25, 250+i*25, 25, 25);
        }
        for(int i=0; i<=12; i++){
        	g2.setPaint(Color.orange);
        	g2.drawRect(0+i*25, 275+i*25, 25, 25);
        }
        for(int i=0; i<=11; i++){
        	g2.setPaint(Color.red);
        	g2.drawRect(0+i*25, 300+i*25, 25, 25);
        }
        for(int i=0; i<=10; i++){
        	int R=153;
            int G=51;
            int B=255;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        	g2.drawRect(0+i*25, 325+i*25, 25, 25);
        }
        for(int i=0; i<=9; i++){
        	int R=153;
            int G=255;
            int B=255;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        	g2.drawRect(0+i*25, 350+i*25, 25, 25);
        }
        for(int i=0; i<=8; i++){
        	g2.setPaint(Color.green);
        	g2.drawRect(0+i*25, 375+i*25, 25, 25);
        }
        for(int i=0; i<=7; i++){
        	g2.setPaint(Color.yellow);
        	g2.drawRect(0+i*25, 400+i*25, 25, 25);
        }
        for(int i=0; i<=6; i++){
        	g2.setPaint(Color.orange);
        	g2.drawRect(0+i*25, 425+i*25, 25, 25);
        }
        for(int i=0; i<=5; i++){
        	g2.setPaint(Color.red);
        	g2.drawRect(0+i*25, 450+i*25, 25, 25);
        }
        for(int i=0; i<=4; i++){
        	int R=153;
            int G=51;
            int B=255;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        	g2.drawRect(0+i*25, 475+i*25, 25, 25);
        }
        for(int i=0; i<=3; i++){
        	int R=153;
            int G=255;
            int B=255;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        	g2.drawRect(0+i*25, 500+i*25, 25, 25);
        }
        for(int i=0; i<=2; i++){
        	g2.setPaint(Color.green);
        	g2.drawRect(0+i*25, 525+i*25, 25, 25);
        }
        for(int i=0; i<=1; i++){
        	g2.setPaint(Color.yellow);
        	g2.drawRect(0+i*25, 550+i*25, 25, 25);
        }
        for(int i=0; i<=0; i++){
        	g2.setPaint(Color.orange);
        	g2.drawRect(0+i*25, 575+i*25, 25, 25);
        }
    	}
     
 
 
 public static void main(String[] args) {
 
 Graphics2 panel=new Graphics2();
        JFrame frame= new JFrame();
        frame.setVisible(true);
        frame.setSize (700,700);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Basic Frame");
        frame.add(panel);  
        
 }
}

