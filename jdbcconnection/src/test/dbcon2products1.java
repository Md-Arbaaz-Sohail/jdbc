package test;

import java.sql.*;

public class dbcon2products1 {
public static void main(String[] args)
{
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl"
				,"system","abcd");
		Statement stm=con.createStatement();
		ResultSet rs=stm.executeQuery("select * from products1");
		System.out.println("products details are:");
		
		while (rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+ rs.getString(2)+"\t"+
		rs.getLong(3)+"\t"+rs.getInt(4));
		}
		con.close();
	}
	catch (Exception e) {
	e.printStackTrace();
	}
}
}
