package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class customerinsert {
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	try (sc;){
		try {
			System.out.println("Enter custemoer id:");
			String id =sc.nextLine();
			System.out.println("Enter customer name:");
			String name=sc.nextLine();
			System.out.println("Enter customer city:");
			String city=sc.nextLine();
			System.out.println("Enter  customer state:");
			String state=sc.nextLine();
			System.out.println("Enter customer pincode");
			int pincode =Integer.parseInt(sc.nextLine());
			System.out.println("Enter customer mailid:");
			String mailid =sc.nextLine();
			System.out.println("Enter customer number :");
			long phno=sc.nextLong();
			
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "abcd");
			Statement stm=con.createStatement();
			int k= stm.executeUpdate("insert into customer values('"+id+"','"+ name+"','"+city+"','"+ state+"','"+ pincode+"','"+ mailid+"','"
					+phno+ "')");
			if(k>0) {
				System.out.println("Customer details inserted successfully");
				
			}
			con.close();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}}
	
}
