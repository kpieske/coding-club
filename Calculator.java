import javax.swing.JLabel;
		import javax.swing.JTextField;
		import java.awt.Color;
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
		import javax.swing.JLabel;
		import javax.swing.JTextField;

		public class Calculator extends JFrame implements ActionListener{
			//public JLabel label1, label2, label3, label4;
			public JTextField textBox1, textBox2;
			public JTextField answerBox1, answerBox2;
			public JButton buttonEq, buttonP, buttonS, buttoncl, buttonM, buttonD;
			public JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;
			
			double a,b,c;
			double rT = 0;
			double operation=0;
			double number1;
			double count=1;
			
			public Calculator()
			{
				setLayout(null);
			setSize(200,325);
			setTitle("Calculator");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			getContentPane().setBackground(Color.gray);
		
			textBox1=new JTextField("");
			
			textBox1.setBounds(0,0,200,50);
			
			add(textBox1);
			
			textBox1.addActionListener(this);
			
			buttonEq=new JButton("=");
			buttonP=new JButton("+");
			buttonS=new JButton("-");
			buttoncl=new JButton("Clear");
			buttonM=new JButton("x");
			buttonD=new JButton("/");
			
			buttonEq.setBounds(150,250,50,50);
			buttonP.setBounds(150,150,50,50);
			buttonS.setBounds(150,200,50,50);
			buttoncl.setBounds(100,250,50,50);
			buttonM.setBounds(150,50,50,50);
			buttonD.setBounds(150,100,50,50);
			
			
			add(buttonEq);
			add(buttonP);
			add(buttonS);
			add(buttoncl);
			add(buttonM);
			add(buttonD);
			
			buttonEq.addActionListener(this);
			buttonP.addActionListener(this);
			buttonS.addActionListener(this);
			buttoncl.addActionListener(this);
			buttonM.addActionListener(this);
			buttonD.addActionListener(this);
			
			button1=new JButton("1");
			button2=new JButton("2");
			button3=new JButton("3");
			button4=new JButton("4");
			button5=new JButton("5");
			button6=new JButton("6");
			button7=new JButton("7");
			button8=new JButton("8");
			button9=new JButton("9");
			
			button1.setBounds(0,50,50,50);
			button2.setBounds(50,50,50,50);
			button3.setBounds(100,50,50,50);
			button4.setBounds(0,100,50,50);
			button5.setBounds(50,100,50,50);
			button6.setBounds(100,100,50,50);
			button7.setBounds(0,150,50,50);
			button8.setBounds(50,150,50,50);
			button9.setBounds(100,150,50,50);
			
			add(button1);
			add(button2);
			add(button3);
			add(button4);
			add(button5);
			add(button6);
			add(button7);
			add(button8);
			add(button9);
			
			button1.addActionListener(this);
			button2.addActionListener(this);
			button3.addActionListener(this);
			button4.addActionListener(this);
			button5.addActionListener(this);
			button6.addActionListener(this);
			button7.addActionListener(this);
			button8.addActionListener(this);
			button9.addActionListener(this);
			

			
			}
			public void actionPerformed(ActionEvent e){
				

				if (e.getSource()==button1)
				{
					
					textBox1.setText(textBox1.getText()+"1");
					
					textBox1.requestFocusInWindow();
				}
				
				if (e.getSource()==button2)
				{
					
					//number1 = textBox1.setText(textBox1.getText()+"2");
					
				   textBox1.requestFocusInWindow();
				}
				if (e.getSource()==button3)
				{
					
					textBox1.setText(textBox1.getText()+"3");
					
					textBox1.requestFocusInWindow();
				}
		
				if (e.getSource()==buttonP)
				{
					if (operation==0){
					rT = Double.parseDouble(textBox1.getText());
					operation=1;
					textBox1.requestFocusInWindow();
				}
					else if(operation==1){
					a = Double.parseDouble(textBox1.getText());
					rT= add(rT, a);
					textBox1.setText(Double.toString(rT));
					textBox1.requestFocusInWindow();
					}}
				if (e.getSource()==buttonS)
				{
					rT = Double.parseDouble(textBox1.getText());
					operation=2;
					textBox1.requestFocusInWindow();
				}
				if (e.getSource()==buttonM)
				{
					rT = Double.parseDouble(textBox1.getText());
					operation=3;
					textBox1.requestFocusInWindow();
				}
				if (e.getSource()==buttonD)
				{
					rT = Double.parseDouble(textBox1.getText());
					operation=4;
					textBox1.requestFocusInWindow();
				}
				if (e.getSource()==buttonEq)
				{
					b = Double.parseDouble(textBox1.getText());
				if (operation==1) rT=add(rT,b);
				else if (operation==2) rT=subtract(rT,b);
				else if (operation==3) rT=multiply(rT,b);
				else if (operation==4) rT=divide(rT,b);
				textBox1.setText(Double.toString(rT));
				operation=0;
				}
				if (e.getSource()==buttoncl)
				{
					rT=0;
					operation=0;
					textBox1.requestFocusInWindow();
					textBox1.setText("");
				}}
			
			public static void main (String[] args){
			Calculator myCalculator = new Calculator();
			double result1 = myCalculator.add(6,4);
			double result2 = myCalculator.subtract(6,4);
			double result3 = myCalculator.multiply(6,4);
			double result4 = myCalculator.divide(16,4);
			System.out.println(result1);
			System.out.println(result2);
			System.out.println(result3);
			System.out.println(result4);
			{
				Calculator s=new Calculator();
				s.setVisible(true);
				}
			}

			public double add (double a, double b){
			return (a+b);	
			}
			public double subtract (double a, double b){
			return (a-b);	
			}
			public double multiply (double a, double b){
			return (a*b);
			}
			public double divide (double a, double b){
			return (a/b);
			}
	}




	


