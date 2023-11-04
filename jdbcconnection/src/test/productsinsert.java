package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class productsinsert {
 public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	try(s;) {
		try {
				System.out.println("Enter the product id:");
				int code=s.nextInt();
				s.nextLine();
				System.out.println("Enterthe product name:");
				String name=s.nextLine();
				System.out.println("Enter the product price:");
				long price=s.nextLong();
				System.out.println("Enter the products qunt:");
				int qunty=s.nextInt();
				
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "abcd");
				Statement stm=con.createStatement();
				
				int k= stm.executeUpdate("insert into products1 values('"+code+"','"+name+"','"+ price+"','"+qunty+"')");
				if(k>0) {
					System.out.println("successfull inserted...");
				}
		
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
}
