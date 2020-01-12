import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MainFrame1 extends JFrame implements ActionListener
{ 
	JLabel l1,l2,ta;
	JButton b1,b2,b3;
	MainFrame1()
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

		b1=new JButton("Proceed With Booking");
		b2=new JButton("Enter as User");
		b3=new JButton("EXIT");
		b1.setBounds(320,350,500,70);
		b1.setFont (b1.getFont ().deriveFont (32.0f));
		//b1.setFont(new Font("Serif",Font.BOLD,64));
		b1.setForeground(Color.red);
		add(b1);

		// b2.setBounds(320,450,300,70);
		// b2.setFont (b2.getFont ().deriveFont (32.0f));
		// b2.setForeground(Color.red);
		// add(b2);

		b3.setBounds(410,450,300,70);
		b3.setFont (b3.getFont ().deriveFont (32.0f));
		b3.setForeground(Color.red);
		add(b3);
		
	
		l1=new JLabel("WELCOME TO THE HOTEL RESERVATION SERVICE");
		l1.setFont(new Font("Serif",Font.BOLD,64));
		l1.setForeground(Color.yellow);
		l1.setBackground(Color.yellow);
		//l1.getContentPane().setBackground(Color.yellow);
		l2=new JLabel("HOTEL ORCHID");
		//l1.setFont (l1.getFont ().deriveFont (32.0f));
		l2.setFont (l2.getFont ().deriveFont (32.0f));
		l2.setBounds(250,220,650,80);
		l2.setFont(new Font("Serif",Font.BOLD,64));
		l2.setForeground(Color.yellow);
		l1.setBounds(100,100,950,80);
		add(l1);
		add(l2);
		
		b1.addActionListener(this);
		//b2.addActionListener(this);
		b3.addActionListener(this);
		wadapt w1=new wadapt();
		addWindowListener(w1);
		madapt m1=new madapt();
		addMouseListener(m1);

	} 
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			if(ae.getSource()==b1)
			{	
				Username f_user=new Username();
				f_user.setVisible(true);
				f_user.setTitle("Login Window");
				f_user.setSize(950,950);
				Color c1=new Color(0,76,153);
				f_user.getContentPane().setBackground(c1);
			}
		}
		catch(Exception e)
		{System.out.println("EXE  "+e);}
		
		if(ae.getSource()==b3)
			System.exit(0);






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
		public void windowDeactivated(WindowEvent we)
		{
			setBackground(Color.orange);
		}
		public void windowActivated(WindowEvent we)
		{
			setBackground(Color.pink);
		}
	}
	class madapt extends MouseAdapter
	{
		public void mouseClicked(MouseEvent me)
		{
			setBackground(Color.white);
		}
	}
}

public class MainFrame
{
	public static void main(String args[])
	{
		MainFrame1 frame=new MainFrame1();
		
		Color c1=new Color(0,76,153);
		frame.getContentPane().setBackground(c1);
		frame.setSize(950,950);
		frame.setVisible (true);
	}
}