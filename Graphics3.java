
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphics3 extends JPanel{
  JFrame frame;
  Graphics2D g2;
  int a= 10;
  int b=23;
  Line2D myLine;
  
 public void paintComponent(Graphics g){
 super.paintComponent(g);
        g2=(Graphics2D) g; 
        
        g2.setPaint(Color.black);
        g2.drawRect(0,0,600,600);
        g2.fillRect(0,0,600,600);
       
        for (int i=0; i<=10; i++){
        g2.setPaint(Color.cyan);
        myLine=new Line2D.Double(300+i*30,300,300,0);
        g2.draw(myLine);
        int randomNumber=(int)(((b-a)+1)*Math.random())+a;
        }
        for (int i=0; i<=10; i++){
        g2.setPaint(Color.cyan);
        myLine=new Line2D.Double(300-i*30,300,300,0);
        g2.draw(myLine);
        int randomNumber=(int)(((b-a)+1)*Math.random())+a;
        }
        for (int i=0; i<=10; i++){
        g2.setPaint(Color.cyan);
        myLine=new Line2D.Double(300+i*30,300,300,600);
        g2.draw(myLine);
        int randomNumber=(int)(((b-a)+1)*Math.random())+a;
         }
        for (int i=0; i<=10; i++){
        g2.setPaint(Color.cyan);
        myLine=new Line2D.Double(300-i*30,300,300,600);
        g2.draw(myLine);
        int randomNumber=(int)(((b-a)+1)*Math.random())+a;
        }
        
        for(int i=0; i<=10; i++){
            myLine=new Line2D.Double(0,300+i*30,0+i*30,600); //(start-x, start-y, end-x, end-y)
             g2.draw(myLine); }
        for(int i=0; i<=10; i++){
            myLine=new Line2D.Double(0,300-i*30,0+i*30,0); //(start-x, start-y, end-x, end-y)
             g2.draw(myLine); }
        for(int i=0; i<=10; i++){
            myLine=new Line2D.Double(600,300-i*30,600-i*30,0); //(start-x, start-y, end-x, end-y)
             g2.draw(myLine); }
        for(int i=0; i<=10; i++){
            myLine=new Line2D.Double(600,300+i*30,600-i*30,600); //(start-x, start-y, end-x, end-y)
             g2.draw(myLine); }
 }
 
 public static void main(String[] args) {
 
 Graphics3 panel=new Graphics3();
        JFrame frame= new JFrame();
        frame.setVisible(true);
        frame.setSize (700,700);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Basic Frame");
        frame.add(panel);  
        
 }
}
