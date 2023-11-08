package test;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.*;
public class productid {
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	try (s;){
		try{
			System.out.println("Enter the produdt id:");
			int code=s.nextInt();
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "abcd");

			Statement stm= con.createStatement();
			ResultSet rs= stm.executeQuery("select * from products1 where code ='"+code+"'");
			if(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+ rs.getString(2)+"\t"+rs.getInt(3)+"\t"+
			rs.getInt(4));
			}else {
				System.out.println("products number is invalid...");
			}
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
}
