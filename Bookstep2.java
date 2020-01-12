import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
class Bookstep2 extends JFrame implements ActionListener,ItemListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,ta;
	JButton b1,b2,bt1,bt2;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
	JCheckBox c1,c2;
	Choice ch1;
	String str1,str2,str3,str4,str5,strp;
	JComboBox pay;
	String string1;
	wadapt w1;
	Bookstep2()
	{	
		this.setLayout(null);

			Font font1=new Font("ARIAL",Font.BOLD,20);
										setFont(font1);

										MenuBar mBar = new MenuBar();
									    setMenuBar(mBar);   // add menu bar to frame
									                                // create menus
									    Menu files = new Menu("Files");
									    Menu date = new Menu("Date");
									    Menu exit = new Menu("Exit");
									                                 // add menus to menu bar
									    mBar.add(files);
									    mBar.add(date);
									    mBar.add(exit);
									                             // create menu items to menus
									    date.add(new MenuItem("Today"));
									    exit.add(new MenuItem("Close"));
									                               // linking listener
									    files.addActionListener(this);
									    date.addActionListener(this);
									    exit.addActionListener(this);




		ta=new JLabel();
   		ta.setBounds(25,5,500,100);
   		ta.setFont (ta.getFont ().deriveFont (20.0f));
   		ta.setForeground(Color.yellow);
    	add(ta);




		
		// Font font1=new Font("ARIAL",Font.BOLD,20);
		// setFont(font1);
		l1=new JLabel("Type of Room");
		l1.setBounds(200,120,350,40);
		l1.setFont (l1.getFont ().deriveFont (20.0f));
		l1.setForeground(Color.yellow);
		add(l1);

		c1=new JCheckBox("AC Rooms");
		c1.setBounds(650,120,100,30);
		c1.setFont (c1.getFont ().deriveFont (20.0f));
		add(c1);

		c2=new JCheckBox("Non AC Rooms");
		c2.setBounds(770,120,200,30);
		c2.setFont (c2.getFont ().deriveFont (20.0f));
		add(c2);

		l2=new JLabel("Number of Rooms*");
		l2.setBounds(200,200,350,40);
		l2.setFont (l2.getFont ().deriveFont (20.0f));
		l2.setForeground(Color.yellow);
		add(l2);

		t2=new JTextField();
		t2.setBounds(650,200,200,40);
		t2.setFont (t2.getFont ().deriveFont (20.0f));
		add(t2);
		

		l3=new JLabel("Number of Days");
		l3.setBounds(200,260,350,40);
		l3.setFont (l3.getFont ().deriveFont (20.0f));
		l3.setForeground(Color.yellow);
		add(l3);

		t3=new JTextField();
		t3.setBounds(650,260,200,40);
		t3.setFont (t3.getFont ().deriveFont (20.0f));
		add(t3);
		
		l4=new JLabel("Identification Proof");
		l4.setBounds(200,380,350,40);
		l4.setFont (l4.getFont ().deriveFont (20.0f));
		l4.setForeground(Color.yellow);
		add(l4);

		t4=new JTextField();
		t4.setBounds(650,380,200,40);
		t4.setFont (t4.getFont ().deriveFont (20.0f));
		add(t4);
		
		
		l5=new JLabel("Rate (per_Day)");
		l5.setBounds(200,320,350,40);
		l5.setFont (l5.getFont ().deriveFont (20.0f));
		l5.setForeground(Color.yellow);
		add(l5);

		t5=new JTextField();
		t5.setBounds(650,320,200,40);
		t5.setFont (t5.getFont ().deriveFont (20.0f));
		add(t5);

		l6=new JLabel("Payment Options");
		l6.setBounds(200,440,350,40);
		l6.setFont (l6.getFont ().deriveFont (20.0f));
		l6.setForeground(Color.yellow);
		add(l6);

		String[] payment = {"--select--", "Credit Card", "Cash","Paytm","PayPal"};
		 pay = new JComboBox(payment);
		pay.setBounds(650,440,200,40);
		pay.setFont (pay.getFont ().deriveFont (20.0f));
		add(pay);
		string1= (String)pay.getSelectedItem();
		System.out.println("String  "+string1);


		l7=new JLabel("Charges");
		l7.setBounds(200,500,350,40);
		l7.setFont (l7.getFont ().deriveFont (20.0f));
		l7.setForeground(Color.yellow);
		add(l7);

		t7=new JTextField();
		t7.setBounds(650,500,100,40);
		t7.setFont (t7.getFont ().deriveFont (20.0f));
		add(t7);

		bt1=new JButton("Calculate");
		bt1.setBounds(780,500,200,40);
		bt1.setFont (bt1.getFont ().deriveFont (20.0f));
		add(bt1);

		l8=new JLabel("Other Charges");
		l8.setBounds(200,560,350,40);
		l8.setFont (l8.getFont ().deriveFont (20.0f));
		l8.setForeground(Color.yellow);
		add(l8);

		t8=new JTextField();
		t8.setBounds(650,560,200,40);
		t8.setFont (t8.getFont ().deriveFont (20.0f));
		add(t8);
		
		l9=new JLabel("Discount");
		l9.setBounds(200,620,350,40);
		l9.setFont (l9.getFont ().deriveFont (20.0f));
		l9.setForeground(Color.yellow);
		add(l9);

		t9=new JTextField();
		t9.setBounds(650,620,200,40);
		t9.setFont (t9.getFont ().deriveFont (20.0f));
		add(t9);
		

		l10=new JLabel("Total Charges");
		l10.setBounds(200,680,350,40);
		l10.setFont (l10.getFont ().deriveFont (20.0f));
		l10.setForeground(Color.yellow);
		add(l10);

		t10=new JTextField();
		t10.setBounds(650,680,150,40);
		t10.setFont (t10.getFont ().deriveFont (20.0f));
		add(t10);

		bt2=new JButton("Calculate");
		bt2.setBounds(830,680,150,40);
		bt2.setFont (bt2.getFont ().deriveFont (20.0f));
		add(bt2);
				
		l11=new JLabel("Serial Number");
		l11.setBounds(200,740,350,40);
		l11.setFont (l11.getFont ().deriveFont (20.0f));
		l11.setForeground(Color.yellow);
		add(l11);

		t11=new JTextField();
		t11.setBounds(650,740,200,40);
		t11.setFont (t11.getFont ().deriveFont (20.0f));
		add(t11);

		b1=new JButton("Submit");
		b2=new JButton("Cancel");
		b1.setBounds(300,800,150,50);
		b1.setFont (b1.getFont ().deriveFont (20.0f));
		b1.setForeground(Color.red);
		add(b1);
		add(b2);
		b2.setBounds(500,800,150,50);
		b2.setFont (b2.getFont ().deriveFont (20.0f));
		b2.setForeground(Color.red);
		b1.addActionListener(this);
		b2.addActionListener(this);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		c1.addItemListener(this);
		c2.addItemListener(this);
		w1=new wadapt();
		addWindowListener(w1);

	} 
	public void actionPerformed(ActionEvent ae)
	{
		int n1=Integer.parseInt(t2.getText());
		int n2=Integer.parseInt(t3.getText());
		int n3=Integer.parseInt(t5.getText());
		

		int temp=n1*n2*n3;
		
		if(ae.getSource()==bt1)
		{
			t7.setText(""+temp);
		}
		if(ae.getSource()==bt2)
		{
			int n4=Integer.parseInt(t8.getText());
			int n5=Integer.parseInt(t9.getText());
			int temp2=temp+n4;
			float temp3=temp2-(temp2*n5)/100.0f;
			t10.setText(""+temp3);
		}
		
		if(ae.getSource()==b1)
		{	
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","root");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from roomdetails");

				String str1=t2.getText();
				// st.executeUpdate("Insert into guest_details (first_name) values ('"+str1+"')");
				str2=t3.getText();
				str3=t4.getText();
				str4=t10.getText();
				string1=(String)pay.getSelectedItem();
				str5=t11.getText();
				st.executeUpdate("Insert into roomdetails  (serial_number,rooms,days,id_proof,payment,total_charges) values ('"+str5+"','"+str1+"','"+str2+"','"+str3+"','"+string1+"','"+str4+"')");
				
				Bookstep4 f3=new Bookstep4();
				f3.setVisible(true);
				Color c1=new Color(0,76,153);
				f3.getContentPane().setBackground(c1);
				f3.setTitle("Confirmation Window");
				f3.setSize(950,950);
				f3.setBackground(Color.pink);

			}catch(Exception e)
			{
				System.out.println("EXE  "+e);
			}
		}
		else if(ae.getSource()==b2)
			dispose();


		String str = ae.getActionCommand();
    if(str.equals("Close"))
      System.exit(0);
    else if(str.equals("Today"))
      ta.setText("Today: " + new java.util.Date());
		
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==ch1)
		{
			String str1=ch1.getSelectedItem();
			ch1.select(str1);
		}

	}
	class wadapt extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		dispose();
	}
	public void windowDeactivated(WindowEvent we)
	{
		setBackground(Color.orange);
	}
	public void windowActivated(WindowEvent we)
	{
		setBackground(Color.pink);
	}
}
}
class help
{
	public static void main(String args[])
	{
		Bookstep2 f3=new Bookstep2();
		f3.setVisible(true);
		f3.setTitle("Confirmation Window");
		f3.setSize(950,950);
		f3.setBackground(Color.pink);
	}
}