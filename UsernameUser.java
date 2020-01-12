import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class UsernameUser extends JFrame implements ActionListener
{
	JButton b1,b2,b3;
	JTextField t1,t2;
	JLabel l1,l2,l;
	UsernameUser()
	{
		this.setLayout(null);

		l=new JLabel("USER LOGIN WINDOW");
		l.setBounds(320,100,450,100);
		l.setFont (l.getFont ().deriveFont (32.0f));
		l.setForeground(Color.yellow);
		add(l);

		l1=new JLabel("Username");
		l1.setBounds(200,250,250,80);
		l1.setFont (l1.getFont ().deriveFont (32.0f));
		l1.setForeground(Color.yellow);
		add(l1);

		t1=new JTextField();
		t1.setBounds(500,250,250,60);
		t1.setFont (t1.getFont ().deriveFont (32.0f));
		add(t1);

		l2=new JLabel("Password");
		l2.setBounds(200,380,250,80);
		l2.setFont (l2.getFont ().deriveFont (32.0f));
		l2.setForeground(Color.yellow);
		add(l2);

		t2=new JTextField();
		t2.setBounds(500,380,250,60);
		t2.setFont (t2.getFont ().deriveFont (32.0f));
		add(t2);

		b1=new JButton("<-Previous");
		b1.setBounds(175,550,225,60);
		b1.setFont (b1.getFont ().deriveFont (32.0f));
		add(b1);

		b2=new JButton("Next->");
		b2.setBounds(425,550,225,60);
		b2.setFont (b2.getFont ().deriveFont (32.0f));
		add(b2);

		b3=new JButton("Exit");
		b3.setBounds(675,550,225,60);
		b3.setFont (b3.getFont ().deriveFont (32.0f));
		add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		wadapt w1=new wadapt();
		addWindowListener(w1);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str1=t1.getText();
		String str2=t2.getText();
		if(ae.getSource()==b2)	
		{
			if(str2.equals("user"))
			{	
				try
				{	
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","root");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from user");
				
				st.executeUpdate("Insert into user  (User_name) values ('"+str1+"')");
			}
				catch(Exception e)
				{System.out.println("EXE "+e);}

				MenuUser f3=new MenuUser();
				f3.setVisible(true);
				f3.setTitle("Login Window");
				Color c1=new Color(0,76,153);
			f3.getContentPane().setBackground(c1);
				f3.setSize(950,950);
				dispose();
			}
			else
			{
				RetryUser f4=new RetryUser();
				f4.setVisible(true);
				f4.setTitle("Login Window");
				Color c1=new Color(0,76,153);
			f4.getContentPane().setBackground(c1);
				f4.setSize(950,950);
				f4.setBackground(Color.pink);
				dispose();
			}
		}
		else if(ae.getSource()==b3)
			System.exit(0);
		else if(ae.getSource()==b1)
			{
				MainFrame1 f1=new MainFrame1();
				f1.setTitle("step1");
				f1.setSize(900,900);
				f1.setVisible(true);
				Color c1=new Color(0,76,153);
			f1.getContentPane().setBackground(c1);
				f1.setBackground(Color.pink);
				dispose();
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