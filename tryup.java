import java.awt.*;
import java.awt.event.*;
class up extends Frame 
{
	Button b1;
	String str1,str2,str3,str4,str5,str6,str7,str8,strt;
	TextField tx,t1,t2,t3,t4,t5,t6,t7,t8;
	Label l,l1,l2,l3,l4,l5,l6,l7,l8;
	
	up()
	{
		this.setLayout(null);
		Font font1=new Font("ARIAL",Font.BOLD,30);
		setFont(font1);

		Label lx=new Label("Enter Serial Number");
		lx.setBounds(100,100,400,60);
		add(lx);
		tx=new TextField();
		tx.setBounds(550,100,150,60);
		add(tx);
		strt=t1.getText();
		b1=new Button("Search");
		b1.setBounds(750,100,100,50);
		add(b1);
		wadapt w1=new wadapt();
		addWindowListener(w1);
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