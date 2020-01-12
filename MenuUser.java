import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
class MenuUser extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b5,b6;
	String str1;
	JLabel ta;
	MenuUser()
	{
		this.setLayout(null);

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM user");

			while(rs.next())
				str1=rs.getString("User_name");	
			
		}
			catch(Exception e)
			{	
				System.out.println("EXE" +" "+e);
			}


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






		JLabel lab=new JLabel("WELCOME "+str1);
		lab.setBounds(700,50,500,40);
		lab.setFont (lab.getFont ().deriveFont (48.0f));
		lab.setForeground(Color.yellow);
		add(lab);

		b1=new JButton("NEW BOOKING");
		b1.setBounds(300,150,350,100);
		b1.setFont (b1.getFont ().deriveFont (32.0f));
		b1.setForeground(Color.red);
		add(b1);

		b2=new JButton("UPDATE BOOKING");
		b2.setBounds(300,300,350,100);
		b2.setFont (b2.getFont ().deriveFont (32.0f));
		b2.setForeground(Color.red);
		add(b2);

		b3=new JButton("PARKING");
		b3.setBounds(300,450,350,100);
		b3.setFont (b3.getFont ().deriveFont (32.0f));
		b3.setForeground(Color.red);
		add(b3);

		b4=new JButton("BILL");
		b4.setBounds(300,600,350,100);
		b4.setFont (b4.getFont ().deriveFont (32.0f));
		b4.setForeground(Color.red);
		add(b4);

		b5=new JButton("EXIT");
		b5.setBounds(500,750,250,90);
		b5.setFont (b5.getFont ().deriveFont (32.0f));
		b5.setForeground(Color.red);
		add(b5);

		b6=new JButton("PREVIOUS");
		b6.setBounds(200,750,250,90);
		b6.setFont (b6.getFont ().deriveFont (32.0f));
		b6.setForeground(Color.red);
		add(b6);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		wadapt w1=new wadapt();
		addWindowListener(w1);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			Bookstep1 f2=new Bookstep1();
			f2.setTitle("ENTERIES");
			f2.setSize(950,950);
			f2.setVisible(true);
			Color c1=new Color(0,76,153);
			f2.getContentPane().setBackground(c1);
		}
		if(ae.getSource()==b2)
		{
			UpdateBook f=new UpdateBook();
			f.setTitle("ENTERIES");
			f.setSize(950,950);
			f.setVisible(true);
			Color c1=new Color(0,76,153);
			f.getContentPane().setBackground(c1);
		}
		if(ae.getSource()==b3)
		{	
			try
			{

				Vehicle f4=new Vehicle();
				f4.setTitle("Vehicle");
				f4.setSize(950,950);
				f4.setVisible(true);
				Color c1=new Color(0,76,153);
				f4.getContentPane().setBackground(c1);
			}	
			catch(Exception e)
			{
				System.out.println("EXE "+e);
			}
		}
		if(ae.getSource()==b4)
		{
			BillBook f1=new BillBook();
			f1.setTitle("Vehicle");
			f1.setSize(950,950);
			f1.setVisible(true);
			Color c1=new Color(0,76,153);
			f1.getContentPane().setBackground(c1);
		}
		if(ae.getSource()==b5)
		{
			System.exit(0);
		}
		if(ae.getSource()==b6)
		{
			MainFrame1 f1=new MainFrame1();
			f1.setTitle("MainFrame");
			f1.setSize(950,950);
			Color c1=new Color(0,76,153);
			f1.getContentPane().setBackground(c1);
			f1.setVisible(true);
			f1.setBackground(Color.pink);
		}

			String str = ae.getActionCommand();
    if(str.equals("Close"))
      System.exit(0);
    else if(str.equals("Today"))
      ta.setText("Today: " + new java.util.Date());
	}
	class wadapt extends WindowAdapter
	{
		public void windowClosing(WindowEvent we)
		{
			dispose();
		}
		public void windowActivated(WindowEvent we)
		{
			setBackground(Color.pink);
		}
		public void windowDeactivated(WindowEvent we)
		{
			setBackground(Color.orange);
		}
	}
}