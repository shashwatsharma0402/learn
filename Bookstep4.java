import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class Bookstep4 extends JFrame implements ActionListener
{

	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	JLabel l,l1,l2,l3,l4,l5,l6,l7,l8;
	JButton b1,b2,b3;
	String str1,str2,str3,str4,str5,str6,str7,str8;
	Bookstep4()
	{
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM guest_details");

			while(rs.next())
			{
				
					str1=rs.getString("first_name");
					str2=rs.getString("last_name");
					str3=rs.getString("phone");
					str4=rs.getString("email");
				
				
			}
			rs=st.executeQuery("SELECT * FROM roomdetails");

			while(rs.next())
			{
				
					str5=rs.getString("rooms");
					str6=rs.getString("payment");
					str7=rs.getString("id_proof");
					str8=rs.getString("total_charges");
				
				
			}
		}
			catch(Exception e)
			{	
				System.out.println("EXE" +" "+e);
			}

		this.setLayout(null);
		// Font font1=new Font("ARIAL",Font.BOLD,20);
		// setFont(font1);
		l=new JLabel("Confirmation Window");
		l.setBounds(150,120,250,40);
		l.setFont (l.getFont ().deriveFont (20.0f));
		add(l);
		

		l1=new JLabel("First Name:");
		l1.setBounds(150,200,200,40);
		l1.setFont (l1.getFont ().deriveFont (20.0f));
		add(l1);
		t1=new JTextField(str1);
		t1.setBounds(400,200,200,40);
		t1.setFont (t1.getFont ().deriveFont (20.0f));
		add(t1);

		l2=new JLabel("Last Name:");
		l2.setBounds(150,260,200,40);
		l2.setFont (l2.getFont ().deriveFont (20.0f));
		add(l2);

		t2=new JTextField(str2);
		t2.setBounds(400,260,200,40);
		t2.setFont (t2.getFont ().deriveFont (20.0f));
		add(t2);

		l3=new JLabel("Phone Number:");
		l3.setBounds(150,320,200,40);
		l3.setFont (l3.getFont ().deriveFont (20.0f));
		add(l3);
		t3=new JTextField(str3);
		t3.setBounds(400,320,200,40);
		t3.setFont (t3.getFont ().deriveFont (20.0f));
		add(t3);


		l4=new JLabel("E-Mail:");
		l4.setBounds(150,380,200,40);
		l4.setFont (l4.getFont ().deriveFont (20.0f));
		add(l4);

		t4=new JTextField(str4);
		t4.setBounds(400,380,200,40);
		t4.setFont (t4.getFont ().deriveFont (20.0f));
		add(t4);


		l5=new JLabel("Rooms:");
		l5.setBounds(150,440,200,40);
		l5.setFont (l5.getFont ().deriveFont (20.0f));
		add(l5);

		t5=new JTextField(str5);
		t5.setBounds(400,440,200,40);
		t5.setFont (t5.getFont ().deriveFont (20.0f));
		add(t5);	

		l6=new JLabel("Identification proof:");
		l6.setBounds(150,500,200,40);
		l6.setFont (l6.getFont ().deriveFont (20.0f));
		add(l6);

		t6=new JTextField(str7);
		t6.setBounds(400,500,200,40);
		t6.setFont (t6.getFont ().deriveFont (20.0f));
		add(t6);	

		
		l7=new JLabel("Payment Options:");
		l7.setBounds(150,560,200,40);
		l7.setFont (l7.getFont ().deriveFont (20.0f));
		add(l7);

		t7=new JTextField(str6);
		t7.setBounds(400,560,200,40);
		t7.setFont (t7.getFont ().deriveFont (20.0f));
		add(t7);	


		l8=new JLabel("Total Charges:");
		l8.setBounds(150,620,200,40);
		l8.setFont (l8.getFont ().deriveFont (20.0f));
		add(l8);

		t8=new JTextField(str8);
		t8.setBounds(400,620,200,40);
		t8.setFont (t8.getFont ().deriveFont (20.0f));
		add(t8);	


		b1=new JButton("Confirm Booking");
		b1.setBounds(175,700,180,60);
		b1.setFont (b1.getFont ().deriveFont (20.0f));
		add(b1);
		b2=new JButton("Cancel");
		b2.setBounds(385,700,180,60);
		b2.setFont (b2.getFont ().deriveFont (20.0f));
		add(b2);
		b3=new JButton("Exit");
		b3.setBounds(595,700,180,60);
		b3.setFont (b3.getFont ().deriveFont (20.0f));
		add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		wadapt w1=new wadapt();
		addWindowListener(w1);
	}
 
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b3)
			System.exit(0);
		else if(ae.getSource()==b1)
		{
			Bookstep5 f1=new Bookstep5();
			f1.setTitle("step1");
			f1.setSize(900,900);
			f1.setVisible(true);
			f1.setBackground(Color.pink);
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