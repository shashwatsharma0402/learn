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



    	l1=new JLabel("Welcome to Orchard Park hotel bar grill. Orchard Park is a small independent family run hotel in Giffnock, Glasgow."+
						" We aim to offer you comfortable surroundings, great food and excellent service to make your stay truly enjoyable."+
						" Please take a look through our web site where you will find most of the information you need. Call us to discuss your hotel reservation, dining plans or function requirements."+
						"											We look forward to welcoming you soon.												"+
						"												Christopher and Peter Capali														"+" ");

		

	} 
	public void actionPerformed(ActionEvent ae)
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