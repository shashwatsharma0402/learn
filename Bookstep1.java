import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class Bookstep1 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,ta;
	JButton b1,b2;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
	String str1,str2,str3,str4,str5,str6,str7,str8,str9;
	Bookstep1()
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







		l1=new JLabel("Hotel Reservation");
		l1.setBounds(30,30,350,60);
		l1.setFont (l1.getFont ().deriveFont (25.0f));
		l1.setForeground(Color.yellow);
		add(l1);

		l2=new JLabel("First Name*");
		l2.setBounds(30,120,200,30);
		l2.setFont (l2.getFont ().deriveFont (25.0f));
		l2.setForeground(Color.yellow);
		add(l2);

		l3=new JLabel("Last Name*");
		l3.setBounds(420,120,200,30);
		l3.setFont (l3.getFont ().deriveFont (25.0f));
		l3.setForeground(Color.yellow);
		add(l3);

		t1=new JTextField();
		t1.setBounds(30,170,350,40);
		t1.setFont (t1.getFont ().deriveFont (25.0f));
		add(t1);

		

		t2=new JTextField();
		t2.setBounds(420,170,350,40);
		t2.setFont (t2.getFont ().deriveFont (25.0f));
		add(t2);
		
		
		
		l4=new JLabel("phone*");
		l4.setBounds(30,240,150,30);
		l4.setFont (l4.getFont ().deriveFont (25.0f));
		l4.setForeground(Color.yellow);
		add(l4);

		t3=new JTextField();
		t3.setBounds(30,290,500,40);
		t3.setFont (t3.getFont ().deriveFont (25.0f));
		add(t3);

		

		l5=new JLabel("E-Mail");
		l5.setBounds(30,360,100,40);
		l5.setFont (l5.getFont ().deriveFont (25.0f));
		l5.setForeground(Color.yellow);
		add(l5);

		t4=new JTextField();
		t4.setBounds(30,410,500,40);
		t4.setFont (t4.getFont ().deriveFont (25.0f));
		add(t4);

		

		l6=new JLabel("Arrival Date");
		l6.setBounds(30,480,200,30);
		l6.setFont (l6.getFont ().deriveFont (25.0f));
		l6.setForeground(Color.yellow);
		add(l6);

		l7=new JLabel("Departure Date*");
		l7.setBounds(420,480,350,30);
		l7.setFont (l7.getFont ().deriveFont (25.0f));
		l7.setForeground(Color.yellow);
		add(l7);

		t5=new JTextField();
		t5.setBounds(30,520,350,40);
		t5.setFont (t5.getFont ().deriveFont (25.0f));
		add(t5);

		t6=new JTextField();
		t6.setBounds(420,520,350,40);
		t6.setFont (t6.getFont ().deriveFont (25.0f));
		add(t6);

		l8=new JLabel("Number of Adults*");
		l8.setBounds(30,590,350,30);
		l8.setFont (l8.getFont ().deriveFont (25.0f));
		l8.setForeground(Color.yellow);
		add(l8);

		l9=new JLabel("Number of Children*");
		l9.setBounds(420,590,350,30);
		l9.setFont (l9.getFont ().deriveFont (25.0f));
		l9.setForeground(Color.yellow);
		add(l9);

		t7=new JTextField();
		t7.setBounds(30,630,350,40);
		t7.setFont (t7.getFont ().deriveFont (25.0f));
		add(t7);

		t8=new JTextField();
		t8.setBounds(420,630,350,40);
		t8.setFont (t8.getFont ().deriveFont (25.0f));
		add(t8);

		l10=new JLabel("Serial Number");
		l10.setBounds(30,700,250,40);
		l10.setFont (l10.getFont ().deriveFont (25.0f));
		l10.setForeground(Color.yellow);
		add(l10);

		t9=new JTextField();
		t9.setBounds(300,700,200,40);
		t9.setFont (t9.getFont ().deriveFont (25.0f));
		add(t9);


		b1=new JButton("Submit");
		b2=new JButton("Cancel");
		b1.setBounds(160,800,200,60);
		b1.setFont (b1.getFont ().deriveFont (25.0f));
		b1.setForeground(Color.red);
		add(b1);
		
		b2.setBounds(400,800,200,60);
		b2.setFont (b2.getFont ().deriveFont (25.0f));
		b2.setForeground(Color.red);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		wadapt w1=new wadapt();
		addWindowListener(w1);

	} 
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{	
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","root");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from guest_details");

				String str1=t1.getText();
				// st.executeUpdate("Insert into guest_details (first_name) values ('"+str1+"')");
				str2=t2.getText();
				str3=t3.getText();
				str4=t4.getText();
				str5=t5.getText();
				str6=t6.getText();
				str7=t7.getText();
				str8=t8.getText();
				str9=t9.getText();
				st.executeUpdate("Insert into guest_details  (serial_number,first_name,last_name,phone,email,arrival_date,departure_date,adults,children) values ('"+str9+"','"+str1+"','"+str2+"','"+str3+"','"+str4+"','"+str5+"','"+str6+"','"+str7+"','"+str8+"')");


			}catch(Exception e)
			{
				System.out.println("EXE  "+e);
			}
	
		
				Bookstep2 f3=new Bookstep2();
				f3.setVisible(true);
				f3.setTitle("Booking");
				Color c1=new Color(0,76,153);
				f3.getContentPane().setBackground(c1);
				f3.setSize(950,950);
				f3.setBackground(Color.pink);
		}
		else if(ae.getSource()==b2)
			dispose();



	String str = ae.getActionCommand();
    if(str.equals("Close"))
      System.exit(0);
    else if(str.equals("Today"))
      ta.setText("Today: " + new java.util.Date());

  
	}
	public class wadapt extends WindowAdapter
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
