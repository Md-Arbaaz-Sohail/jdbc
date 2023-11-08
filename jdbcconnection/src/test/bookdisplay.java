package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class bookdisplay {
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		try (s;){
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "abcd");
				Statement stm=con.createStatement();
				ResultSet rs =stm.executeQuery("select * from book");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+
				rs.getInt(5));
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
