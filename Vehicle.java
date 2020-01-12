import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class Vehicle extends JFrame implements ActionListener,ItemListener
{
	JLabel l1,l2,l3,l6,l7,l,lab,ta;
	JButton b1,b2,bt1;
	JTextField t1,t2,t3,tab;
	JCheckBox c1,c2;
	JComboBox car;
	String str1,str2,str3,str4,stext,string1,strs;
	Choice ch1;
	Vehicle()
	{	
		Color col1=new Color(0,76,153);

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










		l=new JLabel("VEHICLE ENTRY FORM");
		l.setBounds(300,70,300,40);
		l.setFont (l.getFont ().deriveFont (25.0f));
		l.setForeground(Color.yellow);
		add(l);

		lab=new JLabel("Enter Serial");
		lab.setBounds(200,140,200,40);
		lab.setFont (lab.getFont ().deriveFont (25.0f));
		lab.setForeground(Color.yellow);
		add(lab);

		tab=new JTextField();
		tab.setFont (tab.getFont ().deriveFont (25.0f));
		tab.setBounds(450,140,200,40);
		add(tab);

		l1=new JLabel("Convience");
		l1.setBounds(200,270,200,40);
		l1.setFont (l1.getFont ().deriveFont (25.0f));
		l1.setForeground(Color.yellow);
		add(l1);

		c1=new JCheckBox("Vehicle");
		c1.setBounds(450,270,120,30);
		c1.setFont (c1.getFont ().deriveFont (25.0f));
		c1.setForeground(Color.yellow);
		c1.setBackground(col1);
		add(c1);
		c1.addItemListener(this);
		

		c2=new JCheckBox("No Vehicle");
		c2.setBounds(600,270,200,30);
		c2.setFont (c2.getFont ().deriveFont (25.0f));
		c2.setForeground(Color.yellow);
		c2.setBackground(col1);
		c2.addItemListener(this);
		add(c2);

		l7=new JLabel("No of Vehicle");
		l7.setBounds(200,350,200,40);
		l7.setFont (l7.getFont ().deriveFont (25.0f));
		l7.setForeground(Color.yellow);
		add(l7);

		t1=new JTextField();
		t1.setBounds(450,350,200,40);
		t1.setFont (t1.getFont ().deriveFont (25.0f));
		add(t1);

		l6=new JLabel("Type of Vehicle");
		l6.setBounds(200,410,200,40);
		l6.setFont (l6.getFont ().deriveFont (25.0f));
		l6.setForeground(Color.yellow);
		add(l6);


		String[] cars = {"--select--", "Hatchback", "Sedan","SUV","HDV"};
		car = new JComboBox(cars);
		car.setBounds(450,410,200,40);
		car.setFont (car.getFont ().deriveFont (20.0f));
		car.setForeground(Color.yellow);
		car.setBackground(col1);
		add(car);
		str2= (String)car.getSelectedItem();
		System.out.println("String  "+str2);


		l2=new JLabel("Model");
		l2.setBounds(200,470,200,40);
		l2.setFont (l2.getFont ().deriveFont (25.0f));
		l2.setForeground(Color.yellow);
		add(l2);

		t2=new JTextField();
		t2.setBounds(450,470,200,40);		
		t2.setFont (t2.getFont ().deriveFont (25.0f));
		add(t2);

		l3=new JLabel("Plate Number");
		l3.setBounds(200,520,200,40);
		l3.setFont (l3.getFont ().deriveFont (25.0f));
		l3.setForeground(Color.yellow);
		add(l3);

		t3=new JTextField();
		t3.setBounds(450,520,200,40);
		t3.setFont (t3.getFont ().deriveFont (25.0f));
		add(t3);
		
		
		b1=new JButton("Submit");
		b2=new JButton("Cancel");
		b1.setBounds(300,760,150,50);
		b1.setForeground(Color.red);
		b1.setFont (b1.getFont ().deriveFont (25.0f));
		add(b1);
		add(b2);
		b2.setBounds(500,760,150,50);
		b2.setFont (b2.getFont ().deriveFont (25.0f));
		b2.setForeground(Color.red);
		b1.addActionListener(this);
		b2.addActionListener(this);
		// ch1.addActionListener(this);
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
				ResultSet rs=st.executeQuery("select * from vehicle");

				strs=tab.getText();
				str1=t1.getText();
				str2=(String)car.getSelectedItem();
				str3=t2.getText();
				str4=t3.getText();
				st.executeUpdate("Insert into vehicle  (serial_number,vehicle_num,vehicle_type,model,plate_num) values ('"+strs+"','"+str1+"','"+str2+"','"+str3+"','"+str4+"')");

			}catch(Exception e)
			{
				System.out.println("EXE  "+e);
			}



			MainFrame1 f2=new MainFrame1();
			f2.setVisible(true);
			Color c1=new Color(0,76,153);
			f2.getContentPane().setBackground(c1);
			f2.setTitle("Login Window");
			f2.setSize(950,950);
			f2.setBackground(Color.pink);
		}
		else if(ae.getSource()==b2) 
			System.exit(0);


			String str = ae.getActionCommand();
    if(str.equals("Close"))
      System.exit(0);
    else if(str.equals("Today"))
      ta.setText("Today: " + new java.util.Date());
		
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==c2)
		{
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

