		import javax.swing.JLabel;
		import javax.swing.JTextField;
		import java.awt.Color;
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;

		import javax.swing.JFrame;
		import javax.swing.JLabel;
		import javax.swing.JTextField;

		public class GUIex1 extends JFrame implements ActionListener{
			public JLabel label1, label2, label3, label4;
			public JTextField textBox1, textBox2;
			public JTextField answerBox1, answerBox2;
			public String myName;
			
			public GUIex1()
			{
				setLayout(null);
			setSize(400,300);
			setTitle("Graphic User Interface Example 1");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			getContentPane().setBackground(Color.white);
			
				label1 = new JLabel("label");
				
			textBox1=new JTextField("name");
			answerBox1=new JTextField("This will repeat your name");
			label1.setBounds(100,40,200,20);
			textBox1.setBounds(100,70,200,20);
			answerBox1.setBounds(100,100,200,20);
			add(label1);
			add(textBox1);
			add(answerBox1);
			textBox1.addActionListener(this);
			
			label2 = new JLabel ("12 + ");
			label3 = new JLabel (" = ");
			label4 = new JLabel ("A different example using an integer");
			
			textBox2= new JTextField ("");
			
			answerBox2=new JTextField("");
		label2.setBounds(25,160,35,20);
		label4.setBounds(25,140,250,20);
			textBox2.setBounds(60,160,40,20);
			label3.setBounds(100,160,20,20);
		answerBox2.setBounds(120,160,50,20);
			add(label2);
			add(label4);
			add(label3);
			add(textBox2);
		add(answerBox2);
		textBox2.addActionListener(this);
			}
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==textBox1){
					myName=textBox1.getText();
					answerBox1.setText(myName);
					
							}
						
				
			if(e.getSource()==textBox2){
				int theNumber=Integer.parseInt(textBox2.getText());
				int answer=12+theNumber;
					answerBox2.setText(Integer.toString(answer));
			}
			}
			public static void main(String[] args)
			{
				GUIex1 s=new GUIex1();
				s.setVisible(true);
				}
			}


