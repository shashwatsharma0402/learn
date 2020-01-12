import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MenuAdmin extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b5,b6,bb1,bb2,bb3,bb4,bb5;
	JLabel ta;
	MenuAdmin()
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

		b1=new JButton("NEW BOOKING");
		b1.setBounds(150,150,350,100);
		b1.setFont (b1.getFont ().deriveFont (32.0f));
		b1.setForeground(Color.red);
		add(b1);

		b2=new JButton("UPDATE BOOKING");
		b2.setBounds(150,300,350,100);
		b2.setFont (b2.getFont ().deriveFont (32.0f));
		b2.setForeground(Color.red);
		add(b2);

		b3=new JButton("DELETE BOOKING");
		b3.setBounds(150,450,350,100);
		b3.setFont (b3.getFont ().deriveFont (32.0f));
		b3.setForeground(Color.red);
		add(b3);

		bb1=new JButton("PRINT BILL");
		bb1.setBounds(550,150,350,100);
		bb1.setFont (bb1.getFont ().deriveFont (32.0f));
		bb1.setForeground(Color.red);
		bb1.addActionListener(this);
		add(bb1);

		// bb2=new JButton("UPDATE BILL");
		// bb2.setBounds(550,300,350,100);
		// bb2.setFont (bb2.getFont ().deriveFont (32.0f));
		// bb2.addActionListener(this);
		// add(bb2);


		bb3=new JButton("VIEW BILL");
		bb3.setBounds(550,450,350,100);
		bb3.setFont (bb3.getFont ().deriveFont (32.0f));
		bb3.setForeground(Color.red);
		bb3.addActionListener(this);
		add(bb3);


		// bb4=new JButton("EXTRA BED/BEDS");
		// bb4.setBounds(950,300,350,100);
		// bb4.setFont (bb4.getFont ().deriveFont (32.0f));
		// add(bb4);

		b4=new JButton("PARKING");
		//b4.setBounds(950,150,350,100);
		b4.setBounds(550,300,350,100);
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
		if(ae.getSource()==bb1)
		{
			BillBook f2=new BillBook();
			f2.setTitle("ENTERIES");
			Color c1=new Color(0,76,153);
			f2.getContentPane().setBackground(c1);
			f2.setSize(950,950);
			f2.setVisible(true);
		}

		if(ae.getSource()==bb2)
		{

		}
		if(ae.getSource()==bb3)
		{
			ViewBook f2=new ViewBook();
			f2.setTitle("ENTERIES");
			Color c1=new Color(0,76,153);
			f2.getContentPane().setBackground(c1);
			f2.setSize(950,950);
			f2.setVisible(true);
		}

		if(ae.getSource()==b1)
		{
			Bookstep1 f2=new Bookstep1();
			f2.setTitle("ENTERIES");
			Color c1=new Color(0,76,153);
			f2.getContentPane().setBackground(c1);
			f2.setSize(950,950);
			f2.setVisible(true);
		}
		try{
		if(ae.getSource()==b2)
		{

			UpdateBook f7=new UpdateBook();
			f7.setTitle("Vehicle");
			Color c1=new Color(0,76,153);
			f7.getContentPane().setBackground(c1);
			f7.setSize(950,950);
			f7.setVisible(true);
			f7.setBackground(Color.pink);

			// Bookstep2 f7=new Bookstep2();
			// f7.setTitle("Vehicle");
			// f7.setSize(950,950);
			// f7.setVisible(true);
			// f7.setBackground(Color.pink);
		}
		}catch(Exception e){
		System.out.println("exc"+e);}
		
		if(ae.getSource()==b3)
		{
			DeleteBook f4=new DeleteBook();
			f4.setTitle("Vehicle");
			Color c1=new Color(0,76,153);
			f4.getContentPane().setBackground(c1);
			f4.setSize(950,950);
			f4.setVisible(true);
			f4.setBackground(Color.pink);
		}
		if(ae.getSource()==b4)
		{
			Vehicle f4=new Vehicle();
			f4.setTitle("Vehicle");
			Color c1=new Color(0,76,153);
			f4.getContentPane().setBackground(c1);
			f4.setSize(950,950);
			f4.setVisible(true);
			f4.setBackground(Color.pink);
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
			f1.setVisible(true);
			Color c1=new Color(0,76,153);
			f1.getContentPane().setBackground(c1);
			f1.setBackground(Color.pink);
			dispose();
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