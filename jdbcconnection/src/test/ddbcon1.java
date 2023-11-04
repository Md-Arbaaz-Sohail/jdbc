package test;
import java.sql.*;

public class ddbcon1 {

	public static void main(String[] args)
	{
		try {
			//1 loadding driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//creating connection
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
					"system", "abcd");
			//preparing statement
			Statement stm=con.createStatement();
			//executing qurey
			ResultSet rs=stm.executeQuery("select * from customer");
		     System.out.println("customer ddetails are:");
		     while(rs.next()) {
		    	 System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+
		    			 "\t"+rs.getString(4)+"\t"+rs.getInt(5)+"\t"+rs.getString(6)+"\t"+
		    			 rs.getLong(7));
		     }
		     //closing connection
		     con.close();
		}
		catch(Exception e){
			e.printStackTrace();
			}

	}

}
