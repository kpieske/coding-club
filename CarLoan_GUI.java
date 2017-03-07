 import javax.swing.JLabel;
		import javax.swing.JTextField;
		import java.awt.Color;
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
		import javax.swing.JLabel;
		import javax.swing.JTextField;
		import javax.swing.*;

		public class CarLoan_GUI extends JFrame implements ActionListener{
			public JLabel label1, label2, label3, label4, label5, label6;
			public JTextField textBox1, textBox2, textBox3, textBox4;
			public JTextField answerBox1;
			public JButton button1;
			public String myName;
			
			public CarLoan_GUI()
			{
				setLayout(null);
			setSize(500,500);
			setTitle("Graphic User Interface Example 1");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			getContentPane().setBackground(Color.CYAN);
			
			label1 = new JLabel("Car Loan Calculator");
			label2 = new JLabel("Car Cost");
			textBox1=new JTextField("");
			button1=new JButton("Calculate");
			label1.setBounds(150,40,200,20);
			label2.setBounds(25,70,130,20);
			textBox1.setBounds(150,70,130,20);
			button1.setBounds(150,220,130,20);
			add(label1);
			add(label2);
			add(textBox1);
			add(button1);
			button1.addActionListener(this);
			textBox1.addActionListener(this);
			
			label6 = new JLabel("Monthly Payment");
			answerBox1=new JTextField("");
			label6.setBounds(25,250,130,20);
			answerBox1.setBounds(150,250,130,20);
			add(label6);
			add(answerBox1);
			
			label3 = new JLabel("Car Downpayment");
			textBox2=new JTextField("");
			label3.setBounds(25,100,130,20);
			textBox2.setBounds(150,100,130,20);
			add(label3);
			add(textBox2);
			textBox2.addActionListener(this);
			
			label4 = new JLabel("Interest Rate");
			textBox3=new JTextField("");
			label4.setBounds(25, 130, 130, 20);
			textBox3.setBounds(150,130,130,20);
			add(label4);
			add(textBox3);
			textBox3.addActionListener(this);
			
			label5 = new JLabel("Loan Length");
			textBox4=new JTextField("");
			label5.setBounds(25,160,130,20);
			textBox4.setBounds(150,160,130,20);
			add(label5);
			add(textBox4);
			textBox4.addActionListener(this);
			}
			public void actionPerformed(ActionEvent e){ 

				if(e.getSource()==button1){
					
					int loanLength = Integer.parseInt(textBox4.getText());
					double interestRate = Integer.parseInt(textBox3.getText());
					int downPayment = Integer.parseInt(textBox2.getText());
					int carCost = Integer.parseInt(textBox1.getText());
					int loanAmount = carCost-downPayment;
					int p = loanAmount;
					int n = loanLength*12;
					double yearRate = interestRate/100;
					double r = yearRate/12;
					double a = p*(r*(Math.pow((1+r),n)))/(Math.pow((1+r),n)-1);
					double monthlyPayment = round(a,2);
					answerBox1.setText("$"+monthlyPayment);
					if (downPayment >= carCost)
					{
					JOptionPane.showMessageDialog(null, "You don't need a car loan");
					}
					if (loanLength <= 0)
					{
					JOptionPane.showMessageDialog(null, "You can't have a 0% interest rate!");
					}
					if (interestRate <= 0)
					{
						JOptionPane.showMessageDialog(null, "You don't need a car loan");
					}
					}
						
				
				//Integer.parseInt(textBox2.getText());
				
			}
			public static void main(String[] args)
			{
				CarLoan_GUI s=new CarLoan_GUI();
				s.setVisible(true);
				}
			private static double round (double x, int i){
				int y = (int) (Math.round(x*(Math.pow(10, i))));
				return(double) y / (Math.pow(10, i));
			} 

			

		}

	


