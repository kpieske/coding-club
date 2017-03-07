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

		public class WInd_Chill_Calculator extends JFrame implements ActionListener{
			public JLabel label1, label2, label3, label6;
			public JTextField textBox1, textBox2;
			public JTextField answerBox1;
			public JButton button1;
			
			public WInd_Chill_Calculator()
			{
				setLayout(null);
			setSize(400,300);
			setTitle("Wind CHill Calculator GUI");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			getContentPane().setBackground(Color.LIGHT_GRAY);
			
			label1 = new JLabel("Wind Chill Calculator");
			label2 = new JLabel("Temperature");
			textBox1=new JTextField("");
			button1=new JButton("Calculate");
			label1.setBounds(150,40,200,20);
			label2.setBounds(25,70,130,20);
			textBox1.setBounds(150,70,130,20);
			button1.setBounds(150,160,130,20);
			add(label1);
			add(label2);
			add(textBox1);
			add(button1);
			button1.addActionListener(this);
			textBox1.addActionListener(this);
			
			label6 = new JLabel("Wind Temp");
			answerBox1=new JTextField("");
			label6.setBounds(25,190,130,20);
			answerBox1.setBounds(150,190,130,20);
			add(label6);
			add(answerBox1);
			
			label3 = new JLabel("Wind Speed");
			textBox2=new JTextField("");
			label3.setBounds(25,100,130,20);
			textBox2.setBounds(150,100,130,20);
			add(label3);
			add(textBox2);
			textBox2.addActionListener(this);
			
			}
			public void actionPerformed(ActionEvent e){ 
			//public static void (main String[] args) {
				int Temperature = Integer.parseInt(textBox1.getText());
				int WindSpeed = Integer.parseInt(textBox2.getText());
				int t = Temperature;
				int v = WindSpeed;
				double WindTemp;
		
				WindTemp = 35.75 + 0.6215*t +(0.4275*t-35.75)*(Math.pow(v ,0.16));
				//hSystem.out.println(round(WindTemp,1));
				answerBox1.setText(" "+round(WindTemp,1));
	}
				public static void main(String[] args)
			{
				WInd_Chill_Calculator s=new WInd_Chill_Calculator();
				s.setVisible(true);
				}
		 
		 

		 
	private static double round (double x, int i){
		int y = (int) (Math.round(x*(Math.pow(10, i))));
		return(double) y / (Math.pow(10, i));
	} 

	}


