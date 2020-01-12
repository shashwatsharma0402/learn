import java.util.*;
import java.sql.*;

class MainData
{
	public static void main(String args[])
	{
	
		try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","root");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from guest_details");

				while(rs.next())
				{
					System.out.println("HI "+ rs.getString("first_name"));
				}
				
				
			}catch(Exception e)
			{
				System.out.println("EXE  "+e);
			}
	}
}