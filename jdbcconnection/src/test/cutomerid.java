package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class cutomerid {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;){
			try {
				System.out.println("enter customer id:");
				String id =s.nextLine();
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "abcd");
				Statement stm=con.createStatement();
				ResultSet rs=stm.executeQuery("select * from customer where id ='"+id+"'");
				if(rs.next()) {
					System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5)
					+"\t"+rs.getString(6)+"\t"+rs.getLong(7));
				}else {
					System.out.println("invalid id ...");
				}
				con.close();
				
				}catch (Exception e) {
					e.printStackTrace();
			}
		
		}
	}
}
