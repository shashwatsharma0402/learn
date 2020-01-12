import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Bookstep5 extends JFrame implements ActionListener
{
	JButton b1,b2;
	JLabel ta;
	Bookstep5()
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






		JLabel l1=new JLabel("YOUR BOOKING HAS BEEN CONFIRMED");
		l1.setBounds(150,200,600,90);
		l1.setFont (l1.getFont ().deriveFont (32.0f));
		l1.setForeground(Color.yellow);
		add(l1);

		JLabel l2=new JLabel("    THANKS FOR VISITING OUR HOTEL");
		l2.setBounds(150,300,600,90);
		l2.setFont (l2.getFont ().deriveFont (32.0f));
		l2.setForeground(Color.yellow);
		add(l2);

		b1=new JButton("START AGAIN");
		b1.setBounds(200,500,230,60);
		b1.setFont (b1.getFont ().deriveFont (25.0f));
		b1.setForeground(Color.red);
		add(b1);

		b2=new JButton("EXIT");
		b2.setBounds(450,500,200,60);
		b2.setFont (b2.getFont ().deriveFont (25.0f));
		b2.setForeground(Color.red);
		add(b2);
		b2.addActionListener(this);
		wadapt w1=new wadapt();
		addWindowListener(w1);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b2)
			System.exit(0);
		else if(ae.getSource()==b1)
		{
			MainFrame1 f1=new MainFrame1();
			f1.setTitle("step1");
			Color c1=new Color(0,76,153);
			f1.getContentPane().setBackground(c1);
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