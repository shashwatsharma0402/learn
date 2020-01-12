import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class RetryUser extends JFrame implements ActionListener
{
	JLabel l1,ta;
	JButton b1,b2;
	RetryUser()
	{


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








		this.setForeground(Color.yellow);
		this.setLayout(null);
		l1=new JLabel("OOPS! Wrong Username or Password");
		l1.setBounds(150,150,1000,60);
		l1.setForeground(Color.yellow);
		l1.setFont (l1.getFont ().deriveFont (40.0f));
		add(l1);

		b1=new JButton("Retry");
		b1.setBounds(250,400,200,60);
		b1.setFont (b1.getFont ().deriveFont (25.0f));
		b1.setForeground(Color.red);
		add(b1);

		b2=new JButton("Exit");
		b2.setBounds(500,400,200,60);
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
			Username f2=new Username();
			f2.setVisible(true);
			f2.setTitle("Login Window");
			f2.setSize(950,950);
			Color c1=new Color(0,76,153);
			f2.getContentPane().setBackground(c1);
			dispose();
		}
		else
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