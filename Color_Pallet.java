
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Color_Pallet extends JPanel{
  JFrame frame;
  Graphics2D g2;
  
 public Color_Pallet() {
 repaint();


 }

 public void paintComponent(Graphics g){
 super.paintComponent(g);
        g2=(Graphics2D) g; 
        
        
        g2.setPaint(Color.black);
        g2.drawRect(0,0,450,450);
        g2.fillRect(0,0,450,450);
        
        for(int i=0; i<=4; i++){
        	g2.setPaint(Color.black);
        	g2.setStroke(new BasicStroke(2));
        	g2.drawRect(0,0+i*25,25,25);
        	//g2.setColor(Color.black);
            	int R=51+i*51;
                int G=0;
                int B=0;
                Color myColor=new Color(R,G,B);
               g2.setPaint(myColor);
            g2.fillRect(0,0+i*25,25,25);
        	}
        
        for(int i=0; i<=3; i++){
        	g2.setPaint(Color.black);
        	g2.drawRect(0,125+i*25,25,25);
        	g2.setColor(Color.black);
        	int R=255;
            int G=51+i*51;
            int B=51+i*51;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        g2.fillRect(0,125+i*25,25,25);
        	}
        for(int i=0; i<=4; i++){
        	g2.setPaint(Color.black);
        	g2.drawRect(25,0+i*25,25,25);
        	g2.setColor(Color.black);
        	int R=51+i*51;
            int G=25+i*26;
            int B=0;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        g2.fillRect(25,0+i*25,25,25);
        	}
        for(int i=0; i<=3; i++){
        	g2.setPaint(Color.black);
        	g2.drawRect(25,125+i*25,25,25);
        	g2.setColor(Color.black);
        	int R=255;
            int G=153+i*25;
            int B=51+i*51;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        g2.fillRect(25,125+i*25,25,25);
        	}
        for(int i=0; i<=4; i++){
        	g2.setPaint(Color.black);
        	g2.drawRect(50,0+i*25,25,25);
        	g2.setColor(Color.black);
        	int R=51+i*51;
            int G=51+i*51;
            int B=0;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        g2.fillRect(50,0+i*25,25,25);
        	}
        for(int i=0; i<=3; i++){
        	g2.setPaint(Color.black);
        	g2.drawRect(50,125+i*25,25,25);
        	g2.setColor(Color.black);
        	int R=255;
            int G=255;
            int B=51+i*51;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        g2.fillRect(50,125+i*25,25,25);
        	}
        for(int i=0; i<=4; i++){
        	g2.setPaint(Color.black);
        	g2.drawRect(75,0+i*25,25,25);
        	g2.setColor(Color.black);
        	int R=25+i*26;
            int G=51+i*51;
            int B=0;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        g2.fillRect(75,0+i*25,25,25);
        	}
        for(int i=0; i<=3; i++){
        	g2.setPaint(Color.black);
        	g2.drawRect(75,125+i*25,25,25);
        	g2.setColor(Color.black);
        	int R=128+i*26;
            int G=255;
            int B=51+i*51;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        g2.fillRect(75,125+i*25,25,25);
        	}
        for(int i=0; i<=4; i++){
        	g2.setPaint(Color.black);
        	g2.drawRect(100,0+i*25,25,25);
        	g2.setColor(Color.black);
        	int R=0;
            int G=51+i*51;
            int B=0;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        g2.fillRect(100,0+i*25,25,25);
        	}
        for(int i=0; i<=3; i++){
        	g2.setPaint(Color.black);
        	g2.drawRect(100,125+i*25,25,25);
        	g2.setColor(Color.black);
        	int R=51+i*51;
            int G=255;
            int B=51+i*51;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        g2.fillRect(100,125+i*25,25,25);
        	}
        for(int i=0; i<=4; i++){
        	g2.setPaint(Color.black);
        	g2.drawRect(125,0+i*25,25,25);
        	g2.setColor(Color.black);
        	int R=0;
            int G=51+i*51;
            int B=25+i*26;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        g2.fillRect(125,0+i*25,25,25);
        	}
        for(int i=0; i<=3; i++){
        	g2.setPaint(Color.black);
        	g2.drawRect(125,125+i*25,25,25);
        	g2.setColor(Color.black);
        	int R=51+i*51;
            int G=255;
            int B=153+i*25;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        g2.fillRect(125,125+i*25,25,25);
        	}
        for(int i=0; i<=4; i++){
        	g2.setPaint(Color.black);
        	g2.drawRect(150,0+i*25,25,25);
        	g2.setColor(Color.black);
        	int R=0;
            int G=51+i*51;
            int B=51+i*51;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        g2.fillRect(150,0+i*25,25,25);
        	}
        for(int i=0; i<=3; i++){
        	g2.setPaint(Color.black);
        	g2.drawRect(150,125+i*25,25,25);
        	g2.setColor(Color.black);
        	int R=51+i*51;
            int G=255;
            int B=255;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        g2.fillRect(150,125+i*25,25,25);
        	}
        for(int i=0; i<=4; i++){
        	g2.setPaint(Color.black);
        	g2.drawRect(175,0+i*25,25,25);
        	g2.setColor(Color.black);
        	int R=0;
            int G=25+i*26;
            int B=51+i*51;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        g2.fillRect(175,0+i*25,25,25);
        	}
        for(int i=0; i<=3; i++){
        	g2.setPaint(Color.black);
        	g2.drawRect(175,125+i*25,25,25);
        	g2.setColor(Color.black);
        	int R=51+i*51;
            int G=153+i*25;
            int B=255;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        g2.fillRect(175,125+i*25,25,25);
        	}
        for(int i=0; i<=4; i++){
        	g2.setPaint(Color.black);
        	g2.drawRect(200,0+i*25,25,25);
        	g2.setColor(Color.black);
        	int R=0;
            int G=0;
            int B=51+i*51;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        g2.fillRect(200,0+i*25,25,25);
        	}
        for(int i=0; i<=3; i++){
        	g2.setPaint(Color.black);
        	g2.drawRect(200,125+i*25,25,25);
        	g2.setColor(Color.black);
        	int R=51+i*51;
            int G=51+i*51;
            int B=255;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        g2.fillRect(200,125+i*25,25,25);
        	}
        for(int i=0; i<=4; i++){
        	g2.setPaint(Color.black);
        	g2.drawRect(225,0+i*25,25,25);
        	g2.setColor(Color.black);
        	int R=25+i*26;
            int G=0;
            int B=51+i*51;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        g2.fillRect(225,0+i*25,25,25);
        	}
        for(int i=0; i<=3; i++){
        	g2.setPaint(Color.black);
        	g2.drawRect(225,125+i*25,25,25);
        	g2.setColor(Color.black);
        	int R=153+i*25;
            int G=51+i*51;
            int B=255;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        g2.fillRect(225,125+i*25,25,25);
        	}
        for(int i=0; i<=4; i++){
        	g2.setPaint(Color.black);
        	g2.drawRect(250,0+i*25,25,25);
        	g2.setColor(Color.black);
        	int R=51+i*51;
            int G=0;
            int B=51+i*51;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        g2.fillRect(250,0+i*25,25,25);
        	}
        for(int i=0; i<=3; i++){
        	g2.setPaint(Color.black);
        	g2.drawRect(250,125+i*25,25,25);
        	g2.setColor(Color.black);
        	int R=255;
            int G=51+i*51;
            int B=255;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        g2.fillRect(250,125+i*25,25,25);
        	}
        for(int i=0; i<=4; i++){
        	g2.setPaint(Color.black);
        	g2.drawRect(275,0+i*25,25,25);
        	g2.setColor(Color.black);
        	int R=51+i*51;
            int G=0;
            int B=25+i*26;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        g2.fillRect(275,0+i*25,25,25);
        	}
        for(int i=0; i<=3; i++){
        	g2.setPaint(Color.black);
        	g2.drawRect(275,125+i*25,25,25);
        	g2.setColor(Color.black);
        	int R=255;
            int G=51+i*51;
            int B=153+i*25;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        g2.fillRect(275,125+i*25,25,25);
        	}
        for(int i=0; i<=7; i++){
        	g2.setPaint(Color.black);
        	g2.drawRect(300,0+i*25,25,25);
        	g2.setColor(Color.black);
        	int R=0+i*32;
            int G=0+i*32;
            int B=0+i*32;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        g2.fillRect(300,0+i*25,25,25);
        	}
        	g2.setPaint(Color.black);
        	g2.drawRect(300,200,25,25);
        	g2.setColor(Color.black);
        	int R=255;
            int G=255;
            int B=255;
            Color myColor=new Color(R,G,B);
           g2.setPaint(myColor);
        g2.fillRect(300,200,25,25);
 }
     
 
 
 public static void main(String[] args) {
 
	 Color_Pallet panel=new Color_Pallet();
        JFrame frame= new JFrame();
        frame.setVisible(true);
        frame.setSize (325,250);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Basic Frame");
        frame.add(panel);  
        
 }
}

